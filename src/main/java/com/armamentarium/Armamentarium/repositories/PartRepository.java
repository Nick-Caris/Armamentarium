package com.armamentarium.Armamentarium.repositories;

import com.armamentarium.Armamentarium.models.Part;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartRepository {

    Optional<Part> findById(Integer id);
}
