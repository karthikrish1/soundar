package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");

		//webelements: present inside a frame
		//switch yur control to that frame
		// id, name, index 
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele1 = ob.findElementById("draggable");
		WebElement ele2 = ob.findElementById("droppable");
		ac.dragAndDrop(ele1, ele2).build().perform();
	}

}
