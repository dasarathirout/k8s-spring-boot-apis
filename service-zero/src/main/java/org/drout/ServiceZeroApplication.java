package org.drout;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceZeroApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZeroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("http://localhost:8180/portal-zero/explorer/index.html#uri=/portal-zero/management/actuator");
	}

}
