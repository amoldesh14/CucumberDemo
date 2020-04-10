Feature: Facebook Terms, Data Policy and Cookies Agreement

  Scenario: Facebook Terms Agreement
    Given Open browser and launch Facebook for verifying Terms
    When User clicks on Terms Link
    Then Verify the Terms page is loaded correctly
    Then Close Terms page and quit

  Scenario: Facebook Data Policy Agreement
    Given Open browser and launch Facebook  for verifying Data Policy
    When User clicks on Data Policy Link
    Then Verify the Data Policy page is loaded correctly
    Then Close Data Policy page and quit

  Scenario: Facebook Cookies Agreement
    Given Open browser and launch Facebook for verifying Cookies
    When User clicks on Cookies Link
    Then Verify the Cookies page is loaded correctly
    Then Close Cookies page and quit
