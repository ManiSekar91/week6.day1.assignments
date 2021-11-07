Feature: CreateLead Validation


Scenario: Create Lead with Mandatory Informations
#Given Username as 'Demosalesmanager'
#Given Password as 'crmsfa'
#When Click on the Login button
#Then Leaftaps Homepage Should be opened

When Click on the CRM link button
Then Home Page should be Opened
When Click on Leads button
Then Leads Page should be Opened
When Click on Create Lead button
Then Then Create Lead page should be opened
Given Enter Company Name
And Enter First Name
And Enter Last Name
And Enter Phone Number
When Click on Create Lead Button 
Then View Lead page should be Opened

