package com.nord.rest.client.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ClientRequest {

    @JsonProperty
    private int id;

    @JsonProperty
    private String type;

}
