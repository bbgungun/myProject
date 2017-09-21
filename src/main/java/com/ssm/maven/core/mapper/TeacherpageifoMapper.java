package com.ssm.maven.core.mapper;

import com.ssm.maven.core.domain.Teacherpageifo;
import com.ssm.maven.core.domain.TeacherpageifoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TeacherpageifoMapper {
    int countByExample(TeacherpageifoExample example);

    int deleteByExample(TeacherpageifoExample example);

    int deleteByPrimaryKey(Integer teacherpageifoId);

    int insert(Teacherpageifo record);

    int insertSelective(Teacherpageifo record);

    List<Teacherpageifo> selectByExample(TeacherpageifoExample example);

    Teacherpageifo selectByPrimaryKey(Integer teacherpageifoId);

    int updateByExampleSelective(@Param("record") Teacherpageifo record, @Param("example") TeacherpageifoExample example);

    int updateByExample(@Param("record") Teacherpageifo record, @Param("example") TeacherpageifoExample example);

    int updateByPrimaryKeySelective(Teacherpageifo record);

    int updateByPrimaryKey(Teacherpageifo record);

	int linkAT(@Param("pId")Integer pId, @Param("abId")Integer id);

	List<Integer> selectPidByabId(Integer abId);
}