ACKERMANN Mathieu, HARTZ Henri TD12 - TP2

#RAPPORT MASTERMIND
##Fonctionnalité
Nous avons développé un premier prototype du jeu qui fonctionne en console, accompagné du diagramme UML correspondant, complété par les ajouts futurs prévus pour la version avec interface graphique en Swing.

##Nos choix de conception
Pour ce projet, nous avons opté pour l'utilisation de différents patrons de conception. Nous prévoyons d'appliquer les patrons suivants :

Strategy : Nous avons identifié la nécessité de gérer plusieurs types d'affichage des indices.
Observer : Nous devons être en mesure de modifier le comportement de l'application en fonction des choix de l'utilisateur.
Facade : Nous avons l'intention de simplifier l'utilisation de l'application pour l'utilisateur.
Factory : Nous devons créer différents types de stratégies que l'utilisateur pourra choisir.
De plus, nous avons décidé de stocker les informations relatives aux paramètres de la partie dans la classe Partie, car cela nous a semblé être la solution la plus logique.

##Problèmes et solutions
Nous avons rencontré des problèmes en plaçant tous les paramètres dans la classe Partie. En effet, certaines autres classes nécessitent parfois l'utilisation de ces attributs pour leurs fonctions. Nous avons résolu ce problème en modifiant nos fonctions pour qu'elles attendent les éléments nécessaires en tant que paramètres.

##Avenir
Il nous reste à travailler sur l'interface graphique, mais nous ne nous interdisons pas de retoucher notre code existant si le besoin s'en fait sentir.