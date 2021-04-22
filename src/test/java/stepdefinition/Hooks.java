package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.cuumber.resource.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeCla() {
		System.out.println(new Date());

	}
	
	
	@After
	public void screenshot(String name) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		try {
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File ("C:\\Users\\Dell\\Desktop\\screenshot"+name+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
}
}
