Feature: Test the SauceDemo Appl

  Scenario: Test the login functionality
    Given User is on SauceDemo appl
    When User enters username "standard_user" and password "secret_sauce"
    And user click on login button
    Then user verify homepageTitle
