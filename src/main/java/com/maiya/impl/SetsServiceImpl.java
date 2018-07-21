package com.maiya.impl;

import com.maiya.bean.Sets;
import com.maiya.dao.SetsMapper;
import com.maiya.service.SetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("setsService")
public class SetsServiceImpl implements SetsService {
    @Resource
    private SetsMapper dao;

    public int deleteByPrimaryKey(Long setsId) {
        return dao.deleteByPrimaryKey(setsId);
    }

    public int insert(Sets record) {
        return dao.insert(record);
    }

    public int insertSelective(Sets record) {
        return dao.insertSelective(record);
    }

    public Sets selectByPrimaryKey(Long setsId) {
        return dao.selectByPrimaryKey(setsId);
    }

    public int updateByPrimaryKeySelective(Sets record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sets record) {
        return dao.updateByPrimaryKey(record);
    }

    public List<Object> selectAllSets(HashMap<String, Object> parameters) {
        return dao.selectAllSets(parameters);
    }
}
