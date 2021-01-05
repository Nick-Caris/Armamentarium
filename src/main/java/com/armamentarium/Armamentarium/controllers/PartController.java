package com.armamentarium.Armamentarium.controllers;

import com.armamentarium.Armamentarium.models.Part;
import com.armamentarium.Armamentarium.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PartController {

    @Autowired
    private PartRepository repository;

    @GetMapping("/part")
    public String index() {
        return "Greetings armory app from DQ";
    }

    @PostMapping("/part")
    public Part savePart(@RequestBody Part part) {
        return repository.save(part);
    }

    @GetMapping("/parts")
    public List<Part> getParts() {
        return repository.findAll();
    }

    @GetMapping("/parts/sabre")
    public List<Part> getSabre() {
        return repository.findByWeapons("sabre");
    }

    @GetMapping("/parts/foil")
    public List<Part> getFoil() {
        return repository.findByWeapons("foil");
    }

    @GetMapping("/parts/epee")
    public List<Part> getEpee() {
        return repository.findByWeapons("epee");
    }

    @GetMapping("/part/{id}")
    public Optional<Part> getPart(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @DeleteMapping("/part/{id}")
    public List<Part> removeWeapon(@PathVariable Integer id) {
        Part part = repository.getOne(id);
        repository.deleteById(part.getId());
        return getParts();
    }
}
