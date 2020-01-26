@feature @regerssion
Feature: dfgfg

@test1
Scenario: SCR001
Given user open the browser and enter url
When user enter userid and password
Then Verify thta user is logged in successfully


@integer @smoke @test1
Scenario Outline: SCR002
Given user create "<RowNum>" account

Examples:
|RowNum|
|5|
|2|


@parameter @Ignore
Scenario Outline: parameter from step
Given usr enter username "niraj" and password "gupta"
When user enter the details and fill form with following parameter for rowNum "<RowNum>"
  |RowNum|Name |Title|EmailId   |Company|
  |0     |Niraj|Gupta|call@gmail|ABC company|
  |1     |manmohan|Gupta|call@gmail|ABC company|
  |2     |vijay|Gupta|call@gmail|ABC company|
  |3     |prakash|Gupta|call@gmail|ABC company|
Then verify that username is display in home page
Examples:
|RowNum|
|0|
|1|
|2|
|3|



@map
Scenario: list
Given user enter following data
|name|gupta|
|company|ABC|
|TITLE|MR|

@list
Scenario: list
Given user enter following data in list
|gupta|
|ABC|
|MR|


@listofList
Scenario: list
Given user enter following data in list of list
 |0     |Niraj|Gupta|call@gmail|JP Morgan|
  |1     |manmohan|Gupta|call@gmail|JP Morgan|
  |2     |vijay|Gupta|call@gmail|JP Morgan|
  |3     |prakash|Gupta|call@gmail|JP Morgan|

  
@DataProvider
Scenario: DataProvider
Given user enter the data from excel and execute number of time based data


@DataProvider1
Scenario Outline: DataProvider1
Given user enter url fromm rownum "<RowNum>"
When user enter username and password from rownum "<RowNum>"
Then user get the details

Examples:
|RowNum|
|2|
|3|
|4|
  