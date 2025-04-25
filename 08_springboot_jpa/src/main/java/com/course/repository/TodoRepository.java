package com.course.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.course.entity.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long>{
	
	// SQL : select * from todo where title = ?
	public List<TodoEntity> findByTitle(String title);
	
	List<TodoEntity> findByDueDate(Date dueDate);
	
	// SQL : select * from todo where title = ? and status = ?
	List<TodoEntity> findByTitleAndStatus(String title, Integer status);
	
	List<TodoEntity> findByDueDateGreaterThan(Date dueDate);
	
	// SQL語句：select * from todo where due_date between ? and ?
	List<TodoEntity> findByDueDateBetween(Date startDate, Date endDate);
	
	// SQL語句：select * from todo where title like ?
	List<TodoEntity> findByTitleLike(String title);
	
	// SQL語句：select * from todo where id in (?, ?, ?);
	List<TodoEntity> findByIdIn(List<Long> ids);
	
	// SQL語句：select * from todo order by due_date;
	List<TodoEntity> findAllByOrderByTitleDesc();
	
	// SQL語句：select count(*) from todo where status = ?;
	Integer countByStatus(Integer status);
	
	//用JPQL 如果只要用JPQL 不寫value = 也沒差
//	@Query(value = "select t from TodoEntity t where t.title = ?1 and t.status = ?2")
	//用Named Parameter
//	@Query(value = "select t from TodoEntity t where t.status = :status and t.title = :title")
	//使用NativeSQL
	@Query(nativeQuery = true,value = "select * from TODO t where t.status = :status and t.title = :title")
	List<TodoEntity> findByCondition(String title, Integer status);
	
	@Modifying
	@Query("update TodoEntity set title = ?2 where id = ?1")
	Integer updateTodoQuery(Long id, String title);
	
	public List<TodoEntity> findByTitle(String title, Sort sort);
}
