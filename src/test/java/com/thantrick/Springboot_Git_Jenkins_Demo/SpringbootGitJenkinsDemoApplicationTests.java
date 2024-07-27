package com.thantrick.Springboot_Git_Jenkins_Demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringbootGitJenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootGitJenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true, true);
	}

}
