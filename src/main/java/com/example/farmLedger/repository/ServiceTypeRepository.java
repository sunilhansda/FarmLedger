package com.example.farmLedger.repository;

import com.example.farmLedger.entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceTypeRepository extends JpaRepository<UUID, ServiceType> {
}
