package com.sg.kata.controllers;

import com.sg.kata.dto.ResultDto;
import com.sg.kata.services.GbsuFtbLaiService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gbsu-ftb-lai")
public class GbsuFtbLaiController {

    private final GbsuFtbLaiService gbsuFtbLaiService;

    public GbsuFtbLaiController(GbsuFtbLaiService gbsuFtbLaiService) {
        this.gbsuFtbLaiService = gbsuFtbLaiService;
    }

    @GetMapping(value = "/{inputNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"})
    public ResultDto convertNumber (@PathVariable int inputNumber){

        return  null;
    }
}
