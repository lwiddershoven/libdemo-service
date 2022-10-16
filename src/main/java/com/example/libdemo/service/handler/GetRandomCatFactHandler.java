package com.example.libdemo.service.handler;

import lombok.RequiredArgsConstructor;
import org.example.libdemo.lib.domain.CatFact;
import org.example.libdemo.lib.service.CatFactService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetRandomCatFactHandler {

    private final  CatFactService catFactService;

    public CatFact getRandomCatFact() {
        return catFactService.getDefaultFact();
    }
}
