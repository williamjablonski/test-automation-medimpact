Feature: Assert ACMILES API is Running 
	As a System
 I want communicating with API
 I should be able catch and put data in ACMILES using API

@APITests @ignore
Scenario Outline: See ACMILES base API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|resultStatus|
		|GET| |200|
		|GET|dashboard|200|
		|GET|leaderboard|200|
		|GET|rules|200|
		|GET|signin/faq|200|		
   	


@APITests @ignore
Scenario Outline: See ACMILES user API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|resultStatus|
		|GET|user|200|
		|POST|user/save|200|
		|GET|user/delete|200|
		
		
		
@AuthAPITests @ignore
Scenario Outline: See ACMILES googleAuth API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" using providerId "<providerId>" to route "<routeOfCall>" 
	When I execute the call "<typeOfAction>" using providerId "<providerId>" and  providerUserId "<providerUserId>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|providerId|resultStatus|
		|POST|auth/|providerId|200|
		|GET|auth/|providerId|200|
		|DELETE|auth/|providerId|200|
		
@APITests @ignore
Scenario Outline: See ACMILES googleAuth DELETE API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" using providerId "<providerId>" and  providerUserId "<providerUserId>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|providerId|providerUserId|resultStatus|
		|DELETE|auth/|providerId|providerUserId}|200|
		
		
@RestAPITests 
Scenario Outline: See ACMILES TALKS REST API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|resultStatus|
		|GET|home/api/talks|200|
		|POST|home/api/talks|200|
		|PUT|home/api/talks|200|
		|GET|home/api/talks|200|
		|GET|home/api/talks/1|200|
		|DELETE|home/api/talks/1|200|
		
		
@APITests @ignore
Scenario Outline: See ACMILES TALK API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|resultStatus|
		|GET|talk/all|200|
		|GET|talk/all/my-talks|200|
		|GET|talk/all/past-talks|200|
		|GET|talk/attend|200|
		|GET|talk/attendChoice|200|
		|GET|talk/dontattendChoice|200|
		|GET|talk/checkTasks|200|
		|POST|talk/checkTasks|200|
		|GET|talk/remove|200|
		|GET|talk/removeParticipant|200|
		|GET|talk/isAttending|200|
		|GET|talk/hasEvaluated|200|
		|GET|talk/getTalkRate|200|
		|GET|talk/create|200|
		|POST|talk/create|200|
		|GET|talk/view|200|
		|GET|talk/all/view-talk/1|200|
		|GET|talk/watch|200|
		|GET|talk/evaluate|200|
		|POST|talk/evaluate|200|
		|GET|talk/edit|200|
		|POST|talk/update|200|
		|POST|talk/updateYouTube|200|
		|GET|talk/delete|200|
		
@NewAPITests 
Scenario Outline: See ACMILES new API is up 
	Given I stay on the acmiles dashboard page "https://www.medimpact.com". 
	When I execute the call "<typeOfAction>" to route "<routeOfCall>" 
	Then the status result is "<resultStatus>". 
	
	Examples: 
	
		|typeOfAction|routeOfCall|resultStatus|
		|GET|actions|200|
		|GET|badges|200|
		|GET|events|200|
		|GET|talks|200|
		|GET|users|200|
		