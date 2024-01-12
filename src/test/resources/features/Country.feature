@tag
Feature:  US_000 Connaître l'origine de la sitcom
  En tant qu'amateur de série
  Je veux savoir d'où vient ma série
  Afin que je puisse savoir si j'ai besoin de sous-titres ou non

  Scenario Outline: Renvoie du pays d'origine de la sitcom
    Given une sitcom
    And la sitcom a un <paysOrigine>
    When le visionneur demande <paysOrigine>
    Then <paysOrigineSitcom> renvoie <paysOrigine>
    Examples:
      | paysOrigine | paysOrigineSitcom |
      | "Etats-Unis"|"Etats-Unis"       |