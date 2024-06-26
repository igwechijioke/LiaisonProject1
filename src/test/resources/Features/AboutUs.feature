Feature: AboutUs automation for Liaison Group
Scenario: User to be able to view mission and vision statement of Liaison Group

Given User is on the website
When User clicks on AboutUs
When User selects mission and values
Then User is presented with the mission and vision statement page
And Quit the browser