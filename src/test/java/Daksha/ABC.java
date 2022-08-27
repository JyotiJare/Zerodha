package Daksha;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABC {

public static void main(String[] args, Duration Durations) {
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.get("https://www.google.com/");
	
}
}
