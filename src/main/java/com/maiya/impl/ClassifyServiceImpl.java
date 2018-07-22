package com.maiya.impl;

import com.maiya.bean.Classify;
import com.maiya.dao.ClassifyMapper;
import com.maiya.service.ClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("classifyService")
public class ClassifyServiceImpl implements ClassifyService {
    @Resource
    private ClassifyMapper dao;

    public int deleteByPrimaryKey(Long classifyId) {
        return dao.deleteByPrimaryKey(classifyId);
    }

    public int insert(Classify record) {
        return dao.insert(record);
    }

    public int insertSelective(Classify record) {
        return dao.insertSelective(record);
    }

    public Classify selectByPrimaryKey(Long classifyId) {
        return dao.selectByPrimaryKey(classifyId);
    }

    public int updateByPrimaryKeySelective(Classify record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Classify record) {
        return dao.updateByPrimaryKey(record);
    }

    public List<Object> selectAll(HashMap<String, Object> parameters) {
        return dao.selectAll(parameters);
    }
}
