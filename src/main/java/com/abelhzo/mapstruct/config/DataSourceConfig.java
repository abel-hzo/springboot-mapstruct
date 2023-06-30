package com.abelhzo.mapstruct.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: DataSourceConfig.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Miércoles 28 Junio 2023, 21:23:10.
 * @description: El presente archivo DataSourceConfig.java fue creado por Abel
 *               HZO.
 */
@Configuration
@EntityScan(basePackages = { "com.abelhzo.mapstruct.entities" })
@EnableJpaRepositories(basePackages = { "com.abelhzo.mapstruct.repositories" })
public class DataSourceConfig {

	private final String PATH_DATABASE = new FileSystemResource("")
											.getFile()
											.getAbsolutePath()
											.concat("/src/main/resources/database");

	@Bean
	public DataSource dataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:h2:" + PATH_DATABASE);
		dataSourceBuilder.username("abelhzo");
		dataSourceBuilder.password("54321");
		return dataSourceBuilder.build();
	}

}
