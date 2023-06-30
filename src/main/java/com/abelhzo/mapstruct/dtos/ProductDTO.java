package com.abelhzo.mapstruct.dtos;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: ProductDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 21:21:37.
 * @description: El presente archivo ProductDTO.java fue creado por Abel HZO.
 */
public class ProductDTO {

	private Long id;
	private String name;
	private String creationDate;
	private String price;
	private TaxDTO taxDTO;
	private Set<CategoryProductDTO> categoryProductDTO = new HashSet<>(0);

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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public TaxDTO getTaxDTO() {
		return taxDTO;
	}

	public void setTaxDTO(TaxDTO taxDTO) {
		this.taxDTO = taxDTO;
	}

	public Set<CategoryProductDTO> getCategoryProductDTO() {
		return categoryProductDTO;
	}

	public void setCategoryProductDTO(Set<CategoryProductDTO> categoryProductDTO) {
		this.categoryProductDTO = categoryProductDTO;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", creationDate=" + creationDate + ", price=" + price
				+ ", taxDTO=" + taxDTO + ", categoryProductDTO=" + categoryProductDTO + "]";
	}

}
