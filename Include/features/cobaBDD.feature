Feature: Coba BDD Cucumber

	@konz
  Scenario Outline: Mencoba fitur BDD di Katalon
    Given user login on the page
    When user input <username> and <password>
    And user pressing login button
    Then user directed to home page

