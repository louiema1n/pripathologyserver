package com.lm.pripathologyserver.mapper;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 9:16
 */

import com.lm.pripathologyserver.domain.TopicRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Pragram: pripathologyserver
 * @Type: Interface
 * @Description: TopicRecord
 * @Author: louiemain
 * @Created: 2018/4/1 9:16
 **/
public interface TopicRecordMapppper {

    @Select("select * from topic_record")
    List<TopicRecord> selectAll();

    @Insert("INSERT INTO 'topic_record'" +
            "('name'," +
            "'number'," +
            "'rightAnswer'," +
            "'time'," +
            "'target'," +
            "'selectAnswer')" +
            "VALUES" +
            "(#{name}," +
            "#{number}," +
            "#{rightAnswer}," +
            "#{time}," +
            "#{target}," +
            "#{selectAnswer});")
    Integer insertOne(TopicRecord topicRecord);
}
