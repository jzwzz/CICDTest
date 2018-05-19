package com.jzwzz.demo.cicd.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("hello");

        List<String> resultList = new ArrayList<>();
        resultList.add("v0.1");

        modelAndView.addObject("resultList", resultList);
        return modelAndView;
    }
}
