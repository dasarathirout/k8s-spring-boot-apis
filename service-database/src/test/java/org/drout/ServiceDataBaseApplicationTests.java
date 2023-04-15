package org.drout;

import org.drout.dao.UserDetailsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("postgres")
class ServiceDataBaseApplicationTests {
	@MockBean
	UserDetailsRepository userDetailsRepository;
	@Test
	void contextLoads(ApplicationContext context) {
		Assertions.assertNotNull(context, "Profile 'postgres' context loaded.");
	}

}
