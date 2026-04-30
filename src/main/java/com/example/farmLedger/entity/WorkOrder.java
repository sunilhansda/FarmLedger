package com.example.farmLedger.entity;

import com.example.farmLedger.utility.PaymentStatus;
import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkOrder {

    @Id
    @Column(name = "id")
    UUID id;

    @Column(name = "customer_id")
    UUID customerId;

    @Column(name = "service_type_id")
    UUID serviceTypeId;

    @Column(name = "work_date")
    Date workDate;

    @Column(name = "start_time")
    Time startTime;

    @Column(name = "end_time")
    Time endTime;

    @Column(name = "total_amount")
    String totalAmount;

    @Column(name = "payment_status")
    PaymentStatus paymentStatus;

    @Column(name = "payment_id")
    UUID paymentId;
    //customer_name_audio : how to store audio file

    @Column(name = "customer_pic")
    Blob customerPic;

    @Column(name = "created_at")
    Timestamp createdAt;
}
