Feature: Search and place the order for products

  @OffersPage
  Scenario Outline: Search experience for product search in both home and offers page

    Given user is on GreenCart landing page
    When user searches for <Name> and extracts actual name of product
    Then user searches for <Name> in offerspage
    And validate product name in offers page matches with landing page
    Examples:
      | Name |
      | Tom  |
      | Beet |
  
#    This is some text
#    Just to show
#    How git changes work
#    When pushing

#    Here are some extra changes
#    From the second user
#    To show git push demo

#    even more
#    changes
#    for testing purposes

#    more changes
#    on x

