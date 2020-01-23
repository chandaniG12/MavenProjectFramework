package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownList {
	static WebDriver driver;
	
	public void homescreen()
	{ 
		
	
		driver.findElement(By.className("dropdown-toggle")).click();
		List<WebElement> dropdown_list = driver.findElements(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']//li/a"));
		System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
		for(int i=0; i<dropdown_list.size(); i++)
		{
			System.out.println(dropdown_list.get(i).getText());
			if(dropdown_list.get(i).getText().contains("Radio & Checkbox Demo")) 
			{
				dropdown_list.get(i).click();
				break;
			}
		}
	}
	
	
	public void Radio()
	{
		 WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
	     WebElement radio2 = driver.findElement(By.id("vfb-7-2"));	
	     
	   //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("Radio Button Option 1 Selected");		
	        
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("Radio Button Option 2 Selected");		
	        
	     // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.id("vfb-6-0"));	
	        
	     // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	         
	        		
	}
	
	
	}


