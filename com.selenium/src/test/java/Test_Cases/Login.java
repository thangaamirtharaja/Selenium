package Test_Cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base_class.Base_class;
import Base_class.Predefine_method;
import Page_Objects.Login_page;


public class Login extends Base_class {
  @Test
  public void Login_With_Valid_Credential() {
	  
	  login_Steps();
	  
	  

  }
  public static void login_Steps() {
	  Login_page.username.sendKeys("Admin");
	  Login_page.password.sendKeys("admin123");
	  Predefine_method.Click_element(Login_page.login_button);
}
}
