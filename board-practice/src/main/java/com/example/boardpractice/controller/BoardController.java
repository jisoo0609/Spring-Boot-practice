package com.example.boardpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/content")
public class BoardController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home() {
        return "list";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

}
