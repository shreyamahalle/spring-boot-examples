package com.shreya.abstraction.repository;

import com.shreya.abstraction.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
