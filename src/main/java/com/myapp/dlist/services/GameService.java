package com.myapp.dlist.services;

import com.myapp.dlist.dto.GameDto;
import com.myapp.dlist.dto.GameMinDto;
import com.myapp.dlist.entities.Game;
import com.myapp.dlist.projections.GameMinProjection;
import com.myapp.dlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        List<GameMinProjection> games = gameRepository.searchGameList(listId);
        return games.stream().map(GameMinDto::new).toList();
    }
    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }


}
