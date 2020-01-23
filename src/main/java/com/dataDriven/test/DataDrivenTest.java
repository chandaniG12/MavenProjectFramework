package com.dataDriven.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BrowerLaunch;
import utilities.DropDownList;
import utilities.Xls_Reader;

public class DataDrivenTest {
	static WebDriver driver;
	@Test

	
	public void testcase1() 
	{
		
		BrowerLaunch cal = new BrowerLaunch();
        cal.launch();
        cal.menuSelecttor("Radio & Checkbox Demo");
//        cal.homescreen();
        cal.Radio();
        cal.menuSelecttor("Table Demo");
        



		
      }
	
	
	}
	
	

