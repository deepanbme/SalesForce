package CreateNew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task extends BaseClass{
    
	@Test
	public void EditTask()
	{
	driver.findElement(By.xpath("(//div[@data-aura-class='uiTooltip']//div)[3]")).click();
	driver.findElement(By.xpath("//button[@class='slds-button']")).click();
	sleepDriver(2000);
	driver.findElement(By.xpath("//div[@class='slds-grid slds-grid_pull-padded slds-wrap app-dnd-identifier']//one-app-launcher-app-tile//span//p[text()='Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Tasks']")).click();
		

	}

}
