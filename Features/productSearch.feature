Feature: Product search
  
  @productSearch
  Scenario Outline: product search 
    Given launch the browser and hit the url
    When search the product with <Name> and get the product name in home page
    Then search the product with <Name> and get the product name in top deals page
    And validate the product name of home page and top deals page

    Examples:
    | Name |
    | Tom |
    | Beet |
