package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		WebElement ele = ob.findElementById("multiple-select-example");
		// create an object for select clss
		//pass dropdown box 
		// select the eoptions using index/value/visible text
		Select s= new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		
		Thread.sleep(3000);
		
		s.deselectByIndex(1);
		Thread.sleep(3000);
		ob.quit();
		
	}

}
