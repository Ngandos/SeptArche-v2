--Categories Persistence

INSERT INTO Categorie (id, nom, description) VALUES (1, 'Livres', 'format physique');

-- Persistance Auteurs

INSERT INTO auteurs (id, nom) VALUES (1, 'Victor Hugo');
INSERT INTO auteurs (id, nom) VALUES (2, 'Charles Baudelaire');
INSERT INTO auteurs (id, nom) VALUES (3, 'Anne Rice');
INSERT INTO auteurs (id, nom) VALUES (4, 'Jean Baptiste Poquelin');
INSERT INTO auteurs (id, nom) VALUES (5, 'Mark Twain');
INSERT INTO auteurs (id, nom) VALUES (6, 'Jules Vernes');
INSERT INTO auteurs (id, nom) VALUES (7, 'Tolkien');
INSERT INTO auteurs (id, nom) VALUES (8, 'Yann Martel');
INSERT INTO auteurs (id, nom) VALUES (9, 'Pierre Boulle');
INSERT INTO auteurs (id, nom) VALUES (10, 'Georges RR Martin');
INSERT INTO auteurs (id, nom) VALUES (11, 'Thomas Harris');
INSERT INTO auteurs (id, nom) VALUES (12, 'Philipp K Dick');

-- Persistance Editeurs

INSERT INTO editeurs (id, Enseigne) VALUES (1, 'Gallimard');
INSERT INTO editeurs (id, Enseigne) VALUES (2, 'Livre de poche');
INSERT INTO editeurs (id, Enseigne) VALUES (3, 'Poche Junior');
INSERT INTO editeurs (id, Enseigne) VALUES (4, 'J ai lu');

-- Persistance d'objets livre en tant que livre et en tant Qu'article

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (7, 'Livres', 23.56, 0.2, 192021, 'Les misérables', 200);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (7, 'Les misérables', 'Gallimard', '1576VH', 1);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (8, 'Livres', 20.30, 0.2, 222324, 'Lestat le Vampire', 50);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (8, 'Lestat le Vampire', 'Gallimard', '1689AR', 3);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (9, 'Livres', 20.30, 0.2, '1789CB', 'Les Fleurs du mal', 76);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (9, 'Les Frleurs du mal', 'Edition de poche', '1789CB', 2);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (10, 'Livres', 20.30, 0.2, '2345JBP', 'Le Malade Imaginaire', 32);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (10, 'Le Malade Imaginaire', 'Edition de poche', '2345JBP', 4);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (11, 'Livres', 20.30, 0.2, '3154JV', '20000 Lieues sous les mers', 40);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (11, '20000 Lieues sous les mers', 'Edition de poche', '3154JV', 6);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (12, 'Livres', 20.30, 0.2, '123', 'Le seigneur des anneaux', 10 );
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (12, 'Le seigneur des anneaux', 'Edition de poche', '3174TK', 7);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (13, 'Livres', 20.30, 0.2, '456', 'Entretien avec un vampire', 45);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (13, 'Entretien avec un vampire', 'Edition de poche', '3154AR', 3);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (14, 'Livres', 20.30, 0.2, '789', 'Le silence des agneaux', 100);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (14, 'Le silence des agneaux', 'Edition de poche', '3154TH', 11);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (15, 'Livres', 20.30, 0.2, '101112', 'Le trône de fer', 100);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (15, 'Le trône de fer', 'Edition de poche', '3154GRM', 10);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (16, 'Livres', 20.30,  0.2,   '131415', 'La planete des singes', 58);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (16, 'La planete des singes', 'Livre de poche', '3154PB', 9);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (17, 'Livres', 20.30, 0.2, '161718', 'Lhistoire de PI', 70);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (17, 'Lhistoire de PI', 'Edition de poche', '3154YM', 8);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (18, 'Livres', 28, 0.2, '161719', 'Blade Runner', 70);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (18, 'Blade Runner', 'J ai lu', '3154PKD', 12);

-- Persistence Adresses Clients

INSERT INTO Adresses (id, num_rue, rue, code_postal, ville, pays) VALUES (1, 12, 'Rue des étangs', '62870', 'Roussent', 'France');

-- Persistance Clients en Base

INSERT INTO Clients (id, nom, prenom, email, id_adresses, num_compte, nb_commandes) VALUES (1, 'Abdoulaye', 'Nzola', 'nzola@ngando.fr', 1, '200518NA', 20);

-- Persistance Commands Embedded Objects

--INSERT INTO Commande (id, date_commande, status, contenu) VALUES (1, date_commande, "Términée", contenu);






