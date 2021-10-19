Feature: FantasyBook

  Scenario Outline: Fantasy book title is or isn't Two Towers
    Given title is "<title>"
    When I ask if title is Two Towers
    Then I should be told "<answer>"

  Examples:
    |title|answer|
    |Two Towers|Yes|
    |Three Towers|No|


  Scenario Outline: Fantasy book author is or isn't Tolkien
    Given writer is "<writer>"
    When I ask if writer is Tolkien
    Then I should be told "<answer>"

    Examples:
      |writer|answer|
      |Tolkien|Yes|
      |Three Towers|No|


  Scenario Outline: Fantasy book cover type is or isn't paperback
    Given cover type is "<cover>"
    When I ask if cover is paperback
    Then I should be told "<answer>"

    Examples:
      |cover|answer|
      |paperback|Yes|
      |Three Towers|No|


  Scenario Outline: Fantasy book number of pages is or isn't 350
    Given number of pages is <numOfPages>
    When I ask if number of pages is 352
    Then I should be told "<answer>"

    Examples:
      |numOfPages|answer|
      |352|Yes|
      |3|No|