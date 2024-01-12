Feature: Comment chasser un monstre selon Darlène ?
  Ici, nous allons voir comment notre personnage (darlene) peut chasser un monstre
  Scenario: darlene chasse le monstre mizutsune
    Given darlene veut chasser le mizutsune
    When darlene chasse le mizutsune
    Then la population de mizutsune diminue de 1

