Feature: Comment chasser un monstre selon Darlène ?
  En tant que Darlène
  Je veux chasser un monstre
  Afin que la population des monstres se réduise

  Scenario: darlene chasse le monstre mizutsune
    Given darlene veut chasser le mizutsune
    When darlene chasse le mizutsune
    Then la population de mizutsune diminue de 1

