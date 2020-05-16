 Feature: All Sanity scenarios
 
 
	@sanity @linksvalidation @uppermenu 
   Scenario Outline: when user click on sing-on link, sign-on page should open
    When user click on <LinkValue> link in upper menu
    Then validate title as <Title>

    Examples: 
      | LinkValue | Title                             |
      | SIGN-ON   | Sign-on: Mercury Tours            |
     