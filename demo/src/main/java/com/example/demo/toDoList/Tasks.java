package com.example.demo.toDoList;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tasks {

	@Id
	@Nonnull
	private String taskId;
	@Nonnull
	private String taskName;
	@Nonnull
	private String taskDescription;
	@Nonnull
	private String taskStatus;
	
}
