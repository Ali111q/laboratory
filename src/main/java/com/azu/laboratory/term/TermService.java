package com.azu.laboratory.term;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermService {
    private TermRepository termRepository;

    public TermService(TermRepository termRepository) {
        this.termRepository = termRepository;
    }

    public List<Term>getAll(){
        return  termRepository.findAll();
    }
}
