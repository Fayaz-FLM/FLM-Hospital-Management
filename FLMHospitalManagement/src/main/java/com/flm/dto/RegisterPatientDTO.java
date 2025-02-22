package com.flm.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterPatientDTO {

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;
	
	private AddressDTO addressDTO;

	private String gender;

	private LocalDate dateOfBirth; // Stored in 'YYYY-MM-DD' format.

	private String address;

}
