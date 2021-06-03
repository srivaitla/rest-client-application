package com.nord.rest.client.application.client;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class RestClientConfig {

    @Value("${server.url}")
    private String url;

}
