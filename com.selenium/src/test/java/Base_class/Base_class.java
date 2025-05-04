package Base_class;


import org.testng.annotations.BeforeClass;

import Page_Objects.Login_page;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Base_class {
	public static WebDriver driver;
	public static WebDriverWait wait = null;
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  PageFactory.initElements(driver , Login_page.class); 
	  
	  
  }
  
  public static void Click_element(WebElement webElement) {	  
		  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOf(webElement));
		  webElement.click();

}
  
  @AfterClass
  public void afterClass() {
//	  driver.close();
//	  driver.quit();
  }

}
