package com.example.studentapp.controller;

import com.example.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("students", service.getAll());
        return "students";
    }

    @PostMapping("/add")
    public String add(@RequestParam String name) {
        service.add(name);
        return "redirect:/";
    }
}