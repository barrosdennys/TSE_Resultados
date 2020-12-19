@skipMenu
Feature: TSE Resultados

  Scenario: All sections are finished for the 1st part of the election
    Given I select the state "Amapá"
    And I select the city "Macapá"
    When I select the first leg of the election
    Then I should see the message "100,00% das seções totalizadas"

