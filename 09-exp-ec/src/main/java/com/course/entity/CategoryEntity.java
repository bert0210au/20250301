package com.course.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class CategoryEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="PRODUCT_SEQ_GENERATOR")
	@SequenceGenerator(name = "PRODUCT_SEQ_GENERATOR",sequenceName="PRODUCT_SEQ",allocationSize= 1)
	private Long id;
	
	@Column
	private String name;
	
	// 與 Product 的關聯(一個商品可以有多個分類、一個分類也會有多個商品) ManyToMany
	@ManyToMany(mappedBy = "categoryList")
    private List<ProductEntity> productList;
	
	@Column
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductEntity> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductEntity> productList) {
		this.productList = productList;
	}
	
	

}
