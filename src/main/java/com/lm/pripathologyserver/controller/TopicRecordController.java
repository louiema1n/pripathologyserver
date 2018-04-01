package com.lm.pripathologyserver.controller;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 9:25
 */

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lm.pripathologyserver.domain.TopicRecord;
import com.lm.pripathologyserver.service.TopicRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Pragram: pripathologyserver
 * @Type: Class
 * @Description: TopicRecord
 * @Author: louiemain
 * @Created: 2018/4/1 9:25
 **/
@RestController
@RequestMapping("/tr")
public class TopicRecordController {

    @Autowired
    private TopicRecordService topicRecordService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Integer addTopicRecords(@RequestParam("json") String jsonStr) {
        ObjectMapper objectMapper = new ObjectMapper();
        // 获取TopicRecord对应的javaType
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, TopicRecord.class);
        try {
            List<TopicRecord> topicRecords = objectMapper.readValue(jsonStr, javaType);
            return this.topicRecordService.insertTopicRecords(topicRecords);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<TopicRecord> getAll() {
        return this.topicRecordService.queryAll();
    }
}
