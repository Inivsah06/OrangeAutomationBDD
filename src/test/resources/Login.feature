Feature: Login
In order to manage the employee records
As an admin
I would like to access the portal

Scenario: Valid Credentials
Given I have browser with OrangeHRM application
When I enter username as 'Admin'
And I enter password as 'admin123'
And I click on login
Then I should get access to dashboard with header 'Dashboard'

Scenario: Invalid Credentials
Given I have browser with OrangeHRM application
When I enter username as 'john'
And I enter password as 'john123'
And I click on login
Then I should get access to dashboard with header "Invalid Credentials"

Examples:
| username | password | expected_error      |
|john      | john123  | Invalid credentials |
|peter     | peter123 | Invalid credentials |
