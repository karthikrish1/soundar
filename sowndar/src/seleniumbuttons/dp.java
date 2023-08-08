package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);
		ob.findElementById("datepicker").click();
		for(int i=0;i<2;i=i+1)
		{
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(3) > a").click();
	}

}
