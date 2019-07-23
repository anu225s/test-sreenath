@Important
Feature: Cibil Login Feature
Background:
When title login page CIBIL
Then user enters username and password

| username |password|
| user1   | user1 |
Then user clicks login button

@Regression
Scenario: CIBIL Registration Tests Scenario
Then user clicks registration links