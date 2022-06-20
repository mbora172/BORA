Feature: Search and place the order for Products
@PlaceOrder
  Scenario Outline: Search Experience for product search in both home and Offer page
    Given User is on GreenCart Landing page
    When user searched with Shortname <Name> and extracted actual name of product
    And add "3" item in your cart
    Then confirm product <Name> in page
    Then verify user has ability apply and palace order button are dispaled
    Examples:
      | Name |
      | Tom  |
