@fb
Feature: check the  facebook login functionality


  @tag1
  Scenario: Title of your scenario
    Given user is in facebok page
    When user enter "t.manier" and "asdfasdf" and click login button
 
 Scenario Outline: Data Driven
 
 		Given user is in facebok page
    When user enter "<userName>" and "<passWord>" and click login button
    Examples:
    |userName|passWord|
    |t.manier|asdfasdfs|
    |maniboss|jhkbbkjgk|