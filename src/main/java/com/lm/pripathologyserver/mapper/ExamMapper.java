package com.lm.pripathologyserver.mapper;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 8:58
 */

import com.lm.pripathologyserver.domain.Exam;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Pragram: pripathologyserver
 * @Type: Interface
 * @Description: exam mapper
 * @Author: louiemain
 * @Created: 2018/4/1 8:58
 **/
public interface ExamMapper {
    @Select("select * from exam")
    @Results(value = {
            @Result(column = "rid", property = "rid"),
            @Result(column = "rid", property = "radio", one = @One(select = "com.lm.pripathologyserver.mapper.RadioMapper.selectById"))
    }
    )
    List<Exam> selectAll();
}
