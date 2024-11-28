package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/main")
@Controller
public class MainController {

//    @Autowired
//    private MemberService memberService;

    private final MemberService memberService;

    public MainController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("")
    public String viewMain(@RequestParam(value = "msg", required = false) String msg, Model model) {
        model.addAttribute("msg", msg);
        return "main"; // View 이름
    }

    @GetMapping("/{type}")
    public String viewMain2(@PathVariable("type") String type, Model model) {
        model.addAttribute("msg", "타입은 "+ type);
        return "main"; // View 이름
    }

    @PostMapping("")
    public String viewMain3(@RequestParam("name") String name, Model model) {
        model.addAttribute("msg", "이름은 "+ name);
        return "main"; // View 이름
    }
}
