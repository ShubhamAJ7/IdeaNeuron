package com.example.demo.library;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lendings {

	@Id
	private int lendId;
	private int lendUserId;
	private int lendBookId;
	private int lendBookCost;
	private int lendSecurity;
}
