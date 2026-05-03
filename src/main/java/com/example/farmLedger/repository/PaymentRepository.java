package com.example.farmLedger.repository;

import com.example.farmLedger.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<UUID, Payment> {
}
