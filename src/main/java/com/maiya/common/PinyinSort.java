package com.maiya.common;

import java.util.*;
import java.util.Map.Entry;

public class PinyinSort {

	public PinyinSort() {
		// TODO Auto-generated constructor stub
	}

	private char[] chartable = { '啊', '芭', '擦', '搭', '蛾', '发', '噶', '哈', '哈', '击', '喀', '垃', '妈', '拿', '哦', '啪', '期',
			'然', '撒', '塌', '塌', '塌', '挖', '昔', '压', '匝', '座' };
	private char[] alphatableb = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private char[] alphatables = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	private int[] table = new int[27];
	{
		for (int i = 0; i < 27; ++i) {
			table[i] = gbValue(chartable[i]);
		}
	}

	public char Char2Alpha(char ch, String type) {
		if (ch >= 'a' && ch <= 'z')
			return (char) (ch - 'a' + 'A');
		// return ch;
		if (ch >= 'A' && ch <= 'Z')
			return ch;

		int gb = gbValue(ch);
		if (gb < table[0])
			return '0';

		int i;
		for (i = 0; i < 26; ++i) {
			if (match(i, gb))
				break;
		}

		if (i >= 26) {
			return '0';
		} else {
			if ("b".equals(type)) {
				return alphatableb[i];
			} else {
				return alphatables[i];
			}
		}
	}

	public String String2Alpha(String SourceStr, String type) {
		String Result = "";
		int StrLength = SourceStr.length();
		int i;
		try {
			for (i = 0; i < StrLength; i++) {
				Result += Char2Alpha(SourceStr.charAt(i), type);
			}
		} catch (Exception e) {
			Result = "";
		}
		return Result;
	}

	public String String2AlphaFirst(String SourceStr, String type) {
		String Result = "";
		try {
			Result += Char2Alpha(SourceStr.charAt(0), type);
		} catch (Exception e) {
			Result = "";
		}
		return Result;
	}

	private boolean match(int i, int gb) {
		if (gb < table[i])
			return false;
		int j = i + 1;

		while (j < 26 && (table[j] == table[i]))
			++j;
		if (j == 26)
			return gb <= table[j];
		else
			return gb < table[j];
	}

	private int gbValue(char ch) {
		String str = new String();
		str += ch;
		try {
			byte[] bytes = str.getBytes("GBK");
			if (bytes.length < 2)
				return 0;
			return (bytes[0] << 8 & 0xff00) + (bytes[1] & 0xff);
		} catch (Exception e) {
			return 0;
		}
	}

	public Map sort(List list) {
		Map map = new HashMap();
		List arraylist = new ArrayList();
		String[] alphatableb = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (String a : alphatableb) {
			for (int i = 0; i < list.size(); i++) {
				if (a.equals(String2AlphaFirst(list.get(i).toString(), "b"))) {
					arraylist.add(list.get(i).toString());
				}
			}
			map.put(a, arraylist);
			arraylist = new ArrayList();
		}
		return map;
	}

	public Map sortMap(Map<String, String> mapParams) {
		Map map = new HashMap();
		List arrayList = new ArrayList();

		String[] alphatableb = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (String a : alphatableb) {
			Iterator<Entry<String, String>> iter = mapParams.entrySet().iterator();
			while (iter.hasNext()) {
				Map keyMap = new HashMap();
				Entry entry = (Entry) iter.next();
				Object key = entry.getKey();
				Object val = entry.getValue();
				if (a.equals(String2AlphaFirst(key.toString(), "b"))) {
					List arrayListTmp = new ArrayList();
					keyMap.put("name", key.toString());
					keyMap.put("address", val.toString());
					arrayList.add(keyMap);
				}
			}
			map.put(a, arrayList);
			arrayList = new ArrayList();
		}
		return map;
	}
}
