package com.pombo.java.dslistpombo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pombo.java.dslistpombo.dto.GameMinDTO;
import com.pombo.java.dslistpombo.entities.Game;
import com.pombo.java.dslistpombo.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
			List<Game> result = gameRepository.findAll();
			return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		}
		
	}
	

