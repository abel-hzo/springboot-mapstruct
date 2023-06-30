package com.abelhzo.mapstruct.dtos;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: CategoryDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 22:47:35.
 * @description: El presente archivo CategoryDTO.java fue creado por Abel HZO.
 */
public class CategoryDTO {

	private Long idCategory;
	private String category;
	private Boolean status;
	private Set<CategoryProductDTO> categoryProductDTO = new HashSet<>(0);

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

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

	public Set<CategoryProductDTO> getCategoryProductDTO() {
		return categoryProductDTO;
	}

	public void setCategoryProductDTO(Set<CategoryProductDTO> categoryProductDTO) {
		this.categoryProductDTO = categoryProductDTO;
	}

	@Override
	public String toString() {
		return "CategoryDTO [idCategory=" + idCategory + ", category=" + category + ", status=" + status + "]";
	}

}
