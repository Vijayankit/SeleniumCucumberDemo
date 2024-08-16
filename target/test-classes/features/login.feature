Feature: Login

Background: The User opens login Page
 Given User Launches Chrome Browser
 When user opens Salesforce application link "https://login.salesforce.com/"
 Then User should see the  page title "Login | Salesforce"

Scenario Outline: Validating the Login functionality
    When User enters Username as "<username>" and Password as "<password>" 
    Then User clicks on Login button with expected status as "<status>"
    Then User should see the Salesforce Home page on successful login status "<status>"
    
 Examples:
    | username | password   | status      |
    |          |            | Both Fail   |
    | Valid    |            | Missing Password  |    
    | ankit.acodes@gmail.com    | T@654321      | Pass   |
    

    
    
    