package com.example.demo.toDoList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements Services{

	@Autowired
	TaskRepository taskRepository;
	@Override
	public ResponseEntity<?> addTask(Tasks t) {
		if(t.getTaskId().isBlank()) {
			return ResponseEntity.badRequest().body("Task id must not be null");
		}
		Optional<Tasks> opt = taskRepository.findById(t.getTaskId());
		if(!opt.isEmpty()) {
			return ResponseEntity.badRequest().body("Task Already Exist");
		}
				taskRepository.save(t);
		return ResponseEntity.accepted().body("Task Added");
	}

	@Override
	public ResponseEntity<?> updateTask(Tasks t) {
		if(t.getTaskId().isBlank()) {
			return ResponseEntity.badRequest().body("Task id must not be null");
		}
		Optional<Tasks> opt = taskRepository.findById(t.getTaskId());
		if(opt.isEmpty()) {
			return ResponseEntity.badRequest().body("Task Does Not Exist");
		}
			taskRepository.save(t);
		return ResponseEntity.accepted().body("Task Updated");
	}

	@Override
	public ResponseEntity<?> deleteTask(String taskId) {
		
		Optional<Tasks> opt = taskRepository.findById(taskId);
		if(opt.isEmpty()) {
			return ResponseEntity.badRequest().body("Task Does Not Exist");
		}
			taskRepository.deleteById(taskId);
		return ResponseEntity.accepted().body("Task Deleted");
	}


	@Override
	public ResponseEntity<?> searchTaskById(String taskId) {
		
		Optional<Tasks> opt = taskRepository.findById(taskId);
		if(opt.isEmpty()) {
			return ResponseEntity.badRequest().body("Task Does Not Exist");
		}
		return ResponseEntity.accepted().body(opt);
	}

}
