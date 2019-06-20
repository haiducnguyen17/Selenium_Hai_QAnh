package com.logigear.test.ta_dashboard.pom;

import com.logigear.testfw.common.TestExecutor;
import com.logigear.testfw.driver.BaseDriver;
import com.logigear.testfw.element.Element;

public class NewPagePopUp extends HomePage{
	// Elements
			protected Element PageName;
			protected Element ParentName;
//			protected Element 
//			protected Element 
//			protected Element 
//			protected Element 
//			protected Element 
		
		public NewPagePopUp()
		{
			super();
		}
		
		@Override
		public void initPageElements() {
			// TODO Auto-generated method stub
			this.PageName = new Element(getLocator("PageName_NewPagePopUp").getBy());
			this.ParentName = new Element(getLocator("ParentName_NewPagePopUp").getBy());
			
		}
		
		public NewPagePopUp selectParentPage(String index){
			BaseDriver driver = TestExecutor.getInstance().getCurrentDriver();
				
			
		}

}
