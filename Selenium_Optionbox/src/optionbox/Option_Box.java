package optionbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Option_Box {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.letskodeit.com/practice");

        WebElement bmwCheck = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='bmwcheck']")));
        bmwCheck.click();  
        waitForUser();     
       
        WebElement benzCheck = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='benzcheck']")));
        benzCheck.click();  
        waitForUser();      
        
        WebElement hondaCheck = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='hondacheck']")));
        hondaCheck.click();  
        waitForUser();       

        //Now unchecking all the option boxes
        bmwCheck.click();  
        waitForUser();     

        benzCheck.click();  
        waitForUser();     
        
        hondaCheck.click();  
        waitForUser();      

        driver.close();
	}

	public static void waitForUser() {
		try {
			Thread.sleep(2000);  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
