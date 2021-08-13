package com.ntnn.custom.meow.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping( "/api/v2/")
public class MainController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map> hello() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", "Hello");
        jsonObject.put("status", "200");
        return new ResponseEntity<Map>(jsonObject.toMap(), HttpStatus.OK);
    }
}
