package com.example.demo.toDoList;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;

public interface Services {
	
	public ResponseEntity<?> addTask(Tasks t);
	public ResponseEntity<?> updateTask(Tasks t);
	public ResponseEntity<?> deleteTask(String taskId);
	public ResponseEntity<?> searchTaskById(String taskId);

}
