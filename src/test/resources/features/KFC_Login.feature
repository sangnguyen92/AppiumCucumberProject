@kfc
Feature: Login scenarios

  Scenario Outline: Login with invalid user name
    Given I am in Login page
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | invalidUsername | secret_sauce | Vui lòng nhập một địa chỉ email hợp lệ. |