package com.example.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.*;

//@ComponentScan(basePackages = {"com.example.demo12"})

@SpringBootApplication
public class Demo12Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo12Application.class, args);
	}

		@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx)
	{
		return args ->{
			System.out.println("lets inspect the  beans provided by the springboot");
			String [] beanNames=ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName:beanNames)
				System.out.println(beanName);
		};
	}

}
