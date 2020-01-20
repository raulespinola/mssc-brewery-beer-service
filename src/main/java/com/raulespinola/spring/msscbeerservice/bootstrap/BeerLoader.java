package com.raulespinola.spring.msscbeerservice.bootstrap;

import com.raulespinola.spring.msscbeerservice.domain.Beer;
import com.raulespinola.spring.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Beer")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnhand(12)
                    .upc(3370000000L)
                    .prive(new BigDecimal("12.90"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Beer")
                    .beerStyle("Black")
                    .quantityToBrew(200)
                    .minOnhand(12)
                    .upc(3370000000L)
                    .prive(new BigDecimal("15.90"))
                    .build());
        }

        System.out.println("Loaded Beers" + beerRepository.count());
    }
}
