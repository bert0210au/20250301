package com.course.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Dao.TodoDao;
import com.course.Model.TodoDto;

@Service
public class TodoService {
	
	@Autowired
	private TodoDao todoDao;
	
	public void addTodo() {
		TodoDto todoDto = new TodoDto();
		todoDto.setTitle("吃飯");
		todoDto.setDueDate(new Date());
		todoDto.setStatus(0);
		todoDao.add(todoDto);
		
	}
	
	public List<TodoDto> findAll(){
		List<TodoDto> dtos = todoDao.findAll();
		return dtos;
	}
	
	public List<TodoDto> findByTitle(){
		List<TodoDto> dtos = todoDao.findbyTitle("菜");
		return dtos;
	}

}
