package com.dss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Opening Google Chrome browser and www.LinkedIn.com on that browser
		by using Selenium Web Driver */
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver conductor = new ChromeDriver();
		
	/*in above iterations we created WebDriver interface implementation class ChromeDriver object 
	  we also did set the properties to the webdriver through setProperty method */
		
		conductor.get("https://www.linkedin.com");
		//to print title of the web page
		System.out.println(conductor.getTitle());
		
		//to print the actual current URL
		System.out.println(conductor.getCurrentUrl());
		
		//to print source of the web page
		//System.out.println(conductor.getPageSource());
		Thread.sleep(3000);
		
		//navigating the same page to other web page
		conductor.navigate().to("https://www.google.com");
		System.out.println(conductor.getTitle());
		System.out.println(conductor.getCurrentUrl());
		Thread.sleep(3000);
		
		//navigating the same page to previous page
		conductor.navigate().back();
	}

}
