package com.scp.testBase;

import java.util.Properties;

public class Config extends TestBase{
	
	private Properties PS;
	
	public Config(Properties PS){
		this.PS = PS;
	}
	public String getUserName() {
		return PS.getProperty("Username");
	}

	public String getPassword() {
		return PS.getProperty("Password");
	}

	public String getWebsite() {
		return PS.getProperty("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(PS.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(PS.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(PS.getProperty("ExplicitWait"));
	}

	public String getDbType() {
		return PS.getProperty("DataBase.Type");
	}

	public String getDbConnStr() {
		return PS.getProperty("DtaBase.ConnectionStr");
	}
	public String getBrowser() {
		return PS.getProperty("Browser");
	}

}
