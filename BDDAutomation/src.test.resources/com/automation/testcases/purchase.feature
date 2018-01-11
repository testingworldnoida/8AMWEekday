Feature: To purchse the items

@Smoke
Scenario: Purchase Orders
Given User is on search window
When User search the items
And User select the items
And User add to cart
Then to verify the selected items
Then checkout the items

