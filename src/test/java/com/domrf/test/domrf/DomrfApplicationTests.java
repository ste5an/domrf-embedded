package com.domrf.test.domrf;

import com.domrf.test.domrf.model.User;
import com.domrf.test.domrf.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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