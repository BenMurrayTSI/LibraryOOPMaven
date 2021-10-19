Feature: Is title Two Towers?
  We all like Two Towers

  Scenario Outline: Title is or isn't Two Towers
    Given Title is "<title>"
    When I ask if title is Two Towers
    Then I should be told "<answer>"

  Examples:
    |title|answer|
    |Two Towers|Yes|
    |Three Towers|No|