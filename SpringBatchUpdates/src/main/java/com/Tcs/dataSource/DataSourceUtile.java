package com.Tcs.dataSource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "com/Tcs/config/ad.properties")
public class DataSourceUtile {
	
	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("ad.driverClass"));
		dataSource.setUrl(environment.getProperty("ad.url"));
		dataSource.setUsername(environment.getProperty("ad.username"));
		dataSource.setPassword(environment.getProperty("ad.password"));

		return dataSource;

	}

}
