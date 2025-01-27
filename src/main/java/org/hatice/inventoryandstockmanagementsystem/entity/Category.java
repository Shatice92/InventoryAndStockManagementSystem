package org.hatice.inventoryandstockmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.*;
import org.mapstruct.ap.internal.model.GeneratedType;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
}