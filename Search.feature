Feature: feature to test google search funtionality

  Scenario: Validate google search is working
    Given Open google chrome 
    And user is on google search page
    When users enters a text in seach box
    And hits enter
    Then user is navigated to search result

 
