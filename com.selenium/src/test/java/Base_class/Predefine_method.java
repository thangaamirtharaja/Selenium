package Base_class;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Predefine_method extends Base_class{

	 public static void Click_element(WebElement webElement) {	  
		  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOf(webElement));
		  webElement.click();
	 }

}
