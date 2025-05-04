package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
	
	@FindBy(xpath = "//label[contains(text(),'Username')]/following::input[1]")
	public static WebElement username;
	@FindBy(xpath = "//label[contains(text(),'assword')]/following::input[1]")
	public static WebElement password;
	@FindBy(xpath = "//button[text()=' Login ']")
	public static WebElement login_button;
 
//	public static WebElement username(WebDriver driver) {
//		WebElement element = driver.findElement
//				(By.xpath("//label[contains(text(),'Username')]/following::input[1]"));
//		return element;
//	}
//	public static WebElement password(WebDriver driver) {
//		WebElement element = driver.findElement
//				(By.xpath("//label[contains(text(),'assword')]/following::input[1]"));
//		return element;
//	}
//	public static WebElement Login_button(WebDriver driver) {
//		WebElement element = driver.findElement
//				(By.xpath("//button[text()=' Login ']"));
//		return element;
//	}
}
