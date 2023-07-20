package com.azu.laboratory.external_test;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExternalTestService {
    private ExternalTestRepository externalTestRepository;

    public ExternalTestService(ExternalTestRepository externalTestRepository) {
        this.externalTestRepository = externalTestRepository;
    }

    public List<ExternalTest> getALl(){
        return  externalTestRepository.findAll();
    }
    public String store(ExternalTest test){
        externalTestRepository.save(test);
        return "true";
    }
}
