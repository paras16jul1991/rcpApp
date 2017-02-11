package com.sample.app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApplication {

	@Test
	public void test_add() {

		Application app = new Application();
		assertEquals(30,app.add(10, 20));
	}

}
