Feature: Application Login
#Background:
#  Given  validate the browser
#  When Browser is triggered
#  Then check if browser is started

@RegTest @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking langing page
    When  User login into application with "jin" and password "1234"
    Then  Home page is populated
    And   Cards are displayed are "true"
@MobileTest
  Scenario: Home page default login
    Given User is on NetBanking langing page
    When  User login into application with "jhon" and password "4321"
    Then  Home page is populated
    And   Cards are displayed are "false"
@MobileTest
  Scenario: Home page default login
    Given User is on NetBanking langing page
    When  User sign up with following details
    |jenny|abcd|Jhon@sad.com|Australia|254354564|
    Then  Home page is populated
    And   Cards are displayed are "false"
@WebTest
  Scenario Outline: Home page default login
    Given User is on NetBanking langing page
    When User login in to2 application with <username> and <password>
    Then  Home page is populated
    And   Cards are displayed are "true"
    Examples:
      |username  |password
      |user1  |pass1
      |user2  |pass2
      |user3  |pass3