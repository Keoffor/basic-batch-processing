package com.kenstudy.batch_processing.repository;

import com.kenstudy.batch_processing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
