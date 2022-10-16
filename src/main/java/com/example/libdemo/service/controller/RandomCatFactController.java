package com.example.libdemo.service.controller;

import com.example.libdemo.service.handler.GetRandomCatFactHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor // mark fields with final !!!!!
public class RandomCatFactController {

    private final GetRandomCatFactHandler indexHandler;

    @RequestMapping(value = "/")
    public String index(final Model model) {
        model.addAttribute("catfact", indexHandler.getRandomCatFact());
        return "index";
    }
}
