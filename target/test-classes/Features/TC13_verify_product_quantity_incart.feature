@t13
Feature: Verify Product quantity in Cart
  Scenario: TC13 Verify Product quantity in Cart
  Given Click View Product for any product on home page
  When Verify product detail is opened
  Then Increase quantity to four
  Then Click Add to cart button
  Then Click View Cart button
  Then Verify that product is displayed in cart page with exact quantity