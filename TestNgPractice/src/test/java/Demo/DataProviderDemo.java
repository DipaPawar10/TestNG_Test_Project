package Demo;

import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProviderDemo {
	
	@DataProvider(name="serachDataSet")
	public Object[][] searchData(){
		Object[][] searchKeyWord = new Object[3][2];
		searchKeyWord[0][0]="India";
		searchKeyWord[0][1]="Qutub Minar";
		
		searchKeyWord[1][0]="Agra";
		searchKeyWord[1][1]="Taj Mahal";
		
		searchKeyWord[2][0]="Hyderabad";
	    searchKeyWord[2][1]="charminar";
	    
	    return searchKeyWord;
		}
	@Test(dataProvider="serachDataSet")
	public void TestCaseGoogleSearch(String country, String monument) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(country + " "+ monument);
		
		driver.findElement(By.name("btnK")).submit();		
		
		
	}

}
