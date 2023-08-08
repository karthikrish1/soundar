package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		//title
		System.out.println(ob.getTitle());
		
		//url
		System.out.println(ob.getCurrentUrl());
		
		//size: height and width of the window
		//Dimension
		Dimension d = ob.manage().window().getSize();
		System.out.println("height is "+ d.getHeight());
		System.out.println("width is "+ d.getWidth());
		
		//position: x and y value of the window
		// Point 
		
		Point pt = ob.manage().window().getPosition();
		System.out.println("X value is "+ pt.getX());
		System.out.println("y value is "+ pt.getY());
		
		// getting browser details=> capabilities
		Capabilities c = ob.getCapabilities();
		System.out.println("Name is "+ c.getBrowserName());
		System.out.println("version is "+ c.getVersion());
		System.out.println("os is "+ c.getPlatform());
		ob.quit();
	}

}
