Feature: Creating a Page from Facebook Home Page

  Scenario: Create a Page Functionality Check
    Given Open browser and launch Facebook
    When User clicks on Create a Page Link
    Then Verify the page is loaded correctly
    Then Close browser and quit
