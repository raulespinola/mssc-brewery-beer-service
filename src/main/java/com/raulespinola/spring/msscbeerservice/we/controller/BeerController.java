package com.raulespinola.spring.msscbeerservice.we.controller;

import com.raulespinola.spring.msscbeerservice.web.model.BeerDto;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        //TODO
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(BeerDto beerDto) {
        //Todo
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        // TODO
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
