package com.lm.pripathologyserver.service;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 9:03
 */

import com.lm.pripathologyserver.domain.Exam;
import com.lm.pripathologyserver.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Pragram: pripathologyserver
 * @Type: Class
 * @Description: examService
 * @Author: louiemain
 * @Created: 2018/4/1 9:03
 **/
@Service
public class ExamService {

    @Autowired
    private ExamMapper examMapper;

    public List<Exam> queryAll() {
        return this.examMapper.selectAll();
    }
}
