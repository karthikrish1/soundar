package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		// number of images, links, elements with div, inpu
		
		//images: img
		//links=> a
		// element: div, input, li...
		List<WebElement> l1 = ob.findElementsByTagName("img");
		System.out.println("Number of images "+ l1.size());
		
		
		List<WebElement> l11 = ob.findElementsByTagName("a");
		System.out.println("Number of linkss "+ l11.size());
		
		
		List<WebElement> l12 = ob.findElementsByTagName("div");
		System.out.println("Number of elements with div "+ l12.size());
		ob.quit();
	}

}
