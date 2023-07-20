package com.azu.laboratory.external_test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalTestRepository extends JpaRepository<ExternalTest, Integer> {
}
