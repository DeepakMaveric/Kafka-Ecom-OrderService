package com.ecommerce.orderService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ORDERS")
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String productId;
    private Integer quantity;
    @CreatedDate
    private LocalDate createdDate;

}