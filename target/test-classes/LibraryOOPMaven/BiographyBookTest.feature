Feature: BiographyBook

  Scenario Outline: Biography book title is or isn't Becoming
    Given biography book title is "<title>"
    When I ask if biography book title is Becoming
    Then I should be told "<answer>", biography book title isn't Becoming

  Examples:
    |title|answer|
    |Becoming|Yes|
    |Three Towers|No|