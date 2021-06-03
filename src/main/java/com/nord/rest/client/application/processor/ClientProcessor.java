package com.nord.rest.client.application.processor;

import com.nord.rest.client.application.client.RestClientConfig;
import com.nord.rest.client.application.model.ClientRequest;
import com.nord.rest.client.application.model.ClientResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientProcessor {

    private static final Logger LOGGER = LogManager.getLogger(ClientProcessor.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestClientConfig clientConfig;

    public ClientResponse send(ClientRequest request) {
        LOGGER.info("rest-client-application-Processor ===== ===== Started\n");

        final ClientResponse response = restTemplate.postForObject(clientConfig.getUrl(), request, ClientResponse.class);

        LOGGER.info("rest-client-application-Processor ===== ===== Completed\n\n\n");
        return response;
    }
}
