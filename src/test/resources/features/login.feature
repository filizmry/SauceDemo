Feature:Login Functionality

  Scenario:Success login
    Given The user on the login page
    When The user type in valid credentials:"standard_user" and "secret_sauce"
    Then The user should be able to see page title:"Products"