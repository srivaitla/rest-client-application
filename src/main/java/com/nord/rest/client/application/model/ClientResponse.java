package com.nord.rest.client.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ClientResponse {

    @JsonProperty
    private int id;

    @JsonProperty
    private String content;

}
