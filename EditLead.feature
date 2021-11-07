Feature: EditLead Validation

Scenario: EditLead with mandatory inputs

When Click the CRM link button
When Click the Leads button
#Then Leads Page should be Opened
When Click on Finds Leads
Then Find Leads page should be Opened
When Click on Phone
Given Phone Number
When Click on Find Leads search button
Then Lead List should be displayed
When click the First Lead Link
Then View Lead should be Opened
When Click on the Edit Button
Then Edit Lead form should be displayed
Given Company Name
When Click on the Update Button
Then View Lead page should be Opened

 
