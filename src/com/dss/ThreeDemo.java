package com.dss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver t = new ChromeDriver();
		
		t.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		t.close();

	}

}
