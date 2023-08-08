package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		Set<Cookie> c = ob.manage().getCookies();
		System.out.println("Number of cookies  before deletion"+ c.size());
		
		ob.manage().deleteAllCookies();
		
		Set<Cookie> c1 = ob.manage().getCookies();
		System.out.println("Number of cookies  after deletion"+ c1.size());
		ob.quit();
	}

}
