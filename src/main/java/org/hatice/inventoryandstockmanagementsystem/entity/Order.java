package org.hatice.inventoryandstockmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long supplierId;
	LocalDateTime orderDate=LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private OrderStatus status=OrderStatus.NEW;
	
}