package com.students.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsApiApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals("sadad", Mockito.anyString());
	}

}
