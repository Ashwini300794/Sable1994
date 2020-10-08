package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium cjc jar files\\New_CromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\SHRI\\Desktop\\AutoIT\\abc.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='file1']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\SHRI\\Desktop\\AutoIT\\auto.abc.exe");
		

	}

}
