package Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utility.BrowserOperation;

public class Instagram extends BrowserOperation {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\HYLANDS\\Selenium\\Driver\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).clear();
		    driver.findElement(By.name("username")).sendKeys("iammurali.mng@gmail.com");
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("cookwithcomali");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		    driver.findElement(By.xpath("//button[2]")).click();
		
		    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		    
		    
		/*
		for(int i=1; i>0; i++)
		{
			driver.get("https://www.instagram.com/___m_u_r_a_l_i___/");
			
		
		}
		*/
		
		
	}

}
