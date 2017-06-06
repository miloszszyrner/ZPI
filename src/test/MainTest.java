package test;

import org.junit.Assert;
import org.junit.Test;

import application.Main;

public class MainTest {
	Main mainApp = new Main();
	
	@Test
	public void testCategory() {
		Assert.assertNull(mainApp.getCategory());
		mainApp.createCategory();
		Assert.assertNotNull(mainApp.getCategory());
	}

}