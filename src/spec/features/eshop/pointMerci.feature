Feature: Accueil - Eshop Ooredoo
  ETQ utilisateur je souhaite accéder à la page d'accueil

 Background:
    Given je me connecte sur le site eshop Ooredoo
    When je saisi username "23514433"
    And je saisi le mot de passe "test123"
    And je clique sur le bouton login
    Then je me redirige vers la page Home "Bienvenue"
    
@transformation
Scenario: Connexion sur site web Eshop
    When je clic sur choisir un autre montant
    And je choisi 300 points
    And je clique sur valider
    Then solde point merci est déduit de 300 points