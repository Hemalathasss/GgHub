import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
	
		 
	    public static void main(String[] args) {
	       
	        
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\Documents\\hema\\exe\\New folder\\chromedriver.exe ");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.linkedin.com/login");
	        
	        WebElement username=driver.findElement(By.id("username"));
	        WebElement password=driver.findElement(By.id("password"));
	        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
	        
	        username.sendKeys("example@gmail.com");
	        password.sendKeys("password");
	        login.click();
	        
	       
	        
	        
	    }
	 
	}
	