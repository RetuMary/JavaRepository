Feature: User sign up
  Given User is on Islahi Art page"https://islahiart.com/my-account/"

  Scenario: Successful sign up
    Given I am on the sign-up page
    When I click on the sign up box
    And I enter my email as "retu.rodrigues@yahoo.com"
    And I enter my First name "Retu"
    And I enter my Last name "Rodrigues"
    And I enter my password as "Topon1988@"
   	And I enter my confirm password as "Topon1988@"
    And I click the accept privacy
    And I click the sign-up button
    Then I should see a confirmation message
