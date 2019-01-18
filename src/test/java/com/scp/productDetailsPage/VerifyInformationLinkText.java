package com.scp.productDetailsPage;

import org.apache.log4j.Logger;

import com.scp.helper.Logger.LoggerHelper;
import com.scp.testBase.Config;
import com.scp.testBase.TestBase;

/**
 * @author snaray4
 * 
 */
public class VerifyInformationLinkText extends TestBase{
	private final Logger log = LoggerHelper.getLogger(VerifyInformationLinkText.class);
	
	public void testVerifyInformationLinkText(){
		log.info(VerifyInformationLinkText.class.getName()+" started");	
		
		Config config = new Config(PS);
		driver.get(config.getWebsite());
	}
}
