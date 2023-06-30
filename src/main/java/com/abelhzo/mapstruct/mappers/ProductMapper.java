package com.abelhzo.mapstruct.mappers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import com.abelhzo.mapstruct.dtos.ProductDTO;
import com.abelhzo.mapstruct.entities.Product;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: ProductMapper.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 21:32:40.
 * @description: El presente archivo ProductMapper.java fue creado por Abel HZO.
 */
@Mapper(componentModel = ComponentModel.SPRING, uses = { CategoryProductMapper.class }, imports = { BigDecimal.class, RoundingMode.class } )
public interface ProductMapper {
	
//	Si no se usa spring
//	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	@Named("calculePriceWithTax")
	default BigDecimal calculePriceWithTax(BigDecimal price) {
		return price.multiply(new BigDecimal(.16)).add(price).setScale(2, RoundingMode.HALF_EVEN);
	}

	@Mappings({ 
		@Mapping(target = "id", source = "idProduct"),
		@Mapping(target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
		@Mapping(target = "categoryProductDTO", source = "categoryProduct", qualifiedByName = "categoryProductDTO"),
//		@Mapping(target = "priceWithTax", expression = "java(product.getPrice().multiply(new BigDecimal(.16)).add(product.getPrice()).setScale(2, RoundingMode.HALF_EVEN))")
		@Mapping(target = "price", numberFormat = "$0.00"),
		@Mapping(target = "taxDTO.idProduct", source = "idProduct"),
		@Mapping(target = "taxDTO.iva", constant = "16%"),
		@Mapping(target = "taxDTO.priceWithTax", source = "price", qualifiedByName = "calculePriceWithTax", numberFormat = "$0.00")
		})
	ProductDTO toProductDTO(Product product);

	@Named(value = "toProduct")
	@Mappings({ 
		@Mapping(target = "idProduct", source = "id"),
		@Mapping(target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
		@Mapping(target = "categoryProduct", source = "categoryProductDTO", qualifiedByName = "categoryProduct") 
		})
	Product toProduct(ProductDTO productDTO);
	
	List<ProductDTO> toListProductDTO(List<Product> listProduct);

}
