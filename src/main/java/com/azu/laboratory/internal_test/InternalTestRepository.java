package com.azu.laboratory.internal_test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalTestRepository extends JpaRepository<InternalTest, Integer> {
}
