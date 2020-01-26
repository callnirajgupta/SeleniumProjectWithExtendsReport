#Author: your.email@your.domain.com
#Keywords Summary :

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  
  @tag2 @hooking @testing1
  Scenario Outline: Title of your scenario outline
    Given usr enter username "<name>" and password "<value>"
    

    Examples: 
      | name  | value | status  |
      | DEV1 |     5 | success |
      | DEV1 |     7 | Fail    |
      
    @tag1 @hooking
  Scenario Outline: Title of your scenario outline
    Given usr enter username "<name>" and password "<value>"

    Examples: 
      | name  | value | status  |
      | UAT1 |     5 | success |
      | UAT2 |     7 | Fail    |
