package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class sc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		//method1: page up and page down
		/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);*/
		
		ob.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(3000);
	}

}
