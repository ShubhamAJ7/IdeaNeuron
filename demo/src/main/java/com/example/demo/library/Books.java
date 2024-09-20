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
public class Books {
	
	@Id
	private int bookId;
	private String bookName;
	private int bookQuantity;
	private int bookQuantityAvailable;
	private int bookQuantityLend;
	private int bookCost;
	private int bookSecurity;

}
