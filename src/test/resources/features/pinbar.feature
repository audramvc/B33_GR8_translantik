@B33G8-145
Feature: Default


	@B33G8-143
	Scenario: US03AC01TC01- Verify that user can click the “Learn how to use this space” link and sees text
		Given User is on translantik home page
		    When User clicks the Learn how to use this space link
		    Then User sees How to Use Pinbar and Use the pin icon on the right top corner of page to create fast access link in the pinbar.	

	
	@B33G8-144 @wip
	Scenario: US03AC02TC01- Verify that user sees an image on the page
		Given User is on translantik pinbar help page
			Then User sees an image on the page