package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		
		//alert=> popup/messagebox/confrm box
		
		//ob.executeScript("alert('time out')");//ok
		ob.executeScript("window.confirm('hi')");//ok/cancel
		
		//switch our control to alert
		
		Thread.sleep(3000);
		Alert al = ob.switchTo().alert();
	    al.accept(); 
	    Thread.sleep(3000);
	    ob.quit();
	}

}
