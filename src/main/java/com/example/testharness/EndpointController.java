package com.example.testharness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "${serverconfig.endpoint-api-base-path}" + "/values")
public class EndpointController {

    private ValuesService service;

    @Autowired
    public EndpointController(ValuesService valuesService) {
        this.service = valuesService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ValuesDTO fetchValues() {
        ValuesDTO result = service.fetchValues();
        return result;
    }
}
