package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Login.Tc_Login_2;

public class Tc_Login_002 {
	static { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuvijaya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Tc_Login_2 r2 = new Tc_Login_2(driver);
	r2.signin();
	r2.login();
	driver.switchTo().frame(0);
	r2.usernameOrEmailField();
	r2.contin();
	r2.password();
	r2.login1();
}
}
