package com.domrf.test.domrf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DomrfApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
		Integer passportId = Integer.getInteger("");
		User user = new User(1, "Ivan", "Moscow");

		User saved = userRepository.save(user);

		assertNotNull(saved);

		userRepository.findById(1);
		Assert.assertEquals(user.getFullName(), "Ivan");

	}
}
