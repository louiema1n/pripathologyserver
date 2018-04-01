package com.lm.pripathologyserver.domain;

import java.sql.Timestamp;

/**
 * @Program: topicRecord
 * @Type: Class
 * @Description:
 * @Author: louiemain
 * @Created: 2018-03-29 16:10
 **/
public class TopicRecord {
    private int id;
    private String name;
    private int number;
    private String rightAnswer;
    private Timestamp time;
    private String selectAnswer;
    private int target;

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getSelectAnswer() {
        return selectAnswer;
    }

    public void setSelectAnswer(String selectAnswer) {
        this.selectAnswer = selectAnswer;
    }
}
