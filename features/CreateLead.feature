Feature: Leaftaps CreateLead Functionlity


Scenario Outline: TC001_CreatLead Application-Positive

Given Enter into Crate Leads tab
Given Enter the companyName <companyName>
Given Enter the firstName <firstName>
Given Enter the lastName <lastName>
When click on submit button
Then created Lead page should be displayed

Examples:

|companyName|firstName|lastName|
|'HCL'|'Saranya'|'Tamil'|
|'Infosys'|'Tamil'|'selvan'|

