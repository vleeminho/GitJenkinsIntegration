package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Login extends TestBase{

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")WebElement username;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")WebElement passowrd;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")WebElement loginButton;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div") WebElement loginPOPUP;
	
	String url="https://www.flipkart.com/";
	
	
	
	public void login() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver, 25);
		Actions action=new Actions(driver);
		try {
			driver.get(url);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(loginPOPUP));
			action.moveToElement(loginPOPUP).build().perform();
			wait.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys("nagawade.vrushali@gmail.com");
			passowrd.sendKeys("vrushali8");
			loginButton.click();
		}catch (Exception e) {
			throw e;
		}
		
		
	}
	
	
}
