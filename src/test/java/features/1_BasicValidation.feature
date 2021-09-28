Feature: Assert ACMILES Application is Running
  As a ACUser
  I want to see index page
  I should be able to see all elements of this page

	@functionalTests
  Scenario: See header and footer elements of index page
    Given I stay on the acmiles dashboard page "https://www.medimpact.com".
    Then header shows ACMiles logo.
   	Then header shows Dashboard link.
   	Then header shows Talks link.
   	Then header shows Workshops link.
   	Then header shows Rewards link.
   	Then header shows Talks link.
   	Then header shows Search element.
   	
   	@functionalTests
  Scenario: See page Dashboard
    Given I stay on the acmiles dashboard page "https://www.medimpact.com".
    And click in Dashboard on header
    Then dashboard page is shown.
  
    @functionalTests
  Scenario: See page Talks
    Given I stay on the acmiles dashboard page "https://www.medimpact.com".
    And click in Talks on header
    Then Talks page is shown.
    Then talks page shows title element. 
    
    @functionalTests
  Scenario: See page Workshops
    Given I stay on the acmiles dashboard page "https://www.medimpact.com".
    And click in Workshops on header
    Then Workshops page is shown. 
    Then workshops page shows title element.
    
    @functionalTests
  Scenario: See page Rewards
    Given I stay on the acmiles dashboard page "https://www.medimpact.com".
    And click in Rewards on header
    Then Rewards page is shown. 
    
        @functionalTests
  Scenario: See page Results of Search
    Given I stay on the acmiles dashboard page "https://www.medimpact.com".
    And set "value" on Search element in header
    Then Result page of Search is shown. 
    