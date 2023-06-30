package com.abelhzo.mapstruct.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abelhzo.mapstruct.dtos.ProductDTO;
import com.abelhzo.mapstruct.entities.Product;
import com.abelhzo.mapstruct.mappers.ProductMapper;
import com.abelhzo.mapstruct.repositories.ProductRepository;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: TestLineRunner.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Viernes 30 Junio 2023, 00:05:43.
 * @description: El presente archivo TestLineRunner.java fue creado por Abel
 *               HZO.
 */
@Configuration
public class TestLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductMapper productMapper;
//	Cuando no se usa spring se utiliza su instancia.
//	ProductMapper productMapper = ProductMapper.INSTANCE; 

	@Bean
	public CommandLineRunner commandLineRunner() {		

		return args -> {

			List<Product> products = productRepository.findAll();

			System.out.println(
					"---------------------------------------------------------------------------PRODUCTS DB--------------------------------------------------------------------------");

			products.forEach(System.out::println);

			System.out.println(
					"---------------------------------------------------------------------------PRODUCTS DB--------------------------------------------------------------------------");
			System.out.println(
					"--------------------------------------------------------------------------PRODUCTS DTO--------------------------------------------------------------------------");

//			products.stream().map(product -> 
//					productMapper.toProductDTO(product))
//					.peek(System.out::println)
//					.collect(Collectors.toList());
			
			List<ProductDTO> listProductDTO = productMapper.toListProductDTO(products);
			
			listProductDTO.forEach(System.out::println);
			
			System.out.println();

			System.out.println(
					"--------------------------------------------------------------------------PRODUCTS DTO--------------------------------------------------------------------------");

			System.exit(0);

		};

	}

}
