package com.azu.laboratory.internal_test;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/internal-test")

public class InternalTestController {
    private InternalTestService internalTestService;

    public InternalTestController(InternalTestService internalTestService) {
        this.internalTestService = internalTestService;
    }

    @GetMapping
    public List<InternalTest> getAll(){
        return  internalTestService.getALl();
    }
    @PostMapping
    public void store(@RequestBody InternalTest test){
        internalTestService.store(test);
    }
}
