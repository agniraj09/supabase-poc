package com.supabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "city")
    private String city;

    public Long getId() {
        return id;
    }

    public CustomerEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public CustomerEntity setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CustomerEntity setCity(String city) {
        this.city = city;
        return this;
    }
}
