package org.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace Selinium\\Seleium Test 4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txt = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txt.sendKeys("sample");
		WebElement txt2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txt2.sendKeys("sss");
		WebElement txt3 = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txt3.sendKeys("no:123, 12street, cross avenue, chennai");
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sample_sss@yahoo.co.in");
		WebElement tele= driver.findElement(By.xpath("//input[@type='tel']"));
		tele.sendKeys("9123456789");
		WebElement gender= driver.findElement(By.xpath("//input[@name='radiooptions']"));
		gender.click();
		WebElement games= driver.findElement(By.id("checkbox2"));
		games.click();
		WebElement imageup = driver.findElement(By.id("imagesrc"));
		imageup.sendKeys("C:\\Users\\admin\\Pictures\\Saved Pictures");
		WebElement country= driver.findElement(By.xpath("//span[@role='presentation']"));
		country.click();
		WebElement countind= driver.findElement(By.xpath("//li[text()='India']"));
		countind.click();
		WebElement btn=driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btn.click();
		String attribute3 = txt3.getAttribute("value");
		System.out.println(attribute3);
		String attribute4 = email.getAttribute("value");
		System.out.println(attribute4);
		
	}

}
