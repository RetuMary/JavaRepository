package stepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	private static WebDriver driver;

	@Before
	public void setUp() {

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

	}

	@Given("I am on the sign-up page")
	public void i_am_on_the_sign_up_page() {
		driver.get("https://islahiart.com/my-account");
	//	throw new io.cucumber.java.PendingException();
	}

	@When("I click on the sign up box")
	public void i_click_on_the_sign_up_box() {
		driver.findElement(
				By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/ul/li[2]"))
				.click();
	//	throw new io.cucumber.java.PendingException();
	}

	@And("I enter my email as {string}")
	public void i_enter_my_email_as(String string) {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[1]/div/input"))
				.sendKeys("email");
		//throw new io.cucumber.java.PendingException();
	}

	@And("I enter my First name {string}")
	public void i_enter_my_first_name(String string) {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[2]/div/input"))
				.sendKeys("First name");
	//	throw new io.cucumber.java.PendingException();
	}

	@And("I enter my Last name {string}")
	public void i_enter_my_last_name(String string) {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[3]/div/inputv"))
				.sendKeys("Last name");
	//	throw new io.cucumber.java.PendingException();
	}

	@And("I enter my password as {string}")
	public void i_enter_my_password_as(String string) {
		driver.findElement(By.xpath(
				"//*[@id=\\\"content\\\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[4]/div/input"))
				.sendKeys("password");
		//throw new io.cucumber.java.PendingException();
	}

	@And("I enter my confirm password as {string}")
	public void i_enter_my_confirm_password_as(String string) {
		driver.findElement(By.xpath(
				"//*[@id=\\\"content\\\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[5]/div/input"))
				.sendKeys("confirm password");
	//	throw new io.cucumber.java.PendingException();
	}

	@And("I click the accept privacy")
	public void i_click_the_accept_privacy() {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[6]/div/label/input"))
				.click();
		//throw new io.cucumber.java.PendingException();
	}

	@And("I click the sign-up button")
	public void i_click_the_sign_up_button() {
		driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/button"))
				.click();
	//	throw new io.cucumber.java.PendingException();
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
		String successMessage = driver.findElement(By.xpath("//div[contains(text(),'Welcome')]")).getText();
		Assert.assertTrue(successMessage.contains("Welcome"));
		//throw new io.cucumber.java.PendingException();
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
