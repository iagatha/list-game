package com.myapp.dlist.services;

import com.myapp.dlist.dto.GameDto;
import com.myapp.dlist.dto.GameListDto;
import com.myapp.dlist.dto.GameMinDto;
import com.myapp.dlist.entities.Game;
import com.myapp.dlist.entities.GameList;
import com.myapp.dlist.repositories.GameListRepository;
import com.myapp.dlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository  gameListRepository;



    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        var result = gameListRepository.findAll();
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;
    }
}
