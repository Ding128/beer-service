package com.beer.beerservice.service;


import com.beer.beerservice.web.model.BeerDto;


import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto save(BeerDto beerDto);

    BeerDto updateById(UUID beerId, BeerDto beerDto);
}
