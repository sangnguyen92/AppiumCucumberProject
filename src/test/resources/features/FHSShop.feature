@fhs
Feature: Fahasa Shop
  Scenario: Searching on Fahasa shop
    Given I am on the webshop home page
    When I search with keyword "Teaching Mathematics"
    When I select the first product
    When I add this product into Cart
    And  I access the cart
    Then I should see the items and the corresponding quantity and correct total