package com.supabase.controller;


import com.supabase.domain.CustomerRequest;
import com.supabase.entity.CustomerEntity;
import com.supabase.repository.CustomerEntityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
class CustomerController {

    private final CustomerEntityRepository customerEntityRepository;

    CustomerController(CustomerEntityRepository customerEntityRepository) {
        this.customerEntityRepository = customerEntityRepository;
    }

    @GetMapping("/all")
    ResponseEntity<List<CustomerEntity>> getAllCustomers() {
        return ResponseEntity.ok(customerEntityRepository.findAll());
    }

    @PostMapping("/register")
    ResponseEntity<CustomerEntity> registerCustomer(@RequestBody CustomerRequest request) {
        return ResponseEntity.ok(
                customerEntityRepository.save(
                        new CustomerEntity()
                                .setFirstName(request.firstName())
                                .setLast_name(request.lastName())
                                .setCity(request.city())));
    }

    @PostMapping("/register/all")
    ResponseEntity<List<CustomerEntity>> registerCustomers(@RequestBody List<CustomerRequest> requestList) {
        return ResponseEntity.ok(
                customerEntityRepository.saveAll(
                        requestList.stream().map(request -> new CustomerEntity()
                                .setFirstName(request.firstName())
                                .setLast_name(request.lastName())
                                .setCity(request.city())).toList()
                ));
    }
}
