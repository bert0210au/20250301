package com.course.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//宣告為Entity物件
@Entity //Entity 一定要有一個 public 的 無參數建構式(可以默認或是自行設計)
//對應於哪一張資料表
@Table(name="user")
public class User {
	
	
	 /** 鍵值 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 使用者名稱 */
    @Column
    private String username;
    
    /** 密碼 */
    @Column
    private String password;

	public User() {
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	
    // Getter, Setter
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    


    
	
	
    
    
}
