package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		Set<Cookie> c = ob.manage().getCookies();
		System.out.println("Number of cookies "+ c.size());
		// know the details
		// enhanced for loop
		for(Cookie x: c)
		{
			System.out.println("Name is "+ x.getName());
			System.out.println("Path is "+ x.getPath());
			System.out.println("value is "+ x.getValue());
			System.out.println("Domain is "+ x.getDomain());
			System.out.println("Expiry date is "+ x.getExpiry());
			System.out.println();
		}
		
		ob.quit();
		
	}

}
