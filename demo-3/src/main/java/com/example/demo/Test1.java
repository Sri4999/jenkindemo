package com.example.demo;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

public class Test1 {
	@AfterAll
	public static void m1() {
	System.out.println("hai");
	}
	@Test
	public void testadd() {
	int a=Testadd.addition(2, 5);
    assertEquals(8,a);
	}
}
