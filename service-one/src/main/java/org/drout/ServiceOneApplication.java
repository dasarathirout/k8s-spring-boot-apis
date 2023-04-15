package org.drout;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceOneApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("http://localhost:8181/portal-one/explorer/index.html#uri=/portal-one/management/actuator");
	}
}
