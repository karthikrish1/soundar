package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		// create an object for dimension class
		// pass desired height and width in it
		// apply it on the window
		
		Dimension d= new Dimension(300,400);
		ob.manage().window().setSize(d);
	}
}
