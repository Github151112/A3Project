package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BaseClass{

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	/*
	 * this method will perform login operation
	 */
	public void toLoginIntoDemo(String email,String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckBox.click();
		loginButton.click();
	}
	
	public void toPerformInvalidLoginIntoDemo(String email,String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckBox.click();
		loginButton.click();
		emailTextField.clear();
	}

}
