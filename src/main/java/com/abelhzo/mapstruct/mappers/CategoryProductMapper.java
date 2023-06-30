package com.abelhzo.mapstruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.Named;

import com.abelhzo.mapstruct.dtos.CategoryProductDTO;
import com.abelhzo.mapstruct.entities.CategoryProduct;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: CategoryProductMapper.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 23:50:33.
 * @description: El presente archivo CategoryProductMapper.java fue creado por
 *               Abel HZO.
 */
@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryProductMapper {
	
//	Si no se usa spring utilizamos:
//	CategoryProductMapper INSTANCE = Mappers.getMapper(CategoryProductMapper.class);

	@Named(value = "categoryProductDTO")
	@Mapping(target = "productDTO", ignore = true)  //Si los nombre son diferentes, no es necesario el ignore.
	@Mapping(target = "categoryDTO", source = "category")
	CategoryProductDTO toCategoryProductDTO(CategoryProduct categoryProduct);

	@Named(value = "categoryProduct")
	@Mapping(target = "product", source = "productDTO")
	@Mapping(target = "category", source = "categoryDTO")
	CategoryProduct toCategoryProduct(CategoryProductDTO categoryProductDTO);

}
