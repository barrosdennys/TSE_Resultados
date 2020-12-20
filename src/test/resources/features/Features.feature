

Feature: TSE Resultados

  @skipMenu
  Scenario: All sections are finished for the 1st part of the election
    Given I select the state "Amapá"
    And I select the city "Macapá"
    When I select the first leg of the election
    Then I should see the message "100,00% das seções totalizadas"


  Scenario: Select "Josiel" as favorite
    Given I select "Eleições 2020"
    And I select "Todas" in UF option
    And I select "AP" state
    And I click "1º turno" button
    And I select "Josiel" candidate
    And I select "Favoritar" option
    When I select the favorite page
    Then I should see "JOSIEL" candidate




