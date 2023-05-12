package com.myapp.dlist.services;

import com.myapp.dlist.dto.GameMinDto;
import com.myapp.dlist.entities.Game;
import com.myapp.dlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;



    public List<GameMinDto> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}
