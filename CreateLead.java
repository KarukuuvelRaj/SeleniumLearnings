package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(4000);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Karukkuvel");
		driver.findElementById("createLeadForm_lastName").sendKeys("Raj");
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		source.click();
		Select sel=new Select(source);
		sel.selectByVisibleText("Employee");
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		marketingCampaign.click();
		Select sel1=new Select(marketingCampaign);
		sel1.selectByValue("9001");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		industry.click();
		Select sel2=new Select(industry);
		List<WebElement> options = sel2.getOptions();
		int size = options.size();
		sel2.selectByIndex(size-2);
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		ownership.click();
		Select sel3=new Select(ownership);
		sel3.selectByIndex(5);
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		country.click();
		Select sel4=new Select(country);
		sel4.selectByVisibleText("India");
		driver.findElementByClassName("smallSubmit").click();
		String title = driver.getTitle();
		System.out.println("Thet title of the result page is: "+title);
		driver.close();
	}

}
