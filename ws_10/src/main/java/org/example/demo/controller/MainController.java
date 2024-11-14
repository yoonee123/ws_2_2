package org.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/main")
@Controller
public class MainController {

    @RequestMapping("")
    public String viewMain(Model model) {
        //model.addAttribute("message", "안녕하세요");

        return "main";
    }

    @RequestMapping("/dashboard")
    public String viewDashboard() {

        return "dashboard.html";
    }

}
