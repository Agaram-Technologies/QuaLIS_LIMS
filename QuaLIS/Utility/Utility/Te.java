package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Te extends BrowserOperation{
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Configuration//Config//config.properties");

		Properties properties = new Properties();

		properties.load(fis);

		
		String driverName=properties.getProperty("driver");
		
		String lims=properties.getProperty("lims");
		
		String userName=properties.getProperty("userName");
		
		String passWord=properties.getProperty("passWord");
		
		if(driverName.contains("chrome"))
		{
			String driverPath = properties.getProperty("driverChrome");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		}
		
		 driver.get("https://ihp.co/");
		    driver.findElement(By.xpath("//div[@id='root']/header/div/div/div[3]/div/div/div/button/div/div/h4")).click();
		    driver.findElement(By.xpath("//input[@name='']")).click();
		    driver.findElement(By.xpath("//input[@name='']")).clear();
		    driver.findElement(By.xpath("//input[@name='']")).sendKeys("iammurali1096@gmail.com");
		    driver.findElement(By.xpath("(//input[@name=''])[2]")).click();
		    driver.findElement(By.xpath("(//input[@name=''])[2]")).clear();
		    driver.findElement(By.xpath("(//input[@name=''])[2]")).sendKeys("javamurali");
		    driver.findElement(By.xpath("//div[@id='root']/header/div/div/div[3]/div/div/div/div/div[2]/form/div[3]/button/h5")).click();
	}

}
