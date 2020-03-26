@SauceDemo
Feature: SauceDemo_Website

@TC01_Select_the_company_field_in_about_option
Scenario Outline: view the about us in company field
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page using "<username>" and "<password>"
Then check about us in company field
Then close the browser

Examples: 

|username	                            |password	        | 
|standard_user		                    |secret_sauce		|



@TC02_Search_latest_company_news_in_companyfield
Scenario: checking company news in company field
Given the user launching the chrome application
When the users open the Sauce_demo Home page 
Then The user logins the home page
Then check company news in company field
Then Close the browser

@TC03_valid_partnership_details_in_the_company_field
Scenario: checking valid details in company field
Given user launch the chrome application
When user open the Sauce_demo Home page 
Then user login the home page
Then check valid partnership details in the company field
Then closing the browser 


@TC04_Invalid_partnership_details_in_the_company_field
Scenario: checking invalid partnership details in company field
Given user launching the chrome application
When user opens the Sauce_demo Home page 
Then user logins the home page
Then check Invalid partnership details in the company field
Then Closing the browser 