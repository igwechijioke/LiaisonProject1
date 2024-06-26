package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsStepsDefinition {
	
	static WebDriver driver;
	
	@Given("User is on the website")
	public void user_is_on_the_website() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://liaisongroup.com");		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"termly-code-snippet-support\"]/div/div/div/div/div[2]/button[3]")).click();
	}

	@When("User clicks on AboutUs")
	public void user_clicks_on_AboutUs() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/nav/div[1]/div/div[3]/div[1]/div/div/div[1]/div[1]/a")).click();
Thread.sleep(3000);	    
	}

	@And("User selects mission and values")
	public void user_selects_mission_and_values() throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Our Mission and Values']")).click();	
Thread.sleep(3000);	    
	}

	@Then("User is presented with the mission and vision statement page")
	public void user_is_presented_with_the_mission_and_vision_statement_page() throws InterruptedException {
		Assert.assertTrue(driver.findElements(By.cssSelector("div[class='[&_h2:only-child]:mb-0'] p")).size()>0,"User sees Vision and Mission statement");
Thread.sleep(3000);		
	}

	@And("Quit the browser")
	public void quit_the_browser() {
	    driver.quit();
	}




}
