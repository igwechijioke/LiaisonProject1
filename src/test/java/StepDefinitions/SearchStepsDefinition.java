package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsDefinition {
	
	static WebDriver driver;
	
	@Given("User opens URL")
	public void user_opens_Liaison_group_URL() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://liaisongroup.com");		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"termly-code-snippet-support\"]/div/div/div/div/div[2]/button[3]")).click();
	}
		
		
	
	@When("User clicks on the search function")
	public void user_clicks_on_the_search_function() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/nav/div[1]/div/div[3]/div[2]/button[2]")).click();
	Thread.sleep(3000);	
		
	}
	
	@And("User enters NHS At Work on the text field")
	public void user_enters_nhs_at_work_on_the_text_field() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@name='s']")).sendKeys("NHS At Work");
	Thread.sleep(3000);
	
	}

	@And("User clicks submit button")
	public void user_clicks_submit_button() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);

	}

	@Then("User is presented with information about NHS At Work")
	public void user_is_presented_with_information_about_nhs_at_work() throws InterruptedException {
		Assert.assertTrue(driver.findElements(By.xpath("//h3[@class='mb-0 text-xl font-medium']")).size()>0,"User can see search results");
	Thread.sleep(3000);	
	}
	    	
	
	@And("Close browser")
	public void close_the_browser() {
		driver.quit();
	}

}
