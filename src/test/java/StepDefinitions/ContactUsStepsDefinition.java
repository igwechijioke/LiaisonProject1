package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStepsDefinition {
	
	static WebDriver driver;
	@Given("User opens Liaison group URL")
	public void user_opens_Liaison_group_URL() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://liaisongroup.com");		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"termly-code-snippet-support\"]/div/div/div/div/div[2]/button[3]")).click();
	}
	
	@When("User clicks on contact tab")
	public void user_clicks_on_contact_tab() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/nav/div[1]/div/div[3]/div[1]/div/div/a[2]")).click();
Thread.sleep(3000);		
	}
	
	@And("User enters contact details and message")
	public void user_enters_contact_details_and_message() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='field_qh4icy']")).sendKeys("Felix Tester");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='field_29yf4d']")).sendKeys("felixtester@rockmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='field_as377']")).sendKeys("Test Message");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='field_9jv0r1']")).sendKeys("Kindly ignore, this is just a test message");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='field_28np0']")).sendKeys("Tester");
		
		//Select objSelect = new Select(driver.findElement(By.xpath("//select[@id='field_event_dropdown']")));
		//objSelect.selectByVisibleText("HPCA");
Thread.sleep(3000);		
	}
	
	@And("User clicks submit")
	public void user_clicks_submit() throws InterruptedException {
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.TAB)
		//.sendKeys("WebDriver")
		//.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#mapSubmit > button")).click();
Thread.sleep(3000);		

	}
	
	@Then("User is able to send contact message")
	public void user_is_able_to_send_contact_message() throws InterruptedException {
		Assert.assertTrue(driver.findElements(By.cssSelector("#contactForm > div.relative.z-10.lg\\:container.container > div > div > div > div > div > div > div.py-8.text-sm.w-\\[90\\%\\].text-right.underline > a")).size()>0,"User is able to send contact message");
Thread.sleep(3000);

	}
	
	@And("Close the browser")
	public void close_the_browser() {
		
		driver.quit();
	}

}
