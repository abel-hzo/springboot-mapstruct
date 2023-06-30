package com.abelhzo.mapstruct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abelhzo.mapstruct.entities.Product;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: ProductRepository.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 29 Junio 2023, 00:03:44.
 * @description: El presente archivo ProductRepository.java fue creado por Abel HZO.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
