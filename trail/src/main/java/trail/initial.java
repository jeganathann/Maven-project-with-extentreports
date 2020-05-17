package trail;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***********");
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("report.html");
		ExtentReports extentreports = new ExtentReports();
		extentreports.attachReporter(report);	
		ExtentTest test = extentreports.createTest("jegan");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/4.1.5");
		test.pass("Test Pass");
		test.pass("Test Fail");
		driver.close();
		extentreports.flush();
	}
	

}
