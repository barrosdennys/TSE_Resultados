
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

  Scenario: Verify if a candidate is in Vereadores voted list
    Given I am on the tab Resultados
    And I select "Vereador" button
    Then I should check that "LUANY FAVACHO" is in the list of Vereadores voted

  Scenario: Access "FAQ" screen
    Given I select the tab Informações
    And I click on "Dúvidas Frequentes" option
    Then I should see "O que posso fazer no app?" message

