package stepdefinition;

import org.cuumber.resource.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddCustomerSteps extends BaseClass{
	static WebDriver driver;
	@Given("the user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\JanBatch2021\\org.Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		
	    throw new cucumber.api.PendingException();
	}

	@Given("the user click on Add Customer")
	public void the_user_click_on_Add_Customer() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("details-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//font[text()='Add Customer'])[1]")).click();
		
	    throw new cucumber.api.PendingException();
	}

	@When("the user should enter all the details")
	public void the_user_should_enter_all_the_details() {

		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Manivannan");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Thamilselvan");
		driver.findElement(By.xpath("//label[@id='message50']")).sendKeys("t.manier404@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9894738299");
		
		throw new cucumber.api.PendingException();
	}

	@When("the user clicks submit button")
	public void the_user_clicks_submit_button() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		throw new cucumber.api.PendingException();
	}

	@When("the user shloud displayed with customer id")
	public void the_user_shloud_displayed_with_customer_id() {

		Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Customer ID']")).isDisplayed());
		
		throw new cucumber.api.PendingException();
	}

}
