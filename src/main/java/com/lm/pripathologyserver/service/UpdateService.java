package com.lm.pripathologyserver.service;

import com.lm.pripathologyserver.domain.Update;
import com.lm.pripathologyserver.mapper.UpdateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: pripathologyserver
 * @Type: Class
 * @Description: update
 * @Author: louiemain
 * @Created: 2018-04-09 10:53
 **/
@Service
public class UpdateService {

    @Autowired
    private UpdateMapper updateMapper;

    public List<Update> getAll() {
        return this.updateMapper.selectAll();
    }

    public Update getLastOne() {
        return this.updateMapper.selectLastOne();
    }

    public int addOne(Update update) {
        return this.updateMapper.insertOne(update);
    }
}
