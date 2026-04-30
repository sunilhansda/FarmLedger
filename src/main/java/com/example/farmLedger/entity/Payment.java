package com.example.farmLedger.entity;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {

    @Id
    @Column(name = "id")
    UUID id;

    @Column(name = "customer_id")
    UUID customerId;

    @Column(name = "amount")
    String amount;

    @Column(name = "due_amount")
    String dueAmount;

    @Column(name = "created_at")
    Timestamp createdAt;

}
