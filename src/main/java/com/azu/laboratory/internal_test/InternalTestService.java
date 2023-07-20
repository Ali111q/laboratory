package com.azu.laboratory.internal_test;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternalTestService {
    private InternalTestRepository internalTestRepository;

    public InternalTestService(InternalTestRepository internalTestRepository) {
        this.internalTestRepository = internalTestRepository;
    }
    public List<InternalTest> getALl(){
        return  internalTestRepository.findAll();
    }
    public void store(InternalTest test){
internalTestRepository.save(test);
    }
}
