package com.armamentarium.Armamentarium.controllers;

import com.armamentarium.Armamentarium.models.Weapon;
import com.armamentarium.Armamentarium.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WeaponController {

    @Autowired
    private WeaponRepository repository;

    @GetMapping("/weapon")
    public String index() {
        return "Greetings armory app from DQ";
    }

    @PostMapping("/weapon")
    public Weapon saveWeapon(@RequestBody Weapon weapon) {
        return repository.save(weapon);
    }

    @GetMapping("/weapons")
    public List<Weapon> getWeapons() {
        return repository.findAll();
    }

    @GetMapping("/weapons/sabre")
    public List<Weapon> getSabre() {
        return repository.findByWeapon("sabre");
    }

    @GetMapping("/weapons/foil")
    public List<Weapon> getFoil() {
        return repository.findByWeapon("foil");
    }

    @GetMapping("/weapons/epee")
    public List<Weapon> getEpee() {
        return repository.findByWeapon("epee");
    }

    @GetMapping("/weapon/{id}")
    public Optional<Weapon> getWeapon(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @DeleteMapping("/weapon/{id}")
    public void removeWeapon(@PathVariable Integer id) {
        Weapon weapon = repository.getOne(id);
        repository.deleteById(weapon.getId());
    }

}
