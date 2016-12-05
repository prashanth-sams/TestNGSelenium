package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGM {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.out.println("I will be called before every test execution");
		System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
//	@Test(priority=2, enabled=false)
//	@Test(groups = {"smoke"})
	@Test
	public void test01() throws InterruptedException {
		System.out.println("I am in test 1");
		driver.findElement(By.name("q")).sendKeys("Prashanth Sams");
		Assert.assertEquals(driver.getTitle(), "Google");
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void test02() throws InterruptedException {
		System.out.println("I am in test 2");
		driver.findElement(By.name("q")).sendKeys("Selenium Essentials");
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
