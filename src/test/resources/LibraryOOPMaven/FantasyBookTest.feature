Feature: FantasyBook

  Scenario Outline: Fantasy book title is or isn't Two Towers
    Given fantasy book title is "<title>"
    When I ask if fantasy book title is Two Towers
    Then I should be told "<answer>", fantasy book title isn't Two Towers

  Examples:
    |title|answer|
    |Two Towers|Yes|
    |Three Towers|No|
