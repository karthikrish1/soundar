package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) throws InterruptedException {
		// step1: configuring chromedriver
		//step2: create an object for chromedriver class
		//step3: visiting website
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//max
		//ob.manage().window().maximize();
		
		//fullscreen
		//ob.manage().window().fullscreen();
		
		//refresh
		ob.navigate().refresh();
		
		// hold the page for certain seconds
		Thread.sleep(3000);
		
		//close
		ob.quit();

	}

}
