Feature: Product search
  
  @Checkout
  Scenario Outline: checkout process 
    Given launch the browser and hit the url
    When search the product with <Name> and get the product name in home page
    And select the product <Quantity> and add to the cart
    Then navigate to checkout page
    And validate the products in the cart
    And place order the product
    
    Examples:
    | Name | Quantity |
    | Tom | 2 |