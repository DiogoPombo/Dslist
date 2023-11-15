package com.pombo.java.dslistpombo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pombo.java.dslistpombo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
