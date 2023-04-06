Feature: To verify login page for OMR branch

  Scenario: To verfiy login page for OMR branch by using credentials
    Given User on the OMR branch page
    When User enters the email address and password
    And User click login button
    Then User should verify successful message for login
