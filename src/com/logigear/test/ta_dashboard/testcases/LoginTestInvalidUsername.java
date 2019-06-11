package com.logigear.test.ta_dashboard.testcases;

import java.sql.Driver;
import java.util.Collection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.logigear.test.ta_dashboard.pom.HomePage;
import com.logigear.test.ta_dashboard.pom.LoginPage;
import com.logigear.testfw.common.BaseTest;
import com.logigear.testfw.common.TestExecutor;
import com.logigear.testfw.conf.DriverConfig;
import com.logigear.testfw.conf.TestEnvironmentConfig;
import com.logigear.testfw.driver.BaseDriver;
import com.logigear.testfw.driver.DriverManager;
import com.logigear.testfw.driver.LocalDriver;

public class LoginTestInvalidUsername extends BaseTest{

	@Test
	public void TC002() {
		System.out.println(
				"TC002 - Verify that user fails to login specific repository successfully via Dashboard login page with incorrect credentials");
		
		String USERNAME = "admin";
		String PASSWORD = "";
		String SAMPLE_REPO = "SampleRepository";
		
		LoginPage loginpage = new LoginPage();
		HomePage homePage = loginpage.login(USERNAME, PASSWORD, SAMPLE_REPO);

		WebDriver driver = new ChromeDriver();
		
		Alert alertText = driver.switchTo().alert();
		//String actualAlertMsg = alertText.getText();
		//String expectedAlertMsg = "Username or password is invalid";
		System.out.println("Alert message" +alertText.getText());
		//Assert.assertEquals(actualAlertMsg, expectedAlertMsg, "Can login with incorrect credentials");
		alertText.accept();
	}
}
