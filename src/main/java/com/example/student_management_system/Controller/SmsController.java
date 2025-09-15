package com.example.student_management_system.Controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.student_management_system.model.StudentClass;

@RestController
public class SmsController {
	
	List<StudentClass> studentBatchInfo = new ArrayList<>();
	
	@GetMapping("/sms")
	List<StudentClass> getInfo(){
		return studentBatchInfo;
	}

	@PostMapping("/sms")
	String addInfo(@RequestBody StudentClass studentInfo) {
		studentBatchInfo.add(studentInfo);
		return "Information added successfully";
	}
}
