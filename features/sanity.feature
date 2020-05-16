Feature: All Sanity scenarios


	@regression @registeruser
  Scenario: Register user
    When user click on "REGISTER" link in upper menu
    And fill form and register
      | FirstName | LastName | Phone      | Email             | Address1 | Address2 | City | State | PostalCode | Country | password |
      | test1     | test2    | 9764326834 | test451@gmail.com | add1     | add2     | Pune | MH    |     400145 | INDIA   | test123  |
      | test1     | test2    | 9764326834 | test452@gmail.com | add1     | add2     | Pune | MH    |     400145 | INDIA   | test123  |
      | test1     | test2    | 9764326834 | test454@gmail.com | add1     | add2     | Pune | MH    |     400145 | INDIA   | test123  |
      | test1     | test2    | 9764326834 | test455@gmail.com | add1     | add2     | Pune | MH    |     400145 | INDIA   | test123  |
      | test1     | test2    | 9764326834 | test456@gmail.com | add1     | add2     | Pune | MH    |     400145 | INDIA   | test123  |
      | test1     | test2    | 9764326834 | test457@gmail.com | add1     | add2     | Pune | MH    |     400145 | INDIA   | test123  |
    # Then validate title as "Register: Mercury Tours"
    # And validate Successful registration

   
   @sanity @linksvalidation @uppermenu 
   Scenario Outline: when user click on sing-on link, sign-on page should open
    When user click on <LinkValue> link in upper menu
    Then validate title as <Title>

    Examples: 
      | LinkValue | Title                             |
      | SIGN-ON   | Sign-on: Mercury Tours            |
      | REGISTER  | Register: Mercury Tours           |
      | SUPPORT   | Under Construction: Mercury Tours |
      | CONTACT   | Under Construction: Mercury Tours |
      