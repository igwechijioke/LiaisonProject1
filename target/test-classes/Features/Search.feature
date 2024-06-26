Feature: Search automation for Liaison Group
Scenario: User to be able to search for NHS At Work

Given User opens URL
When User clicks on the search function
And User enters NHS At Work on the text field
And User clicks submit button
Then User is presented with information about NHS At Work
And Close browser
