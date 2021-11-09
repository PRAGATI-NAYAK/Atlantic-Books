Feature: Application Features

Scenario: Clicking on different links on Home Page

Given chrome browser starts 
And navigates to "https://atlanticbooks.com/"
When clicked on link About Us
Then it should display About Us Page
 