package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver manijar = new ChromeDriver();
		
		manijar.get("https://www.linkedin.com/");
		System.out.println(manijar.getTitle());
		System.out.println(manijar.getCurrentUrl());
		
		Thread.sleep(3000);
		
		manijar.findElement(By.id("login-email")).sendKeys("xxxxxxxxxxx123@gmail.com");
		Thread.sleep(1000);
		manijar.findElement(By.id("login-password")).sendKeys("xxxxxxxxx");
		Thread.sleep(3000);
		manijar.findElement(By.xpath("//*[@id='login-submit']")).click();
		Thread.sleep(15000);
		manijar.close();

	}

}
