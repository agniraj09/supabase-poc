package com.supabase.repository;

import com.supabase.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Long> {
}