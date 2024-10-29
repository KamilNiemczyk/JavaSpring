package com.example.demo;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		String path = "src/main/resources/data.csv";
		Map<String, Person> personMap = personService.loadPersonCsv(path);
		personMap.values().forEach(person -> System.out.println(person.toString()));
//		SpringApplication.run(DemoApplication.class, args);
	}

}
