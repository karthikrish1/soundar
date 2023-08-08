package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) {
		//word/groupofword=> click on it=> new url will be opened 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//ob.findElementByLinkText("About").click();
		
		ob.findElementByPartialLinkText("Ab").click();
	}

}
