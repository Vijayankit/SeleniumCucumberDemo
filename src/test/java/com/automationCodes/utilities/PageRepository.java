package com.automationCodes.utilities;

import org.openqa.selenium.By;

public class PageRepository {
    // Login Page Elements
    public static class LoginPage {
        public static final By USERNAME_FIELD = By.id("username");
        public static final By PASSWORD_FIELD = By.id("password");
        public static final By LOGIN_BUTTON = By.id("Login");
        public static final By ERROR_MESSAGE_LABEL = By.id("error");
        public static final By ERROR_MESSAGE_USERNAME_FIELD = By.xpath("//div[contains(text(), 'Please enter your username')]");
        public static final By ERROR_MESSAGE_PASSWORD_FIELD = By.xpath("//div[contains(text(), 'Please enter your password')]");
        
        
        
        
    }

    // Home Page Elements
    public static class HomePage {
        public static final By TITLE_LABEL = By.xpath("//title[contains(text(), 'Salesforce')]");
        public static final By LOGOUT_BUTTON = By.xpath("//button[contains(text(),'Logout')]");
    }

    // Account Page Elements
    public static class AccountPage {
        public static final By TITLE_LABEL = By.xpath("//h1[contains(text(),'Accounts')]");
        public static final By NEW_BUTTON = By.xpath("//button[contains(text(),'New')]");
        public static final By NAME_TEXT_FIELD = By.id("Account Name");
        public static final By TYPE_PICKLIST = By.id("Type");
        public static final By INDUSTRY_PICKLIST = By.id("Industry");
        public static final By ANNUAL_REVENUE_TEXT_FIELD = By.id("Annual Revenue");
        public static final By PHONE_TEXT_FIELD = By.id("Phone");
        public static final By WEBSITE_TEXT_FIELD = By.id("Website");
        public static final By BILLING_STREET_TEXT_AREA = By.id("Billing Street");
        public static final By BILLING_CITY_TEXT_FIELD = By.id("Billing City");
        public static final By BILLING_STATE_PICKLIST = By.id("Billing State/Province");
        public static final By BILLING_ZIP_TEXT_FIELD = By.id("Billing Zip/Postal Code");
        public static final By BILLING_COUNTRY_TEXT_FIELD = By.id("Billing Country");
        public static final By SAVE_BUTTON = By.xpath("//button[contains(text(),'Save')]");
    }

    // Contact Page Elements
    public static class ContactPage {
        public static final By TITLE_LABEL = By.xpath("//h1[contains(text(),'Contacts')]");
        public static final By NEW_BUTTON = By.xpath("//button[contains(text(),'New')]");
        public static final By FIRST_NAME_TEXT_FIELD = By.id("First Name");
        public static final By LAST_NAME_TEXT_FIELD = By.id("Last Name");
        public static final By TITLE_PICKLIST = By.id("Title");
        public static final By DEPARTMENT_TEXT_FIELD = By.id("Department");
        public static final By BIRTHDATE_DATE_FIELD = By.id("Birthdate");
        public static final By REPORTS_TO_PICKLIST = By.id("Reports To");
        public static final By PHONE_TEXT_FIELD = By.id("Phone");
        public static final By HOME_PHONE_TEXT_FIELD = By.id("Home Phone");
        public static final By MOBILE_PHONE_TEXT_FIELD = By.id("Mobile");
        public static final By OTHER_PHONE_TEXT_FIELD = By.id("Other Phone");
        public static final By FAX_TEXT_FIELD = By.id("Fax");
        public static final By EMAIL_TEXT_FIELD = By.id("Email");
        public static final By ASSISTANT_TEXT_FIELD = By.id("Assistant");
        public static final By ASSISTANT_PHONE_TEXT_FIELD = By.id("Asst. Phone");
        public static final By LEAD_SOURCE_PICKLIST = By.id("Lead Source");
        public static final By MAILING_STREET_TEXT_AREA = By.id("Mailing Street");
        public static final By MAILING_CITY_TEXT_FIELD = By.id("Mailing City");
        public static final By MAILING_STATE_PICKLIST = By.id("Mailing State/Province");
        public static final By MAILING_ZIP_TEXT_FIELD = By.id("Mailing Zip/Postal Code");
        public static final By MAILING_COUNTRY_TEXT_FIELD = By.id("Mailing Country");
        public static final By OTHER_STREET_TEXT_AREA = By.id("Other Street");
        public static final By OTHER_CITY_TEXT_FIELD = By.id("Other City");
        public static final By OTHER_STATE_PICKLIST = By.id("Other State/Province");
        public static final By OTHER_ZIP_TEXT_FIELD = By.id("Other Zip/Postal Code");
        public static final By OTHER_COUNTRY_TEXT_FIELD = By.id("Other Country");
        public static final By LANGUAGES_TEXT_FIELD = By.id("Languages");
        public static final By LEVEL_PICKLIST = By.id("Level");
        public static final By DESCRIPTION_TEXT_AREA = By.id("Description");
        public static final By SAVE_BUTTON = By.xpath("//button[contains(text(),'Save')]");
    }
}
