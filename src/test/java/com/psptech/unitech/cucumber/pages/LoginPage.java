package com.psptech.unitech.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.psptech.unitech.cucumber.baseClass.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage () {
		super (driver);
	}
@FindBy (xpath = "(//a[@href='register.php'])[1]")
public WebElement loginRegistrationLink;

@FindBy(name= "userName")
public WebElement loginUserName;

@FindBy(name= "password")
public WebElement loginPassword;

@FindBy(name= "submit")
public WebElement loginSubmitButton;


}
