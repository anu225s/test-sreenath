@Important
Feature: CIBIL Registration Feature
Background:
When title login page CIBIL
Then user enters username and password

| username |password|
| user1   | user1 |
Then user clicks login button

@Regression
Scenario Outline:CIBIL Registration Test Scenario
Then user clicks registration links
Examples:
| username |password|
| user1   | user1 |

@Smoke
Scenario Outline:CIBIL Permanent Registration
Then user clicks registration links
Then fill the registration form "<firstname>" and "<lastname>" and "<dob>" and "<age>" and "<panNo>" and "<address1>" and "<mobileno>" and "<zipcode>"
Examples:
| username|password| firstname|lastname |dob |age |panNo |address1|mobileno|zipcode|
| user1   | user1 | Rahul    | singh |04-02-2009 |25|APGPT4906H|raheza plaza ghatkopar|8801320960|400806|