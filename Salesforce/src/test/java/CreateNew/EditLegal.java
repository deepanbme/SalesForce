package CreateNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLegal extends BaseClass{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		
		// Login 
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("Login")).click();
		
		//Click Toggle and ViewAll
		driver.findElement(By.xpath("(//div[@data-aura-class='uiTooltip']//div)[3]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
        
		//Select Legal Entities
		driver.findElement(By.xpath("//label[text()='Search apps or items...']/following::input")).sendKeys("Legal Entities");;
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		
		//passing my name in search
		driver.findElementByXPath("//input[@placeholder='Search Legal Entities and more...']").sendKeys("Salesforce automation by Barathi");
		driver.findElementByXPath("//input[@placeholder='Search Legal Entities and more...']").sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']//lightning-primitive-icon[1]")).click();
		driver.findElement(By.name("Edit")).click();

	}

}
