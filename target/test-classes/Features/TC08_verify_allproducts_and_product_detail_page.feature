Feature: Verify All Products and product detail page
  Scenario: TC08 Verify All Products and product detail page
  Given Click on Products button
  When Verify user is navigated to ALL PRODUCTS page successfully
  Then The products list is visible
  Then Click on View Product of first product
  Then User is landed to product detail page
  Then Verify that detail detail is visible: product name, category, price, availability, condition, brand