Feature: search and place the order for products

Scenario: Search experience for product search in both home and offers page

Given User is on Greencart landing page
When user searched with short name "Pot" and extracted actual name of product
Then user go and serach the same short name "Pot" on offers page to check if product exists