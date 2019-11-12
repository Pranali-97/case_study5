Feature: Search

 Scenario Outline: Search a product
 * user opens test me app
 * user clicks on sign in 
 * user enters username "<username>"
 * user enters password "<pwd>"
 * user clicks on login button
 * user clicks on all categories
 * user clicks on electronics
 * user clicks on headphones
 * user clicks on add to cart
 * user clicks on cart
 * user clicks on checkout
  Examples:
  |username|pwd|
  |Lalitha|Password123|