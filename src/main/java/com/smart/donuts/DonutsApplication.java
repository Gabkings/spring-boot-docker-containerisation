package com.smart.donuts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DonutsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonutsApplication.class, args);
	}

	DonutRepository donutRepository;

	DonutsApplication(DonutRepository donutRepository) {
		this.donutRepository = donutRepository;
	}

	@PostConstruct
	public void initApplication() {
		if (donutRepository.count() > 1) return;
		donutRepository.save(new DonutEntity("Chocolate", DonutToppings.NONE, 1.50, 10));
		donutRepository.save(new DonutEntity("Maple", DonutToppings.MAPLE, 1.0, 5));
		donutRepository.save(new DonutEntity("Glazed", DonutToppings.GLAZED, 0.75, 20));
	}

}
