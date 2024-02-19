@smoke
Feature: User can login and select any item would to buy and add to cart.


  Scenario:User add item to his cart
    Given user login
    When  user select deals
    And  user select item
    Then user add to cart the item

  Scenario:User add another item
    Given user login
    When  user navigate to audio
    And  user select second item
    Then user add to cart the item

  Scenario:User add item from search bar
    Given user login
    When user search for item
    And  User select samsung
    Then user add to cart the item




