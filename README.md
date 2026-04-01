# Heroes Vs Monsters

## CHARACTER (base class)

* maxHp : int
* currentHp
* strength : int
* speed : int
* luck : int

---

## HERO (inherits from Character)

* gold : int
* level : int
* xp : int
* skills : List<HeroSkill>

---

## HERO CLASSES (inherit from Hero)

### Knight

* Bonus: +hp, +strength
* Skills:
  * BlockSkill()
  * ProtectSkill()

---

### Elf

* Bonus: +speed
* Skills:
  * RapidShotSkill()
  * DodgeSkill()

---

### Sorcerer

* Bonus: +magic power (or adapt with strength)
* Skills:
  * CastSpellSkill()
  * AreaAttackSkill()

---

### Monk

* Bonus: balanced / speed
* Skills:
  * QuickStrikeSkill()
  * MeditateSkill()

---

## MONSTER (inherits from Character)

* dropChance : int
* skills : List<MonsterSkill>

---

## GOBLIN (inherits from Monster)

* Specificity:
  * Can drop a gold pouch (chance)

Subclasses:

### Archer

* Skills:
  * RangedAttackSkill()

### Assassin

* Skills:
  * StealthAttackSkill()

---

## ORC (inherits from Monster)

Subclasses:

### Spearman

* Skills:
  * LongRangeAttackSkill()

### Guardian

* Skills:
  * ProtectSkill()
  * BlockSkill()

---

## SKILLS SYSTEM

### Base class: Skill
* name : string
* description : string

### HeroSkill (inherits from Skill)
* Can override use() for hero-specific effects

### MonsterSkill (inherits from Skill)
* Can override use() for monster-specific effects
* Allows monsters to have skills that behave differently from heroes

---

## GAME MECHANICS

* Each character has base stats
* Each class applies bonuses
* Characters have a list of skills
* Monsters can drop loot
* Combat is turn-based and based on speed
* The guardian protects the spearman (synergy)
