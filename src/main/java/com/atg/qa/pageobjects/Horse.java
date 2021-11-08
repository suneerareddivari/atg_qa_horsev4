package com.atg.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Horse {
	public WebDriver driver;

	public Horse(WebDriver driver) {
		this.driver = driver;
	}

	private By cookies = By.xpath("//h3[@id='onetrust-policy-title']");
	private By AcceptCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");
	private By Hast = By.xpath("(//span[text()='Häst'])[1]");
	private By Gamecalendar = By.xpath("//a[@data-test-id=\"quicklinks-calendar-horsebetting\"]");

	public String verifytitle() {
		return driver.getTitle();
	}

	public WebElement cookies() {
		return driver.findElement(cookies);
	}

	public WebElement AcceptCookies() {
		return driver.findElement(AcceptCookies);
	}

	public WebElement Hast() {
		return driver.findElement(Hast);
	}

	public WebElement Gamecalendar() {
		return driver.findElement(Gamecalendar);
	}

}
