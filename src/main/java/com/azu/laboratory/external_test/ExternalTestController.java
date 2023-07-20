package com.azu.laboratory.external_test;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/external-test")
public class ExternalTestController {

    private  ExternalTestService externalTestService;

    public ExternalTestController(ExternalTestService externalTestService) {
        this.externalTestService = externalTestService;
    }

    @GetMapping
    public List<ExternalTest> getAll(){
        return  externalTestService.getALl();
    }
    @PostMapping
    public String store (@RequestBody ExternalTest externalTest){
        externalTestService.store(externalTest);
        return "true";
    }
}
