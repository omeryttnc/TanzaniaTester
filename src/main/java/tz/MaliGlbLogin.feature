@wip
Feature: MaliGlbLoginAgentPositive

  Background: login functionality with possible scenarios
    Given user is on the Global Trader page
    When user click Seller Join Now
    When user select agent seller to register

  Scenario: TC01_user_should_able_to_register_as_an_agent_with_valid_credentials
    When user fill all and mandatory fields
    And user clicks Register button
    Then verify successful message
#Thank you to join our team. You are Registered Successfully.
