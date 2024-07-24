package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Seat {
	WebDriver d;
	
	@Given("Open redbus")
	public void open_redbus() {
		WebDriverManager.firefoxdriver().setup();
		d= new FirefoxDriver();
		d.get("https://www.abhibus.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		d.manage().window().maximize();
		
	    
	
	}
	@When("Enter and and select the credential")
	public void enter_and_and_select_the_credential() throws InterruptedException
	{
		d.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(3000);

		d.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		d.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		Thread.sleep(3000);
	}
	@Then("Select bus seat")
	public void select_bus_seat() throws InterruptedException {
		WebElement Checkbox = d.findElement(By.id("price-drop"));							
		Checkbox.click();		
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		List<WebElement> c = d.findElements(By.xpath("//div[@class='scrollable-container  primary ']//input"));
		for(int i=0; i<c.size() && i<3;i++) 
		{
			c.get(i).click();		
		}
		Thread.sleep(5000);
	}
	@Then("Successfully select seat")
	public void successfully_select_seat() throws InterruptedException {
		d.findElement(By.xpath("//button[text()='Show Seats'][1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[text()='9U']")).click();
		Thread.sleep(5000);

		WebElement c2 = d.findElement(By.xpath("//p[text()='Kalasipalyam']"));							
		c2.click();		
		Thread.sleep(3000);
	}
	    
	}




