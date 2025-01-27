package org.hatice.inventoryandstockmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.enums.MovementType;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_stock_movement")
public class StockMovement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long productId;
	@Enumerated(EnumType.STRING)
	private MovementType movementType;
	private Integer quantity;
	private LocalDateTime movementDate=LocalDateTime.now();
	private Long userId;
}