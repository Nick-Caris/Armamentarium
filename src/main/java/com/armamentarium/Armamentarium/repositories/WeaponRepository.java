package com.armamentarium.Armamentarium.repositories;

import com.armamentarium.Armamentarium.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Integer> {

    Optional<Weapon> findById(Integer id);

    List<Weapon> findByWeapon(String weapon);
}
