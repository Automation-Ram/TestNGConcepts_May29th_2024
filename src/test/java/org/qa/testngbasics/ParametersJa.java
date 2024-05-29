package org.qa.testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersJa {

	@Test
	@Parameters({ "url" })
	public void para(String url) {
		ChromeOptions op = new ChromeOptions();
		op.setBrowserVersion("125");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

	}

}
