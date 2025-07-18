Feature: Login

  Scenario: Successful login

    Given user is on the Home page
    When user clicks Login icon
    Then user verifies Login form is displayed
    And user enters valid data
    And  user clicks on Anmelden button
    And user clicks on User icon
    Then user verifies his name


  @wrongPassword

  Scenario: Login with valid email and wrong password

    Given user is on the Home page
    When user clicks Login icon
    And user enters valid email and wrong password
    And user clicks on Anmelden button
    Then user verifies error message is displayed


