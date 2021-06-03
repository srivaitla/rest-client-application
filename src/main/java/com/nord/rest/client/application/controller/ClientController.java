package com.nord.rest.client.application.controller;

import com.nord.rest.client.application.model.ClientRequest;
import com.nord.rest.client.application.model.ClientResponse;
import com.nord.rest.client.application.processor.ClientProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private static final Logger LOGGER = LogManager.getLogger(ClientController.class);

    @Autowired
    private ClientProcessor processor;

    @PostMapping(value = "/client/send",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientResponse clientSend(@RequestBody ClientRequest request) {
        LOGGER.info("rest-client-application-Controller ===== ===== Started\n");
        LOGGER.info(request + "\n");

        final ClientResponse response = processor.send(request);

        LOGGER.info(response + "\n");
        LOGGER.info("rest-client-application-Controller ===== ===== Completed\n\n\n");
        return response;
    }
}
