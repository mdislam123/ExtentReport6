@facebook1
Feature: login registration 1

#Background:
	#Given user given the URL 
	#When user click the create new account botton

Scenario Outline: user able to register sucessfully 
	Given user given the URL 
	When user click the create new account botton
	#And enter firstName "<firstName>" and "<lastName>" lastName
	#And enter email "<email>" and "<Password>" password  
	And user enter the input "<firstName>" and "<lastName>" and "<eamil>" and "<confEamil> " and "<password>" as all bottons 
	And user click the sing up botton 
	Then user sucessfully register the application 
	
	Examples: 
		|firstName	| lastName	| eamil			|confEmail 	| password	|
		|	md		|	islam	|	md@gamil.com| 	md@gamil.com |galaxe123	|
		
Scenario: 	user able to go url agin
	Given user given the  URL "https://wwwgoogle.com"
