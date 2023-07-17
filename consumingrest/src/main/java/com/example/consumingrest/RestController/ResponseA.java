package com.example.consumingrest.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Type;

public class ResponseA {
    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private Quote value;

    public ResponseA(String type, Quote quote) {
        this.type = type;
        this.value = quote;
    }
    public ResponseA(){

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Quote getQuote() {
        return value;
    }

    public void setQuote(Quote quote) {
        this.value = quote;
    }

}
