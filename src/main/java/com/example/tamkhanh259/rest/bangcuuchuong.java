package com.example.tamkhanh259.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.stream.IntStream;

@Controller
public class bangcuuchuong {
    @GetMapping("/hien-thi/{x}")
    public String hienthi(@PathVariable int x, Model model) {
        model.addAttribute("number", x);
        model.addAttribute("sequence", IntStream.rangeClosed(1, 10).toArray());

        return "bang-cuu-chuong";
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
