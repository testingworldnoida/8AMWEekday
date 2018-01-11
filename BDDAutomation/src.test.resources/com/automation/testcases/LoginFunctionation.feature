Feature: Puchasse of New Items

@Smoke
 Scenario: Login with valid credentials
 Given User is on login Page
 When User enters username
 And User enters password
 And User clicks on signin button
 Then User should login successfully
 And User should get welcome message
 
 Scenario: Login with Invalid credentials
 Given User is on login Page
 When User enters invalid username
 And User enters password
 And User clicks on signin button
 Then User should login successfully
 And User should get welcome message

  