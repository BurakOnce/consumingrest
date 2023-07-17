package com.example.consumingrest.RestController;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.squareup.okhttp.*;
import org.apache.tomcat.util.buf.StringUtils;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/quote")
    public String quote() throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://localhost:8080/api/random")
                .get()
                .build();

        String StatusQuote ="";
        Response response = client.newCall(request).execute();

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //  Map<String,Object> q= mapper.readValue(response.body().charStream(), HashMap.class);
        ResponseA  x= mapper.readValue(response.body().charStream(), ResponseA.class);

        //  Quote quote2 = new Quote(response.code(),response.body().string());

        return x.getQuote().getContent();
    }

}
/*Service package
* Interface, Class
* Classta Controlerdeki şeyler koyulucak
* */