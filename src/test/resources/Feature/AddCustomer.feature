@Regression
Feature: AddCustomer

Background:
 Given the user is in telecom home page 

@smoke
Scenario: Registration Page to Add Customer
   
   
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id  
    
@smoke
Scenario: Registration Page to Add Customer
   
   
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id

@rerun
Scenario: Registration Page to Add Customer
   
  
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id            
 