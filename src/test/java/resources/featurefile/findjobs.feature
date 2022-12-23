Feature: Find jobs test

  As a User I want to find jobs from cv library website

  Scenario Outline: verify That I should be able to find job
    Given I am on Homepage
    When I enter "<jobtitle>"
    And I enter "<location>"
    And I select "<distance>"
    And I click on moresearchoptionslink
    And I enter "<SalaryMin>"
    And I enter "<SalaryMax>"
    And I select"<SalaryType>"
    And I select "<JobType>"
    Then I click on Find Jobs
    Examples:
         | jobtitle          | location      | distance   |  SalaryMin  | SalaryMax   |  SalaryType  | JobType  |
         |Manual Tester      |Harrow         |2 miles     | 20000        |25000         | perannum      |permanent  |
         |Customer Adviser   |Essex          |1 mile      | 21000        |26000         | perannum      |permanent  |
         |Book Keeper        |Slough         |5 miles     | 22000        |28000         | perannum      |permanent  |
         |Sales Assistant    |Epping         |2 miles     | 500          |700           | perweek       |contract   |
         |Driving            |Watford        |3 miles     | 600          |650           | perweek       |contract   |
         |Assistant Teacher  |Wembley        |2 miles     | 12000        |18000         | perannum      | permanent |