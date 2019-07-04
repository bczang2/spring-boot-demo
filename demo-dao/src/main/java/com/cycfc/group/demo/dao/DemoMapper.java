package com.cycfc.group.demo.dao;

import com.cycfc.group.demo.entity.persistent.Demo;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}