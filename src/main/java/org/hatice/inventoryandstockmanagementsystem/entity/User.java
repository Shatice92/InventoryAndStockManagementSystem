package org.hatice.inventoryandstockmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.enums.UserRole;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbl_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String name;
	private String surname;
	private String phoneNumber;
	@Column(name = "TcIdNumber")
	private String tcIdNumber;
	private String password;
	private String email;
	private LocalDateTime createdDate;


}