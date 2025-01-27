package org.hatice.inventoryandstockmanagementsystem.dto.request.userrequestdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserRegisterDto(
		@NotBlank(message = "Username cannot be blank")
		@Size(min = 3, max = 15, message =
				"Username length must be " + "3-15 length.")
		String username,
		@NotBlank
		String name,
		@NotBlank
		String surname,
		@Pattern(regexp = "^\\+90\\d{10}$", message = ("Phone number must be at this format +90XXXXXXXXXX"))
		@NotBlank(message = "PhoneNumber cannot be blank")
		String phoneNumber,
		@NotBlank @Size(min = 11, max = 11)
		@Pattern(regexp = "^[0-9]{11}$", message = "TC IdNumber must contains only digits")
		String tcIdNumber,
		@NotBlank
		@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%*^&+=]).{8,20}$",message = "Password not apply validation rules or password length must be 8-20")
		String password,
		@NotBlank @Email String email,
		@NotBlank
		String rePassword) {
}