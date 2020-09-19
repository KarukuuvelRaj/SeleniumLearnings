package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Debit Limited Account");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		driver.findElementById("groupNameLocal").sendKeys("LocalNameField");
		driver.findElementById("officeSiteName").sendKeys("SiteName");
		driver.findElementById("annualRevenue").sendKeys("1500000");
		WebElement industry = driver.findElementByName("industryEnumId");
		Select sel=new Select(industry);
		sel.selectByIndex(3);
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select sel1=new Select(ownership);
		sel1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElementById("dataSourceId");
		Select sel2=new Select(source);
		sel2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElementById("marketingCampaignId");
		Select sel3=new Select(marketing);
		sel3.selectByIndex(6);
		WebElement state = driver.findElementById("generalStateProvinceGeoId");
		Select sel4=new Select(state);
		sel4.selectByValue("TX");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();		
	}

}
