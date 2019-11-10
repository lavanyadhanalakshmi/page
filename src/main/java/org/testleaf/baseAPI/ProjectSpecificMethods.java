package org.testleaf.baseAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.utils.ExcelDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethods {
	public String excelFileName;
	public String  Sheetname;

	public static ChromeDriver driver;
	@Parameters({"url"})
	
	@BeforeMethod
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_77/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}



	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		ExcelDataProvider data = new ExcelDataProvider();
		String[][] excelData = data.readExcelData(excelFileName,Sheetname);
		return excelData;


	}




}
