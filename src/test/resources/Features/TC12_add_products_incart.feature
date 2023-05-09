Feature: Add Products in Cart
  @add_products
  Scenario: TC12 Add Products in Cart
  Given Click Products button
  Then Hover over first product and click Add to cart
  Then Click Continue Shopping button
  Then Hover over second product and click Add to cart
  Then Click View Cart button
  Then Verify both products are added to Cart
  Then Verify their prices, quantity and total price