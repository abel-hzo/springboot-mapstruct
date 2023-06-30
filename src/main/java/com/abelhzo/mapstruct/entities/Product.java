package com.abelhzo.mapstruct.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: Product.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 21:18:56.
 * @description: El presente archivo Product.java fue creado por Abel HZO.
 */
@Entity
public class Product {

	private Long idProduct;

	private String name;

	private LocalDateTime creationDate;

	private BigDecimal price;

	private Set<CategoryProduct> categoryProduct = new HashSet<>(0);

	@Id
	@Column(name = "id_product")
	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "product", unique = true, nullable = false, length = 60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "creation_date")
	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	@Column(nullable = false, precision = 6, scale = 2)
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
	public Set<CategoryProduct> getCategoryProduct() {
		return categoryProduct;
	}

	public void setCategoryProduct(Set<CategoryProduct> categoryProduct) {
		this.categoryProduct = categoryProduct;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", name=" + name + ", creationDate=" + creationDate + ", price="
				+ price + ", categoryProduct=" + categoryProduct + "]";
	}

}
