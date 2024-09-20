package com.example.demo.library;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

	@Id
	private int userId;
	private int userName;
	private int userOrganization;
	private int userAddress;
}
