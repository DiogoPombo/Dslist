package com.pombo.java.dslistpombo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pombo.java.dslistpombo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
