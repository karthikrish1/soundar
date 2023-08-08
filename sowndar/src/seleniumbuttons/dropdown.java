package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		WebElement ele = ob.findElementById("carselect");
		// create an object for select clss
		//pass dropdown box 
		// select the eoptions using index/value/visible text
		Select s= new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		s.selectByVisibleText("Benz");
	}

}
