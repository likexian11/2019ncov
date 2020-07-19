package com.fkr.ncov.ncov2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ncov2019
 * @description: 页面跳转
 * @author: herongjian
 * @create: 2020-02-08 17:34
 **/
@Controller
public class PageController {

    @RequestMapping("/")
    public String ncov(Model model) {
        return "index";
    }

    @RequestMapping("/link")
    public String link(Model model) {
        return "link";
    }

    @RequestMapping("/news")
    public String news(Model model) {
        return "news";
    }

    @RequestMapping("/rumors")
    public String rumors(Model model) {
        return "rumors";
    }

    @RequestMapping("/sars")
    public String sars(Model model) {
        return "sars";
    }

    @RequestMapping("/statement")
    public String statement(Model model) {
        return "statement";
    }

}
