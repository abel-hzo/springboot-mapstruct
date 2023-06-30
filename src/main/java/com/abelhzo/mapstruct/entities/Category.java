package com.abelhzo.mapstruct.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: Category.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 22:09:18.
 * @description: El presente archivo Category.java fue creado por Abel HZO.
 */
@Entity
public class Category {

	private Long idCategory;

	private String category;

	private Boolean status;

	private Set<CategoryProduct> categoryProduct = new HashSet<>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category", unique = true, nullable = false)
	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	@Column(unique = true, nullable = false, length = 100)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<CategoryProduct> getCategoryProduct() {
		return categoryProduct;
	}

	public void setCategoryProduct(Set<CategoryProduct> categoryProduct) {
		this.categoryProduct = categoryProduct;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", category=" + category + ", status=" + status + "]";
	}

}
