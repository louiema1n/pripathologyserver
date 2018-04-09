package com.lm.pripathologyserver.mapper;

import com.lm.pripathologyserver.domain.Update;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Program: pripathologyserver
 * @Type: Interface
 * @Description: mapper
 * @Author: louiemain
 * @Create: 2018-04-09 10:46
 **/
public interface UpdateMapper {

    @Select("select * from upd order by serverVersion desc")
    List<Update> selectAll();

    @Insert("INSERT INTO upd " +
            "(" +
            "appname," +
            "serverVersion," +
            "lastForce," +
            "updateurl," +
            "upgradeinfo)" +
            " VALUES " +
            "(#{appname}," +
            "#{serverVersion}," +
            "#{lastForce}," +
            "#{updateurl}," +
            "#{upgradeinfo})")
    Integer insertOne(Update update);

    @Select("select * from upd WHERE id = (select max(id) from upd)")
    Update selectLastOne();
}
