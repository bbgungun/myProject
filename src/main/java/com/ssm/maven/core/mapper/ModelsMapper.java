package com.ssm.maven.core.mapper;

import com.ssm.maven.core.domain.AlumniBookifo;
import com.ssm.maven.core.domain.Models;
import com.ssm.maven.core.domain.ModelsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ModelsMapper {
    int countByExample(ModelsExample example);

    int deleteByExample(ModelsExample example);

    int deleteByPrimaryKey(Integer modelsId);

    int insert(Models record);

    int insertSelective(Models record);

    List<Models> selectByExample(ModelsExample example);

    Models selectByPrimaryKey(Integer modelsId);

    int updateByExampleSelective(@Param("record") Models record, @Param("example") ModelsExample example);

    int updateByExample(@Param("record") Models record, @Param("example") ModelsExample example);

    int updateByPrimaryKeySelective(Models record);

    int updateByPrimaryKey(Models record);
    
    List<Models> selectByAbId(Integer ab_id);
}