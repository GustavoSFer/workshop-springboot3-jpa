package com.fernandes.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandes.courseSpring.entities.Category;
import com.fernandes.courseSpring.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository category;
	
	public List<Category> findAll() {
		return category.findAll();
	}
	
	public Category finById(Long id) {
		Optional<Category> obj = category.findById(id);
		
		return obj.get();
	}
}
