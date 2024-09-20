package com.example.demo.toDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/pro")
public class Controller {
	
	@Autowired
	Services service;
	
	@PostMapping("/addTask")
	public ResponseEntity<?> addTask(@RequestBody  Tasks t){
		return service.addTask(t);
	}
	
	@PutMapping("/updateTask")
	public ResponseEntity<?> updateTask(@RequestBody Tasks t){
		return service.updateTask(t);
	}
	
	@DeleteMapping("/deleteTaskById")
	public ResponseEntity<?> deleteTask(@RequestBody TaskRequest t){
		return service.deleteTask(t.getTaskId());
		
	}
	
	
	@GetMapping("/searchTaskById")
	public ResponseEntity<?> searchTaskById(@RequestBody TaskRequest t){
		return service.searchTaskById(t.getTaskId());
		
	}
	

}
