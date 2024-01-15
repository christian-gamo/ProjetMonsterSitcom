Feature: Comment chasser un monstre selon Christian ?
  En tant que Christian
  Je veux chasser un monstre
  Afin que la population des monstres se réduise

  Scenario: Christian chasse le monstre mizutsune
    Given Christian veut chasser le mizutsune
    When Christian chasse le mizutsune
    Then la population de mizutsune diminue de 1 (Christian)