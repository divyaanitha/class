
Feature:Validating the login page of application
Background:
Given  Launch the browser
And  open the application

Scenario Outline: Login the application with valid credentials
When  enter the "<username>" and "<password>"
And  click the login button
Then  validate the login "<msg>" message

Examples:
|username|password|msg|
|divya|ababcd|Wrong Credentials|