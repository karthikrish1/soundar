package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		/*
		 * xpath: xml path language
		 * relative
		 * absolute xpath
		 ** absolute xpath
		 *    start with /
		 *    find the element from the root to the desired element
		 *    copy=> copy full xpath* 
		 * */
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		/*
		 * relative xpath
		 *     starts with //
		 *     syntax: //*[@locator/attribute='value']  or //tagname[@loc/attribute='value']
		 *     shortcut: copy => copy xpath
		 * 
		 * */
		
		ob.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");

		ob.findElementByXPath("//*[@type='password']").sendKeys("12345");
		
		ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	}

}
