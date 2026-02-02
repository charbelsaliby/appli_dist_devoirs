# Connexion JDBC à PostgreSQL 16 — Application Java Standalone

## 1) Objectif du projet
Ce projet a pour objectif de démontrer l’utilisation de **JDBC** afin de connecter une **application Java standalone** à une base de données **PostgreSQL 16**, d’exécuter une requête SQL et d’afficher les résultats dans la console.

L’application :
- établit une connexion à PostgreSQL,
- exécute une requête `SELECT` sur une table existante,
- lit les données via un `ResultSet`,
- affiche les résultats,
- ferme correctement la connexion.

---

## 2) Logiciels et versions utilisés
- **Système d’exploitation** : Windows  
- **Java (JDK)** : Java SE (version utilisée sur la machine)
- **IDE** : (ex. IntelliJ IDEA / Eclipse)
- **PostgreSQL** : **18**
- **Driver JDBC PostgreSQL** : org.postgresql.Driver
- **Base de données** : PostgreSQL locale

---

## 3) Structure du projet
Le projet est composé d’une seule classe Java :

- `test.java` : contient la méthode `main` et tout le code JDBC (connexion, requête SQL, affichage des résultats).

---

## 4) Base de données utilisée
- **Nom de la base** : `test`
- **Nom de la table** : `personnes`

### Structure de la table
```sql
CREATE TABLE personnes (
  nom VARCHAR(100),
  age INT
);

