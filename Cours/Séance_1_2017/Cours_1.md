# PROG | 08/09/17 | 1

```
UML : ensemble de diagrammes visuels qui permet de percevoir des notions abstraites.
Permet la modélisation d'un système.
```
- Diagramme de cas d'utilisation (Use Case)
- Diagramme de classes
- Diagramme de séquences
- Diagramme d'états

## Software
Eclipse → Oxygen : JAVA PROJECT
- Papyrus : UML
- Acceleo : UML → JAVA
- Object Aid Class Diagram

Base de données : JDBC

OCL → Langage de contraintes

---
## Diagramme de classes

```
Permet de générer du code
Objet = Nouvelle classe → Instance
Un fichier = Une classe (Le même nom est partagée)
```
* | Nom de la classe (Voiture)
* | Attributs (Vitesse, Marque, Couleur, ...) (Généralement en private)
* | Opérations  (Rouler(), ...) (Généralement en public)
* | Exeptions


Visibilité de la classe :
```
- ~ packages (Espace regroupant les classes)
- + public (Accessible de partout)
- - private (Interne à la classe)
- # protected (Par héritage)
```

### Héritage

```
┌───┐ ┌───┐
| A |→| B | Héritage
└───┘ └───┘

┌───┐ ┌───┐
| A |─| B | Association (bidirectionnel)
└───┘ └───┘

┌───┐  ┌───┐
| A |◊─| B | Agrégation (lien logique plus fort que l'association)
└───┘  └───┘
```
![Aggrégation](http://lh4.ggpht.com/_aUOgqE3fGXc/Sh32eo6k3II/AAAAAAAAAac/c3lyBGfFEeQ/image_thumb%5B14%5D.png?imgmax=800)


### Classe abstraite

```
Instanciation impossible
Une sorte de "classe modèle"
```

---
## Diagramme de séquence

```
Notion de temps
Utilisation de "papyrus"
```

