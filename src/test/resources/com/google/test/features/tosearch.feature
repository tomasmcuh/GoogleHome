
Feature: Automation Google Homepage
As a web user
I want to search into Google page
to search a title book

@ToSearchBook
Scenario:  User can search with �Google Search�
Given I am on the homepage
When I type The name of the wind into the search field
And I click the Google Search button
Then I go to the search results page
And the first result is The Name of the Wind - Patrick Rothfuss
When I click on the first result link
Then I go to the Patrick Rothfuss - The Books page
