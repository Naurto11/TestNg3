package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {

		PageFactory.initElements(driver, this);
		
		
	
	}
	
	@FindBys({
		
		@FindBy(xpath="//span[@class='field-validation-error text-danger']"),
		@FindBy(xpath="//span[text()='Username not found or matched']")
	})
	
	private WebElement errorpage;
	
	
	public WebElement getErrorpage() {
		return errorpage;
	}

	@FindBys({
		
		@FindBy(xpath="//a[@title='Log In']"),
		@FindBy(xpath="//i[@class='fa fa-user-o mr-10']")
	})
	
	private WebElement pressbtn;
	
	@FindAll({
		
		@FindBy(xpath="(//input[@type='text'])[2]"),
		@FindBy(xpath="//input[@placeholder='eMail ID / Mobile # / ID #']"),
		@FindBy(xpath="//input[@id='txtUserName']")
	})
	private WebElement editBox;
	
	@FindBys({
		
		
		@FindBy(xpath="//input[@id='txtPassword']"),
		@FindBy(xpath="//input[@type='password']")
	})
	
	private WebElement ansBox;
	
	@FindAll({
		
		@FindBy(xpath="//input[@type='submit']"),
		@FindBy(xpath="//input[@class='btn btn-gfort']"),
		@FindBy(xpath="//input[@value='LOG IN']")
	})
	
	private WebElement lognbtn;
	
	
	

	public WebElement getPressbtn() {
		return pressbtn;
	}

	public WebElement getEditBox() {
		return editBox;
	}

	public WebElement getAnsBox() {
		return ansBox;
	}

	public WebElement getLognbtn() {
		return lognbtn;
	}
	
	

}
