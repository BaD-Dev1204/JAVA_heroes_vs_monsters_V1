# Heroes Vs Monsters

## CHARACTER (base class)

* hp : int
* strength : int
* speed : int
* luck : int

---

## HERO (inherits from Character)

* gold : int
* level : int
* xp : int

Methods:

* gainXP(xp)

---

## HERO CLASSES (inherit from Hero)

### Knight

* Bonus: +hp, +strength
* Skills:

  * block()
  * protect()

---

### Elf

* Bonus: +speed
* Skills:

  * rapidShot()
  * dodge()

---

### Sorcerer

* Bonus: +magic power (or adapt with strength)
* Skills:

  * castSpell()
  * areaAttack()

---

### Monk

* Bonus: balanced / speed
* Skills:

  * quickStrike()
  * meditate()

---

## MONSTER (inherits from Character)

* dropChance : int

---

## GOBLIN (inherits from Monster)

* Specificity:

  * Can drop a gold pouch (chance)

Subclasses:

### Archer

* rangedAttack()

### Assassin

* stealthAttack()

---

## ORC (inherits from Monster)

Subclasses:

### Spearman

* longRangeAttack()

### Guardian

* protect()
* block()

---

## GAME MECHANICS

* Each character has base stats
* Each class applies bonuses
* Monsters can drop loot
* Combat is turn-based and based on speed
* The guardian protects the spearman (synergy)
