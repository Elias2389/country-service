package com.ae.countryservice.data.config;

import org.springframework.stereotype.Component;

@Component
public class RestTemplateClient {

    public RestTemplateClient provideRestTemplate() {
        return new RestTemplateClient();
    }

}
