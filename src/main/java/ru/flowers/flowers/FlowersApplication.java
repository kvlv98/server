package ru.flowers.flowers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.flowers.flowers.utils.HibernateUtils;

@SpringBootApplication
public class FlowersApplication {

	public static void main(String[] args) {
		HibernateUtils.buildSessionFactory();
		SpringApplication.run(FlowersApplication.class, args);
	}

}

