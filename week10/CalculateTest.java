import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void greet() {
		System.out.println("Testing Multiply Method of Calculator Class");
		System.out.println("");
	}

	@Before
	public void load() {
		System.out.println("Test running...");
	}
	
	@After
	public void complete() {
		System.out.println("Test complete!");
		System.out.println("");
	}

	@Test
	public void test1() {
		assertEquals(0, Calculate.multiply(1, 0));
		System.out.println("Test 1 passed");
	}

	@Test
	public void test2() {
		assertEquals(1, Calculate.multiply(1, 1));
		System.out.println("Test 2 passed");
	}

	@Test
	public void test3() {
		assertEquals(2.0, Calculate.multiply(2.0, 1.0));
		System.out.println("Test 3 passed");
	}

	@Test
	public void test4() {
		assertEquals(5.0, Calculate.multiply(50.0, 0.1));
		System.out.println("Test 4 passed");
	}

	@AfterClass
	public static void bye() {
		System.out.println("All Done!");
	}
}
