package com.armamentarium.Armamentarium.repositories;

import com.armamentarium.Armamentarium.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PartRepository extends JpaRepository<Part, Integer> {

    Optional<Part> findById(Integer id);

    List<Part> findByWeapon(String weapon);
}
