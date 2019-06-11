package com.logigear.test.ta_dashboard.pom;

import com.logigear.testfw.common.BasePOM;
import com.logigear.testfw.element.Element;

public class HomePage extends BasePOM {
	
	// Elements
		protected Element RepoName;
		protected Element logout;
		protected Element account;
	
	public HomePage()
	{
		super(HomePage.class);
	}
	
	@Override
	public void initPageElements() {
		// TODO Auto-generated method stub
		this.RepoName = new Element(getLocator("RepoName").getBy());
		this.logout = new Element(getLocator("logout").getBy());
		this.account = new Element(getLocator("account").getBy());
	}
	

	public String getRepoName() {
		return RepoName.getText();
	}
	
	public void logOut() {
		account.click(); 
		waitForPageDisplay();
		 logout.click();
	}
	

	public HomePage waitForPageDisplay()
	{
		// TODO
		return this;
	}
	
}
