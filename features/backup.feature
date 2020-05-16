Scenario: positive scenario
    Given open application
    When application open successfully
    Then validate title as "Welcome: Mercury Tours"
    And Close Application
    
    
  Scenario: when user click on sing-on link, sign-on page should open
      Given open application
    	When user click on "REGISTER" link in upper menu
    	Then validate title as "Register: Mercury Tours"
      And Close Application
      
Scenario: when user click on sing-on link, sign-on page should open
      Given open application
    	When user click on "SUPPORT" link in upper menu
    	Then validate title as "Under Construction: Mercury Tours"
      And Close Application
      
Scenario: when user click on sing-on link, sign-on page should open
      Given open application
    	When user click on "CONTACT" link in upper menu
    	Then validate title as "Under Construction: Mercury Tours"
      And Close Application  
      
      
      
      
  Scenario Outline: when user click on sing-on link, sign-on page should open
    Given open application
    When user click on <LinkValue> link in upper menu
    Then validate title as <Title>
    And Close Application

    Examples: 
      | LinkValue | Title                             |
      | SIGN-ON   | Sign-on: Mercury Tours            |
      | REGISTER  | Register: Mercury Tours           |
      | SUPPORT   | Under Construction: Mercury Tours |
      | CONTACT   | Under Construction: Mercury Tours |
      