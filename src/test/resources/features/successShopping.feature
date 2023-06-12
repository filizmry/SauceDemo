Feature: Success Shopping Feature

  Background:
    Given The user on the login page
    When The user type in valid credentials:"standard_user" and "secret_sauce"
    Then The user should be able to see page title:"Products"
    @wip
    Scenario: Positive Success Shopping Test
      When The user should be able sort items order type:"Price (high to low)"
      And The user should be able to add items to cart with item names:"Sauce Labs Fleece Jacket"
      And The user should be able to add items to cart with item names:"Sauce Labs Bolt T-Shirt"
      And The user should be able to add items to cart with item names:"Sauce Labs Backpack"
      And The user should be able to add items to cart with item names:"Sauce Labs Bike Light"
      And The user should be able to add items to cart with item names:"Test.allTheThings() T-Shirt (Red)"
     Then The number on the bascet icon should the added item number
      When The user navigate to your cart page
      Then The user should be able to see page title:"Your Cart"
      And The user should see the added items on cart page
        | Sauce Labs Fleece Jacket          |
        | Sauce Labs Bolt T-Shirt           |
        | Sauce Labs Backpack               |
        | Sauce Labs Bike Light             |
        | Test.allTheThings() T-Shirt (Red) |
      When The user navigate to page related button;"checkout"
      Then The user should be able to see page title:"Checkout: Your Information"
      When The user should be able to fill the form with:"meryem" and "kara" and "67900"
      When The user navigate to page related button;"continue"
      Then The user should be able to see page title:"Checkout: Overview"
      And The user should be able to verify total price and number of items

