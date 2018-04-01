package com.lm.pripathologyserver.service;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 9:22
 */

import com.lm.pripathologyserver.domain.TopicRecord;
import com.lm.pripathologyserver.mapper.TopicRecordMapppper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Pragram: pripathologyserver
 * @Type: Class
 * @Description: TopicRecord
 * @Author: louiemain
 * @Created: 2018/4/1 9:22
 **/
@Service
public class TopicRecordService {

    @Autowired
    private TopicRecordMapppper topicRecordMapppper;

    public Integer insertTopicRecords(List<TopicRecord> topicRecords) {
        int rows = 0;
        if (topicRecords != null && topicRecords.size() > 0) {
            for (TopicRecord tr : topicRecords
                 ) {
                if (this.topicRecordMapppper.insertOne(tr) > 0) {
                    rows++;
                }
            }
        }
        return rows;
    }

    public List<TopicRecord> queryAll() {
        return this.topicRecordMapppper.selectAll();
    }
}
