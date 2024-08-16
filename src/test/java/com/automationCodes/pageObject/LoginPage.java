package com.automationCodes.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationCodes.utilities.Helper;
import com.automationCodes.utilities.PageRepository;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void SetUserName(String uName) {
		WebElement inputUsername = driver.findElement(PageRepository.LoginPage.USERNAME_FIELD);
		inputUsername.clear();
		inputUsername.sendKeys(uName);
	}

	public void SetPassword(String pwd) {
		WebElement inputPassword = driver.findElement(PageRepository.LoginPage.PASSWORD_FIELD);
		inputPassword.clear();
		inputPassword.sendKeys(pwd);
	}

	public void ClickBtnLogin() {
		WebElement btnLogin = driver.findElement(PageRepository.LoginPage.LOGIN_BUTTON);
		btnLogin.click();
	}

	public String getHomePgTitle() {
		return Helper.getTitle();

		/*
		 * WebElement divHomePageTitle =
		 * driver.findElement(PageRepository.HomePage.TITLE_LABEL);
		 * System.out.println("-"+divHomePageTitle.getAttribute("title")+"---"); return
		 * divHomePageTitle.getAttribute("title");
		 */
	}

	public String getErrMsgUN() {
		WebElement divErrorMsgUN = driver.findElement(PageRepository.LoginPage.ERROR_MESSAGE_USERNAME_FIELD);
		return divErrorMsgUN.getText();
	}

	public String getErrMsgPWD() {
		WebElement divErrorMsgPWD = driver.findElement(PageRepository.LoginPage.ERROR_MESSAGE_PASSWORD_FIELD);
		return divErrorMsgPWD.getText();
	}

}
