package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
      @FindBy(name="username")
      WebElement txtUserName;
      
      @FindBy(name="password")
      WebElement txtPassword;
      
      @FindBy(name="Log In")
      WebElement Login;
      
      public void setUserName(String uname)
      {
    	  txtUserName.sendKeys(uname);
      }
      
      public void setPassword(String pwd)
      {
    	  txtPassword.sendKeys(pwd);
      }
      public void clickSubmit()
      {
    	 Login.click();
      }
}
