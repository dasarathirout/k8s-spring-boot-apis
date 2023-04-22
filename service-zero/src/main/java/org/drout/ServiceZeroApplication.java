package org.drout;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ServiceZeroApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZeroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("http://localhost:8180/portal-zero/explorer/index.html#uri=/portal-zero/management/actuator");
	}

}
