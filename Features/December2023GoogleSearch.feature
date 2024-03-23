Feature:google Search

Scenario Outline: perform a google job search

Given i am on Google homepage
When i enter the search "<terms>"
And I click search button
Then I receive the result

Examples:
|terms                 |
|Quality Assurance Jobs|
|Software Testing Jobs|