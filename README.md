# SeptArche-v2

    SeptArche-v2 est un application de vente en ligne proposant des articles portant sur le theme du cinema, application 
    à architecture 3/3, sa partie Back-End est produite en Java sur le Framework SpringBoot, la partie Front-End elle a 
    été Réalisée en REACTJS et TypeScript, puis une base de données MySQL.

1 Getting Started.......................................................................................................

    Project Structure éléments a installer :
    
    - Project : Maven
    - Langage : Java
    - Packaging : Jar
    - Java Version : 19
    - Base de données SQL
    - Maven plugin 
    - Sprin-Boot plugin

    Dépendances (Reprises dans le fichier POM.XML):

    - Spring Boot Dev Tools
    - Spring Security
    - Spring Data JPA
    - H2 DataBase
    - MySQL Driver
    - Junit

1.1 Recuperation des sources............................................................................................ 

    1.1.0 a partir d'un terminal creer un repertoire

        mkdir + nom de repertoire 

    1.1.1 Se placer dans le repertoire Créé

        cd  + Nom du repertoire

    1.1.2 Cloner le projet

        $git clone git@github.com/Ngandos/SeptArcheV-2.git

    1.1.3 Se placer dans le repertoire du projet

        cd + SeptArcheV-2

1.2 Lancement de l'application..........................................................................................

    $ mvn spring-boot: run

    Spring-Boot va lancer le serveur -> tomcat sur le port 8080 -> URL localhost://8080

    On peut modifier le port dans le fichier Application properties 

1.3 API.................................................................................................................

Methods | Paths            | Déscription

    GET | /Articles               | Recupere et retourne la liste des Articles
    GET | /Articles/{id}          | Recupere et retourne un articles par son ID
    GET | /Livres                 | Recupere et retourne la liste des Livres
    GET | /Livres/{id}            | Recupere et retourne un articles par son ID
    GET | /Livres/titre           | Recupere et retourne un Livre par son Titre
    GET | /Livres/auteur          | Recupere et retourne un Livre par son Auteur
    GET | /Auteur                 | Recupere et retourne la liste des Auteurs
    GET | /Auteur/{id}            | Recupere et retourne un Auteur par son ID
    GET | /Auteur/nom             | Recupere et retourne un Auteur par son Nom
    GET | /Auteur/livres          | Recupere et retourne la liste des Livres d'un Auteur
    GET | /Editeurs               | Recupere et retourne la liste des Editeurs
    GET | /Editeurs/{id}          | Recupere et retourne un Editeur par son ID
    GET | /Editeurs/enseigne      | Recupere et retourne un Editeur par son Enseigne
    GET | /Clients                | Recupere et retourne la liste des Clients
    GET | /Categorie              | Recupere et retourne la liste des Categories
    GET | /Categorie/{id}         | Recupere et retourne une Categorie par son ID
    GET | /Categorie/nom          | Recupere et retourne une Catégorie par son Nom
    GET | /Categorie/description  | Recupere et retourne une Categorie par sa Description
    GET | /Commande               | Recupere et retourne la liste des Commandes
    GET | /Commande/{id}          | Recupere et retourne une Commande par son ID
    GET | /Commande/date          | Recupere et retourne une Commande par sa Date de création
    GET | /Commande/Client        | Recupere et retourne une Commande par son Client
