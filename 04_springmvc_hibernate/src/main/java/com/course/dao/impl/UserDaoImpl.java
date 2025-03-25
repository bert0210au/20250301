package com.course.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.spi.QueryParameterBindingTypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.course.dao.UserDao;
import com.course.entity.User;
import com.course.service.ConnectService;

import jakarta.persistence.NoResultException;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private ConnectService connectService;
	@Override
	public User findByUsername(String Username) {
		// 呼叫DB
		User user=null;
		try(Session session =connectService.getSession();){
			//JPQL
			String sql="select u from User u where u.username = ?1";
			Query<User> query =session.createQuery(sql, User.class);
			query.setParameter(1, Username);
			user=query.getSingleResult();
		}catch(NoResultException e) {
			e.printStackTrace();
			System.out.println("空值");
		}
		return user;
	}

	@Override
	public void addUser(User user) {
		
		System.out.println("Add User");
		
//		Configuration configuration = new Configuration().configure();
//	    SessionFactory sessionFactory = configuration.buildSessionFactory();
//	    // 取得Session
//	    Session session = sessionFactory.openSession();
		
		//運用try With resource 來自動關閉連線就不用多寫close 前提是該物件需要有繼承AutoCloseable物件
		try(Session session =connectService.getSession();){
			// 開啟交易/事務
			Transaction transaction = session.beginTransaction();
			
			// 新增 Hibernate 5.0
			// session.save(user);
			
			// Hibernate 6.0
			session.persist(user);
			
			// 提交
			transaction.commit();
			// 關閉連線
			//session.close();
		}
	    catch (Exception e) {
			System.out.println("錯誤");
		}
	}

	@Override
	public void delUser(User user) {
		//運用try With resource 來自動關閉連線就不用多寫close 前提是該物件需要有繼承AutoCloseable物件
				try(Session session =connectService.getSession();){
					// 開啟交易/事務
					Transaction transaction = session.beginTransaction();
					
					// 新增 Hibernate 5.0
					// session.delete(user);
					
					// Hibernate 6.0
					session.remove(user);
				    
					// 提交
					transaction.commit();
				}
				catch (Exception e) {
					System.out.println("錯誤");
				}
		
	}

	@Override
	public void updateUser(User user) {
		//運用try With resource 來自動關閉連線就不用多寫close 前提是該物件需要有繼承AutoCloseable物件
				try(Session session =connectService.getSession();){
					// 開啟交易/事務
					Transaction transaction = session.beginTransaction();
					
					// 新增 Hibernate 5.0
					// session.update(user);
					
					// Hibernate 6.0
					session.merge(user);
					
					// 提交
					transaction.commit();

				}
				catch (Exception e) {
					System.out.println("錯誤");
				}
		
	}

	@Override
	public User findByUsernameandPassword(String Username, String Password) {
		
		User user=null;
		try(Session session =connectService.getSession();){
			//JPQL
			// String sql = "select * from user u where u.username = ? and u.password = ?";
			// String sql="select u from User u where u.username = ?1 and u.password = ?2";
			// Query<User> query =session.createQuery(sql, User.class);
			
			
			//NativeSQL
			//String nativesql="select * from User u where u.username = ?1 and u.password = ?2";
			//Query<User> query =session.createNativeQuery(nativesql, User.class);
			//query.setParameter(1, Username);
			//query.setParameter(2, Password);
			//List<User> users=query.getResultList();
			//user = users.get(0);
			
			//Named
			String nativesql="select * from User u where u.username = :u1 and u.password = :p1";
			Query<User> query =session.createNativeQuery(nativesql, User.class);
			query.setParameter("u1", Username);
			query.setParameter("p1", Password);
			List<User> users=query.getResultList();
			if(users!=null && !users.isEmpty()) {
				user = users.get(0);
			}
			
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> user=new ArrayList<>();
		try(Session session =connectService.getSession();){
			//JPQL
			String sql="select u from User u";
			Query<User> query =session.createQuery(sql, User.class);
			user=query.getResultList();
			
		}
		return user;

	}

	@Override
	public User findById(Integer id) {
		// 呼叫DB
		User user=null;
		try(Session session =connectService.getSession();){
			//JPQL+Named
			String sql="select u from User u where u.id = :id1";
			Query<User> query =session.createQuery(sql, User.class);
			query.setParameter("id1", id);
			user=query.getSingleResult();
		}catch(NoResultException e) {
			e.printStackTrace();
			System.out.println("空值");
			return null;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	
}
