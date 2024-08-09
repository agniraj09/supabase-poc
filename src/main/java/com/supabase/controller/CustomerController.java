package com.supabase.controller;


import com.supabase.entity.CustomerEntity;
import com.supabase.repository.CustomerEntityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
class CustomerController {

    private final CustomerEntityRepository customerEntityRepository;

    CustomerController(CustomerEntityRepository customerEntityRepository){
        this.customerEntityRepository = customerEntityRepository;
    }

    @GetMapping("/all")
    ResponseEntity<List<CustomerEntity>> getAllCustomers(){
      return ResponseEntity.ok(customerEntityRepository.findAll());
    }
}
