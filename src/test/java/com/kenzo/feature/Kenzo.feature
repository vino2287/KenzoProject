Feature: Booking dresses and accessories in kenzo application 

Scenario: User will login the application 
	Given User launch the application 
	When User click the my account in the application 
	And User enter the valid email id 
	And User enter the valid password 
	Then User click the login button 
	
Scenario: User launch the home page of the application 
	Then User select the women product 
	
Scenario: User launch the women page of the application
	Then User select the women t-shirts	