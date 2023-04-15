package org.drout;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceTwoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("http://localhost:8182/portal-two/explorer/index.html#uri=/portal-two/management/actuator");
	}
}
