package com.myapp.dlist.controllers;

import com.myapp.dlist.dto.GameDto;
import com.myapp.dlist.dto.GameListDto;
import com.myapp.dlist.dto.GameMinDto;
import com.myapp.dlist.services.GameListService;
import com.myapp.dlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListcontroller {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }
}
