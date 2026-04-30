package com.example.farmLedger.entity;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @Column(name = "id")
    UUID id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "village")
    String village;

    @Column(name = "tola")
    String tola;

    @Column(name = "profile_pic")
    Blob profilePic;

    @Column(name = "created_at")
    Timestamp createdAt;
}
