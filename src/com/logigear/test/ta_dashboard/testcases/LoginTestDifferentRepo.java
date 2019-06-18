package com.logigear.test.ta_dashboard.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.logigear.test.ta_dashboard.pom.HomePage;
import com.logigear.test.ta_dashboard.pom.LoginPage;
import com.logigear.testfw.common.BaseTest;

public class LoginTestDifferentRepo extends BaseTest{

	@Test
	public void TC004() {
		System.out.println(
				"TC004 - Verify that user is able to log in different repositories successfully after logging out current repository");
		
		String USERNAME = "administrator";
		String PASSWORD = "";
		String SAMPLE_REPO = "SampleRepository";
		String Another_REPO = "Dashboard_NguyenDucHai";
		
		//login repo
		LoginPage loginpage = new LoginPage();
		HomePage homePage = loginpage.login(USERNAME, PASSWORD, SAMPLE_REPO);

		String actualMsg = homePage.getRepoName();
		System.out.println("RepoName is: "+actualMsg);
		String expectedMsg = "SampleRepository";
		Assert.assertEquals(actualMsg, expectedMsg, "Can't login with correct credentials");
		
		//logout dashboard 
		homePage.logOut();
		
		
		//login another repo
		LoginPage loginpage1 = new LoginPage();
		HomePage homePage1 = loginpage1.login(USERNAME, PASSWORD, Another_REPO);
		
		String actualMsg1 = homePage1.getRepoName();
		System.out.println("Another RepoName is: "+actualMsg1);
		String expectedMsg1 = "Dashboard_NguyenDucHai";
		Assert.assertEquals(actualMsg1, expectedMsg1, "Can't login with correct credentials");
		
		
		
		
	}
}
