package com.example.consumingrest.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;

public class Quote {
    @JsonProperty("id")
    private int id;
    @JsonProperty("quote")
    private String quote;

    public Quote(int id, String content) {
        this.id = id;
        this.quote = content;
    }

    public Quote() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return quote;
    }

    public void setContent(String quote) {
        this.quote = quote;
    }
}
