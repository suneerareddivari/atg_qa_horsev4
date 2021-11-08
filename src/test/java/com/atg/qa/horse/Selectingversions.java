package com.atg.qa.horse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atg.qa.pageobjects.Horse;
import com.atg.qa.pageobjects.Version4;
import com.atg.qa.resources.base;

public class Selectingversions extends base {
	public WebDriver driver;

	// Driver initialization
	@BeforeTest
	public void initial() throws IOException {
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void homepageNavigation() throws IOException {
		Horse h = new Horse(driver);
		if (h.AcceptCookies().isDisplayed()) {
			// Accepting cookies
			h.AcceptCookies().click();
		}
		h.Hast().click();
		// verifying the title of page
		String pagetitle = h.verifytitle();
		Assert.assertEquals(pagetitle, "ATG - Spel på Sport, Häst och Casino");
		h.Gamecalendar().click();
		Version4 v = new Version4(driver);
		v.nextArrow().click();
		v.v4().click();
		v.newCoupon().click();
		v.copycoupon().getText();
		v.copycoupon().click();
		for (int i = 0; i < 4; i++) {
			v.markversion1().get(i).click();
		}
		v.markversion2().click();
		// Selecting 2 horses on V3
		for (int j = 0; j < 2; j++) {
			v.markversion3().get(j).click();
		}
		// selecting all horses on v4
		v.markversion4().click();
	}

	// Closing the browser
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
