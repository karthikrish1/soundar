package seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		ob.executeScript("document.body.style.zoom='200%'");// zoom in
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='100%'");// nrml
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='20%'");// zoom out
		Thread.sleep(3000);
		ob.quit();
	}

}
