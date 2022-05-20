package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
	// es solo un bean
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
