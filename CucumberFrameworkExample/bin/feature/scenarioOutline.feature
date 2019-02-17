
Feature: Login

  Scenario Outline: Successful login with different credentials
  Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
  
   Examples: 
      | username  | password |
      | testuser_1| Test@153 | 
      | testuser_1| Test@153 |

   
