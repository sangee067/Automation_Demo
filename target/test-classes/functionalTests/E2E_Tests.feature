@tag
Feature: End to End Tests
 
  @tag1
  Scenario: Customer place an order by purchasing an item from search
    Given User is in Homepage
    When User search for "dress"
    And choose to buy the first item
    And add the item to cart for checkout
    And create an account
    And enter the personal details to register
    And select the same delivery address
    And accept the terms & conditions
    And select the payment method as bank wire
    And place the order

