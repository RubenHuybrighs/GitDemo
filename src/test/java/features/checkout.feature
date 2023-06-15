Feature: Place an order

  @PlaceOrder
  Scenario Outline: Search experience for product search in both home and offers page

    Given user is on GreenCart landing page
    When user searches for <Name> and extracts actual name of product
    And added "3" items of the selected product to the cart
    Then user proceeds to checkout and validate the <Name> items in the checkout page
    And verify user has ability to enter promo code and place the order
    Examples:
      | Name |
      | Tom  |
