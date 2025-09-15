package com.example.supermarketwala.Controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.supermarketwala.model.Category;

@RestController
public class CategoryController {
	
	List<Category> categories = new ArrayList<>();
	
	@GetMapping("/category")
	List<Category> getCategory(){
		return categories;
	}
	
	@PostMapping("/category")
	String addCategory(@RequestBody Category categoryName) {
		categories.add(categoryName);
		return "category " + categoryName + " added successfully";
	}
}
