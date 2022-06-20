Feature: Search and place the order for Products
@OffersPage
  Scenario Outline: Search Experience for product search in both home and Offer page


    Given User is on GreenCart Landing page
    When user searched with Shortname <Name> and extracted actual name of product
    Then user Searched for <Name> shortname in offers page to check if product exist
    And  validate product name in offers page matches with Landing Page
    Examples:
      |Name|
      |Tom |
      |Beet|


