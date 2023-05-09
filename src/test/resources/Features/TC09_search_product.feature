Feature: Search Product
  @search_product
  Scenario: TC09 Search Product
  Given Click on Products button
  Then Verify user is navigated to ALL PRODUCTS page successfully
  Then Enter product name in search input and click search button
  Then Verify SEARCHED PRODUCTS is visible
  Then Verify all the products related to search are visible