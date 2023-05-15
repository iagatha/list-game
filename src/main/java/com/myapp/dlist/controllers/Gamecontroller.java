package com.myapp.dlist.controllers;

import com.myapp.dlist.dto.GameDto;
import com.myapp.dlist.dto.GameMinDto;
import com.myapp.dlist.entities.Game;
import com.myapp.dlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class Gamecontroller {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
       GameDto result = gameService.findById(id);
        return result;
    }
    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gameService.findAll();
        return result;
    }
}
