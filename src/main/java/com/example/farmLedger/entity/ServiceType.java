package com.example.farmLedger.entity;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ServiceType {

    @Id
    @Column(name = "id")
    UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "rate_in")
    String rateIn;

    @Column(name = "base_rate")
    Integer baseRate;

    @Column(name = "year")
    String year;
}
