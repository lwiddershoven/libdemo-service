package com.example.libdemo.service.config;

import org.example.libdemo.lib.service.CatFactService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CatFactServiceConfig {

    @Bean
    public CatFactService catFactService(
            CatFactServiceConfigProperties props,
            WebClient.Builder catClientBuilder
    ) {
        var catClient = catClientBuilder
                .baseUrl(props.baseUrl())
                .build();
        return new CatFactService(catClient);
    }
}

