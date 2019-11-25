package com.armamentarium.Armamentarium.controllers;

import com.armamentarium.Armamentarium.models.Weapon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeaponController {

    @RequestMapping("/")
    public String index() {
        return "Greetings armory app from DQ";
    }

    @RequestMapping()
    public Weapon getWeapon(Integer id) {
        return new Weapon();
    }

}
