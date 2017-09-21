package com.ssm.maven.core.mapper;

import com.ssm.maven.core.domain.AlumniBookifo;
import com.ssm.maven.core.domain.AlumniBookifoExample;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AlumniBookifoMapper {
    int countByExample(AlumniBookifoExample example);

    int deleteByExample(AlumniBookifoExample example);

    int deleteByPrimaryKey(Integer abId);

    int insert(AlumniBookifo record);

    int insertSelective(AlumniBookifo record);

    List<AlumniBookifo> selectByExample(AlumniBookifoExample example);

    AlumniBookifo selectByPrimaryKey(Integer abId);

    int updateByExampleSelective(@Param("record") AlumniBookifo record, @Param("example") AlumniBookifoExample example);

    int updateByExample(@Param("record") AlumniBookifo record, @Param("example") AlumniBookifoExample example);

    int updateByPrimaryKeySelective(AlumniBookifo record);

    int updateByPrimaryKey(AlumniBookifo record);

	int linkUA(@Param("abId")Integer abId,@Param("userId")Integer id );

	ArrayList<Integer> selectByUserId(Integer id);

	int linkAM(@Param("abId")Integer abId,@Param("modelsId") Integer modelsId);
}