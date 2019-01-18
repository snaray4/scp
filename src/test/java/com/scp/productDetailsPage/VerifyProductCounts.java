package com.scp.productDetailsPage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.scp.PageObject.HomePage;
import com.scp.PageObject.LoginPage;
import com.scp.PageObject.ProductCategoryPage;
import com.scp.helper.Logger.LoggerHelper;
import com.scp.testBase.Config;
import com.scp.testBase.TestBase;

/**
 * @author snaray4
 * 
 */
public class VerifyProductCounts extends TestBase{
	private final Logger log = LoggerHelper.getLogger(VerifyProductCounts.class);
	LoginPage loginPage;
	HomePage homePage;
	
	@Test
	public void testVerifyProductCounts(){
		log.info(VerifyProductCounts.class.getName()+" started");	
		
		Config config = new Config(PS);
		driver.get(config.getWebsite());
		
		homePage = new HomePage(driver);
		ProductCategoryPage pCate = homePage.clickOnMenu(homePage.womenMenu);
		pCate.selectColor(pCate.Orange);
		int count = pCate.getTotalProducts();
		
		if(count==3){
			log.info("product count is matching");
		}
		else{
			Assert.assertTrue(false,"product count is not matching");	
		}
		
	}

}
