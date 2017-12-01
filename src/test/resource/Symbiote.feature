Feature: To test the ContactUs functionality of zoo test 
 Scenario: To Send the contact form 
    Given I am on Zoo site page 
	When I click on "Contact" link 
	And I enter "Name testnew" into the name text box
	And I select Information radio button 
	And I select Zoo Volunteer check box 
	And I select Email Newsletter check box 
	And I enter "Address test12" into the address text box 
	And I enter "Postcode test12" into the postcode text box 
	And I enter "Email test12" into the email text box 
	And I click on Send button 
	Then I am on the confirmation page 
  




	
	
	
	
		