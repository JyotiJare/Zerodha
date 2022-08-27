package Daksha;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class jyoti {
public static void main(String[] args) throws Throwable {
	//WebDriverManager.chromedriver().create();
	//WebDriver driver=new ChromeDriver();
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.get("https://www.facebook.com/login/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000);");
	
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-1000);");
	
	Point p=new Point(100,100);
	driver.manage().window().setPosition(p);
	
	
	String actT="Log in to Facebook";
	String expT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("PASS");
	}
	else {
		System.out.println("no");
		
		String random=RandomString.make();
		//typecast takee screenshot interface
				TakesScreenshot ts=(TakesScreenshot)driver;
				//use getscreenshotAS ()
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\"+random+"d.1.jpg");

				//FILE CLASS CREAT OBJECT
				//File dest=new File("D:\\.daksh.jpg");
				//TRANSFER source to destinction 
				Files.copy(src, dest);
				
				
				
		}
			}
	}


