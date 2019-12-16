package com.armamentarium.Armamentarium.controllers;

import com.armamentarium.Armamentarium.models.Part;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartController {

    @RequestMapping("/")
    public String index() {
        return "Greetings armory app from DQ";
    }

    @RequestMapping()
    public Part getPart(Integer id) {
        return new Part();
    }

}
