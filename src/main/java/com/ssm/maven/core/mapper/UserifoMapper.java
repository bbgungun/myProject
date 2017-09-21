package com.ssm.maven.core.mapper;

import com.ssm.maven.core.domain.Userifo;
import com.ssm.maven.core.domain.UserifoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserifoMapper {
    int countByExample(UserifoExample example);

    int deleteByExample(UserifoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Userifo record);

    int insertSelective(Userifo record);

    List<Userifo> selectByExample(UserifoExample example);

    Userifo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Userifo record, @Param("example") UserifoExample example);

    int updateByExample(@Param("record") Userifo record, @Param("example") UserifoExample example);

    int updateByPrimaryKeySelective(Userifo record);

    int updateByPrimaryKey(Userifo record);
}