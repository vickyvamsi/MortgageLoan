package com.mortgageloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgageloan.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
