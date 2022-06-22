package com.example.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

/* 	@Test
	void contextLoads() {
	} */
    @Test
    void testJustAnExample() {
        //System.out.println("This test method should be run");
        assertEquals("Hello", "Goodbye");
    }
}
