package com.ssm.maven.core.mapper;

import com.ssm.maven.core.domain.Studentpageifo;
import com.ssm.maven.core.domain.StudentpageifoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentpageifoMapper {
    int countByExample(StudentpageifoExample example);

    int deleteByExample(StudentpageifoExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Studentpageifo record);

    int insertSelective(Studentpageifo record);

    List<Studentpageifo> selectByExample(StudentpageifoExample example);

    Studentpageifo selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Studentpageifo record, @Param("example") StudentpageifoExample example);

    int updateByExample(@Param("record") Studentpageifo record, @Param("example") StudentpageifoExample example);

    int updateByPrimaryKeySelective(Studentpageifo record);

    int updateByPrimaryKey(Studentpageifo record);

	int linkAS(@Param("pId")Integer pId, @Param("abId")Integer id);

	List<Integer> selectPidByabId(Integer abId);


}