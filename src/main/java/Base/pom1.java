package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
public pom1(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	//step2 Initialization
	public void Pom1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//Utilization
	public void enterUN(String username ) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}

}
