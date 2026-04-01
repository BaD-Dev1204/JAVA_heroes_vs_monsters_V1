# Heroes Vs Monsters

## PERSONNAGE (classe de base)

* pv : int
* force : int
* vitesse : int
* chance : int

Méthodes :

* attaquer(cible)
* recevoirDegats(dmg)

## HERO (hérite de Personnage)

* or : int
* niveau : int
* xp : int

Méthodes :

* gagnerXP(xp)

## CLASSES DE HERO (héritent de Hero)

Chevalier

* Bonus : +pv, +force
* Compétences :

  * bloquer()
  * proteger()

Elfe

* Bonus : +vitesse
* Compétences :

  * tirRapide()
  * esquive()

Sorcier

* Bonus : +force magique (ou adapter avec force)
* Compétences :

  * lancerSort()
  * attaqueZone()

Moine

* Bonus : équilibré / vitesse
* Compétences :

  * coupRapide()
  * meditation()

## MONSTRE (hérite de Personnage)

* chanceDrop : int

Méthodes :

* mourir()
* attaquer()

## GOBELIN (hérite de Monstre)

* Spécificité :

  * Peut lâcher une bourse d’or (chance)

Sous-classes :
Archer

* attaqueDistance()

Assassin

* attaqueFurtive()

## ORC (hérite de Monstre)

Sous-classes :

Lancier

* attaqueLonguePortee()

Gardien

* proteger()
* bloquer()

## MECANIQUES DE JEU

* Chaque personnage a des stats de base
* Chaque classe applique des bonus
* Les monstres peuvent drop du loot
* Le combat est au tour par tour basé sur vitesse
* Le gardien protège le lancier (synergie)


