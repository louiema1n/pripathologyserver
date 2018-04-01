package com.lm.pripathologyserver.controller;/**
 * @description
 * @author&date Created by louiemain on 2018/4/1 9:04
 */

import com.lm.pripathologyserver.domain.Exam;
import com.lm.pripathologyserver.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Pragram: pripathologyserver
 * @Type: Class
 * @Description: examController
 * @Author: louiemain
 * @Created: 2018/4/1 9:04
 **/
@RestController
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Exam> getAll() {
        return this.examService.queryAll();
    }
}
