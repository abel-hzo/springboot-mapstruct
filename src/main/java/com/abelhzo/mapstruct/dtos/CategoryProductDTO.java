package com.abelhzo.mapstruct.dtos;

import java.sql.Timestamp;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: CategoryProductDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 22:46:33.
 * @description: El presente archivo CategoryProductDTO.java fue creado por Abel
 *               HZO.
 */
public class CategoryProductDTO {

	private Long id;
	private ProductDTO productDTO;
	private CategoryDTO categoryDTO;
	public Timestamp created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}

	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "CategoryProductDTO [id=" + id + ", categoryDTO=" + categoryDTO + ", created=" + created + "]";
	}

}
