Feature: Le spectateur Christian est curieux
  En tant qu'acteur Christian
  Je veux connaître le premier monstre qui apparait dans la nouvelle sitcom
  Afin que je puisse préparer mes scènes

  Scenario: Christian souhaite connaître le monstre prévu au premier épisode (Khezu)
    Given Christian et une nouvelle sitcom intitulé Monster Hunter Friends
    When Christian demande qui est le premier monstre qui apparaît dans la sitcom
    Then Christian reçoit comme réponse le Khezu