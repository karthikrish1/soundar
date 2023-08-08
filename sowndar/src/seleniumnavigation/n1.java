package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");//1
		Thread.sleep(3000);
		ob.findElementByLinkText("Images").click();//2
		Thread.sleep(3000);
		ob.navigate().back();//step1
		Thread.sleep(3000);
		ob.navigate().forward();
		Thread.sleep(3000);
		ob.quit();
		
	}

}
