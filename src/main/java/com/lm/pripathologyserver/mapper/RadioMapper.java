package com.lm.pripathologyserver.mapper;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 9:02
 */

import com.lm.pripathologyserver.domain.Radio;
import org.apache.ibatis.annotations.Select;

/**
 * @Pragram: pripathologyserver
 * @Type: Class
 * @Description: radioMapper
 * @Author: louiemain
 * @Created: 2018/4/1 9:02
 **/
public interface RadioMapper {

    @Select("select * from radio where id = #{id}")
    Radio selectById(int id);
}
