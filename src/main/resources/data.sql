-- Persistance Articles

INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (1, 'Cycles', 124, 0.2, 125.50, '123', 'Vélo' );
INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (2, 'Hi-Fi', 450, 0.2, 455.09, '456', 'Télévision');
INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (3, 'High-Tech', 1549, 0.2, 1600.90, '789', 'Iphone 14');
INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (4, 'High-Tech', 1800, 0.2, 1880.50, '101112', 'Samsung Folder');
INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (5, 'High-Tech', 1200,  0.2,  1220.80, '131415', 'Iphone 13');
INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (6, 'High-Tech', 799, 0.2, 807.95, '161718', 'Ipad 11 Pro');

-- Persistance Auteurs

INSERT INTO auteurs (id, nom) VALUES (1, 'Victor Hugo');
INSERT INTO auteurs (id, nom) VALUES (2, 'Charles Baudelaire');
INSERT INTO auteurs (id, nom) VALUES (3, 'Anne Rice');
INSERT INTO auteurs (id, nom) VALUES (4, 'Jean Baptiste Poquelin');
INSERT INTO auteurs (id, nom) VALUES (5, 'Mark Twain');
INSERT INTO auteurs (id, nom) VALUES (6, 'Jules Vernes');

-- Persistance Editeurs

INSERT INTO editeurs (id, Enseigne) VALUES (1, 'Gallimard');

--Persistance d'objets livre en tant que livre et en tant Qu'article

INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (7, 'Livres', 23.56, 0.2, 25.00, 192021, 'Les misérables');
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (7, 'Les misérables', 'Gallimard', '1576VH', 1);

INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (8, 'Livres', 20.30, 0.2, 21.50, 222324, 'Lestat le Vampire');
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (8, 'Lestat le Vampire', 'Gallimard', '1689AR', 3);

INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (9, 'Livres', 20.30, 0.2, 21.50, '1789CB', 'Les Fleurs du mal');
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (9, 'Les Frleurs du mal', 'Edition de poche', '1789CB', 2);

INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (10, 'Livres', 20.30, 0.2, 21.50, '2345JBP', 'Le Malade Imaginaire');
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (10, 'Le Malade Imaginaire', 'Edition de poche', '2345JBP', 4);

INSERT INTO articles (id, category, prixHT, tva, prixTTC, ref, designation) VALUES (11, 'Livres', 20.30, 0.2, 21.50, '3154JV', '20000 Lieues sous les mers');
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (11, '20000 Lieues sous les mers', 'Edition de poche', '3154JV', 6);

-- Persistence Adresses Clients

INSERT INTO Adresses (id, num_rue, rue, code_postal, ville, pays) VALUES (1, 12, 'Rue des étangs', '62870', 'Roussent', 'France');

-- Persistance Clients en Base

INSERT INTO Clients (id, nom, prenom, email, id_adresses, num_compte, nb_commandes) VALUES (1, 'Abdoulaye', 'Nzola', 'nzola@ngando.fr', 1, '200518NA', 20);

-- Persistance Commands Embedded Objects





