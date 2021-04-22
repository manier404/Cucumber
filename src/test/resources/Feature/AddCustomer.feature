@Regression
Feature: AddCustomer


  @smoke
  Scenario: Registration Page to Add Customer
   
    Given the user is in telecom home page 
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id
    
    @sanity
  Scenario: Registration Page to Add Customer
   
    Given the user is in telecom home page 
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id
    
    @sanity @smoke
  Scenario: Registration Page to Add Customer
   
    Given the user is in telecom home page 
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id
    
    @sanity
  Scenario: Registration Page to Add Customer
   
    Given the user is in telecom home page 
    And the user click on Add Customer
    When the user should enter all the details
    And the user clicks submit button
    And the user shloud displayed with customer id