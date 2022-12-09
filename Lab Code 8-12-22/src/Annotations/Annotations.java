package labcodes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Annotations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll is running");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll is running");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach is running");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach is running");
	}

	@Test
	void test1() {
		System.out.println("Test case 1");
	}

	@Test
	void test2() {
		System.out.println("Test case 2");
	}

	@Test
	void test3() {
		System.out.println("Test case 3");
	}
}
 