package org.hatice.inventoryandstockmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String barcode;
	private Long categoryId;
	private Integer quantity;
	private String description;
	private String imageUrl;
	private BigDecimal purchasePrice;
	private BigDecimal salePrice;
	private Long warehouseId;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Long supplierId;
	
	
}