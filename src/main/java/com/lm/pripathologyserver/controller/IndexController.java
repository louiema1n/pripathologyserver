package com.lm.pripathologyserver.controller;

import com.lm.pripathologyserver.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Program: pripathologyserver
 * @Type: Class
 * @Description: index
 * @Author: louiemain
 * @Created: 2018-04-09 11:12
 **/
@Controller
public class IndexController {

    @Autowired
    private UpdateService updateService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("upds", this.updateService.getAll());

        return "index";
    }
}
