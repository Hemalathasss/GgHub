import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwn {
	
		

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			

		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://the-internet.herokuapp.com/drag_and_drop";
		driver.get(URL);
		// It is always advisable to Maximize the window before performing DragNDrop action driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//Actions class method to drag and drop 
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b")); 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();
		//verify text changed in to 'Drop here' box 
		String textTo = to.getText();
		System.out.println(textTo);
	    Thread.sleep(3000);
		if(textTo.equals("Dropped!")) {
		System.out.println("PASS: File is dropped to target as expected");
		}else {
		System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
		//driver.close();
		} 
		
}


