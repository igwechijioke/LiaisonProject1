Feature: ContactUs page automation for Liaison Group website
Scenario: User to be able to get in touch with Liaison Group

Given User opens Liaison group URL  
When User clicks on contact tab 
And User enters contact details and message
And User clicks submit
Then User is able to send contact message
And Close the browser
