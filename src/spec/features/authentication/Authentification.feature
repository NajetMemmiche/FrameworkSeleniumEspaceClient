Feature: Auhtentification - Eshop Ooredoo
  ETQ utilisateur je souhaite m'authentifier

  @connexion
  Scenario: Connexion sur site web Eshop
    Given je me connecte sur le site eshop Ooredoo
    When je saisi username "23514433"
    And je saisi le mot de passe "test123"
    And je clique sur le bouton login
    Then je me redirige vers la page Home "Bienvenue"