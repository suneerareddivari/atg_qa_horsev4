package com.atg.qa.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Version4 {

	public WebDriver driver;

	public Version4(WebDriver driver) {
		this.driver = driver;
	}

	private By nextArrow = By.xpath("//div[@data-test-id='calendar-next-day-button']");
	private By v4 = By.xpath("//span[@data-test-id='calendar-menu-gameType-V4']");
	private By newCoupon = By.xpath("//button[@data-test-id='new-coupon']");
	private By copycoupon = By.xpath("//button[text()='Kopia']");
	private By firstversions = By.xpath("(//div[@class='css-p65oar-CouponRace-styles--starts'])[1]/span");
	private By secondVersions = By.cssSelector("button[data-test-id='coupon-button-leg-2-start-1']");
	private By thirdVersions = By.xpath("(//div[@class='css-p65oar-CouponRace-styles--starts'])[3]/span");
	private By fourthVersions = By.cssSelector("button[data-test-id='leg-4-toggle-all']");

	public WebElement v1;

	public WebElement nextArrow() {
		return driver.findElement(nextArrow);
	}

	public WebElement v4() {
		return driver.findElement(v4);
	}

	public WebElement newCoupon() {
		return driver.findElement(newCoupon);
	}

	public WebElement copycoupon() {
		return driver.findElement(copycoupon);
	}

	public List<WebElement> markversion1() {
		return driver.findElements(firstversions);
	}

	public WebElement markversion2() {
		return driver.findElement(secondVersions);
	}

	public List<WebElement> markversion3() {
		return driver.findElements(thirdVersions);
	}

	public WebElement markversion4() {
		return driver.findElement(fourthVersions);
	}

}
