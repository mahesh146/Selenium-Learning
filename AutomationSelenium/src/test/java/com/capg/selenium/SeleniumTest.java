package com.capg.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[5]/ul/li[3]/span/a/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li[1]/span/a/div/label/i")).click();
		driver.findElement(By
				.xpath("/html/body/div[1]/div[2]/span/div/span/h1/div/div[2]/div/div/form/span/span/span/span/span[2]"))
				.click();

		Select sel = new Select(driver.findElement(By.xpath("//select[@name='s']")));
		sel.selectByValue("price-asc-rank");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='s']")));
		sel1.selectByValue("price-desc-rank");

	}

}
