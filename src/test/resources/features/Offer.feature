@Tag
Feature: Validate the list of job offers of the company Sophos Solutions

  Scenario Outline: List the offers of the section work with us  
    Given User loads sophos solutions home screen 
    And The user enters the module Work With Us 
    Then The user correctly enters the Work with us section
    When The user dont see any offers, he enter a <keyword>
    Then The user prints the job offers
Examples:
    | keyword | 
      	 | "Java"|
   