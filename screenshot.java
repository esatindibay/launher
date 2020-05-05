package fourthstep;
/*
created by**** Esat INDIBAY **** from St.Louis MO
*/
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class screenShot {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.enuygun.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Public\\scrnsht.png"));
		
	}
//this change is executed by sidesat branch
}
