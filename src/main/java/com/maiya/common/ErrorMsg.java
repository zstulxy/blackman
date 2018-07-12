package com.maiya.common;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;

public class ErrorMsg {
	
	private static final Logger logger = Logger.getLogger(ErrorMsg.class);
	private final String[] errorMsgs_ = {
			"success",
			"jdbc connected error",

			"register error: user_id has exist",
			"register error: user_name has exist",
			"register error: insert operator error",

			"login error: user_id error",
			"login error: password error",
			
			"favorite table select error"
			};

	private final Integer[] errorCodes_ = { 0, 2001,

			3001, 3002, 3003,

			4001, 4002,
			5001};

	public ErrorMsg() {

	}

	public static HashMap<String, Object> ExtendsErrorResult(String message) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorcode", 1);
		hashMap.put("errormsg", message);
		return hashMap;
	}

	public static HashMap<String, Object> ExtendsSuccessResult(String message) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorcode", 0);
		hashMap.put("errormsg", message);
		return hashMap;
	}


	
	public HashMap<String, Object> ErrorCodeMsg(ErrorCode errCodesIndex, List<String> value) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorcode", errCodesIndex.getIndex());
		hashMap.put("errormsg", errCodesIndex.getName());
		hashMap.put("data", value);
		return hashMap;
	}
	
	public HashMap<String, Object> ErrorCodeMsg(ErrorCode errCodesIndex) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorcode", errCodesIndex.getIndex());
		hashMap.put("errormsg", errCodesIndex.getName());
		return hashMap;
	}
	
	public HashMap<String, Object> ErrorCodeMsgForInt(ErrorCode errCodesIndex, List<Integer> value) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorcode", errCodesIndex.getIndex());
		hashMap.put("errormsg", errCodesIndex.getName());
		hashMap.put("data", value);
		return hashMap;
	}
}
