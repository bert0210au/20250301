package com.course.Dao;

import java.util.List;

import com.course.Model.TodoDto;

public interface TodoDao {
	
	void add(TodoDto todoDto);
	
	void update(TodoDto todoDto);
	
	void delete(Long id);
	
	List<TodoDto> findAll();
	
	List<TodoDto> findbyTitle(String title);

}
