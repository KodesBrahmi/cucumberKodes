#Author: Kodes Brahmi
#Keywords Summary :
#Author: Kodes Brahmi
Feature: Modifier l'adresse d'un abonné

  
  Scenario Outline: Modification de l'adresse d'un abonné résidant en france sans ou avec date d'effet
  Given un abonne avec une adresse principale <active> en <pays> 
  When  le conseiller connecte a <canal> modifie adresse de abonne <condition>
  Then  adresse de abonne modifiee est enregistree sur ensemble des contrats de abonne
  And   un mouvement de modification est cree
  

    Examples: 
      | canal  | active   | pays    | condition         |
      | FACE   | inactive | France  | sans date d'effet |
      | EC     | active   | Pologne | avec date d'effet |
  