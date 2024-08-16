package com.automationCodes.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import com.automationCodes.pageObject.LoginPage;
import com.automationCodes.utilities.Helper;


public class LoginSteps extends BaseClass {
 
 @Given("User Launches Chrome Browser")
 public void user_launches_chrome_browser() {
  loginPage = new LoginPage(Helper.getDriver());   
 }

 @When("user opens Salesforce application link {string}")
 public void user_opens_Salesforce_application_link(String url) {
    Helper.openPage(url);    
 }
 
 @Then("User should see the  page title {string}")
 public void user_should_see_the_page_title(String string) {
   String loginPgTitle = Helper.getTitle();
   Assert.assertEquals(string, loginPgTitle); 
 }
 
 @When("User enters Username as {string} and Password as {string}")
 public void user_enters_username_as_and_password_as(String userName, String password) throws InterruptedException {
    if(userName.equalsIgnoreCase("Valid") && password.equalsIgnoreCase("Valid"))
    {
    userName= Helper.GetUserName();
    password= Helper.GetPassword();
    }
  loginPage.SetUserName(userName);
  loginPage.SetPassword(password);  
  Thread.sleep(5000);
  System.out.println("User Name: "+ userName);
  System.out.println("Password: "+ password);
 }

 @Then("User clicks on Login button with expected status as {string}")
 public void user_clicks_on_login_button(String expectedStatus) throws InterruptedException {
  loginPage.ClickBtnLogin();
  
  if (expectedStatus == "Both Fail")
  {
   String userNameValMessage = loginPage.getErrMsgUN();
   String pwdValMessage= loginPage.getErrMsgUN();
   
   Assert.assertEquals("Please enter your user name", userNameValMessage);
   Assert.assertEquals("Please enter your password", pwdValMessage);
   return;
  }
  else if (expectedStatus == "Missing Password")
  {
   String commonMsg =loginPage.getErrMsgPWD();
   Assert.assertEquals("Invalid username and password Please try again",commonMsg);
   return;
  }
  Thread.sleep(5000);
 }
 
 @Then("User should see the Salesforce Home page on successful login status {string}")
 public void user_should_see_the_Salesforce_home_page_on_successful_login_status(String status) throws InterruptedException { 
  
 
  if (status.equalsIgnoreCase("Pass"))
  {
   /* Assert.assertEquals(loginPage.getHomePgTitle(), "Home | Salesforce"); */
   System.out.println("Login Passed");
   Assert.assertEquals(Helper.getTitle(), "Home | Salesforce");
  } 
  Thread.sleep(5000);
 }
}
