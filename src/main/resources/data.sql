--Categories Persistence................................................................................................

INSERT INTO Categorie (id, nom, description) VALUES (1, 'Livres', 'Litterature');
INSERT INTO Categorie (id, nom, description) VALUES (2, 'DVD', 'film');
INSERT INTO Categorie (id, nom, description) VALUES (3, 'CD', 'Bandes Annonce');
INSERT INTO Categorie (id, nom, description) VALUES (4, 'Goodies', 'Objets & Accessoires');

-- Persistance Auteurs..................................................................................................

INSERT INTO Auteurs (id, nom) VALUES (1, 'Victor Hugo');
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
INSERT INTO auteurs (id, nom) VALUES (13, 'Steves Kloves');
INSERT INTO auteurs (id, nom) VALUES (14, 'Tite Kubo');
INSERT INTO auteurs (id, nom) VALUES (15, 'Chris Evans');

-- Persistance Editeurs.................................................................................................

INSERT INTO editeurs (id, enseigne) VALUES (1, 'Gallimard');
INSERT INTO editeurs (id, enseigne) VALUES (2, 'Livre de poche');
INSERT INTO editeurs (id, enseigne) VALUES (3, 'Poche Junior');
INSERT INTO editeurs (id, enseigne) VALUES (4, 'J ai lu');

-- Persistance d'objets livre en tant que livre et en tant Qu'article...................................................

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (7, 'Livres', 23.56, 0.2, 192021, 'Les miserables', 200);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (7, 'Les miserables', 'Gallimard', '1576VH', 1);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (8, 'Livres', 20.30, 0.2, 222324, 'Lestat le vampire', 50);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (8, 'Lestat le vampire', 'Gallimard', '1689AR', 3);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (9, 'Livres', 20.30, 0.2, '1789CB', 'Bleach', 76);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (9, 'Bleach', 'Edition de poche', '1789TK', 14);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (10, 'Livres', 20.30, 0.2, '2345JBP', 'Germinal', 32);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (10, 'Germinal', 'Edition de poche', '2345VH', 1);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (11, 'Livres', 20.30, 0.2, '3154JV', '20000 Lieues sous les mers', 40);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (11, '20000 Lieues sous les mers', 'Edition de poche', '3154JV', 6);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (12, 'Livres', 20.30, 0.2, '123', 'Le seigneur des anneaux', 10 );
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (12, 'Le seigneur des anneaux', 'Edition de poche', '3174TK', 7);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (13, 'Livres', 20.30, 0.2, '456', 'Snowpiercer', 45);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (13, 'Snowpiercer', 'Edition de poche', '3154CE', 15);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (14, 'Livres', 20.30, 0.2, '789', 'Le silence des agneaux', 100);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (14, 'Le silence des agneaux', 'Edition de poche', '3154TH', 11);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (15, 'Livres', 20.30, 0.2, '101112', 'Le trône de fer', 100);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (15, 'Le trône de fer', 'Edition de poche', '3154GRM', 10);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (16, 'Livres', 20.30,  0.2,   '131415', 'La planete des singes', 58);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (16, 'La planete des singes', 'Livre de poche', '3154PB', 9);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (17, 'Livres', 20.30, 0.2, '161718', 'Harry Potter', 70);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (17, 'Harry Potter', 'Edition de poche', '3154YM', 13);

INSERT INTO articles (id, category, prixHT, tva, ref, designation, stock) VALUES (18, 'Livres', 28, 0.2, '161719', 'Blade Runner', 70);
INSERT INTO livres (id, titre, editeur, isbn, id_auteur) VALUES (18, 'Blade Runner', 'J ai lu', '3154PKD', 12);

-- Persistence Adresses Clients.........................................................................................

INSERT INTO Adresses (id, num_rue, rue, code_postal, ville, pays) VALUES (1, 12, 'Rue des étangs', '62870', 'Roussent', 'France');

-- Persistance Clients Utilisateurs en Base

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (1, false, 'Nguma', 'nzola@ngando.fr');
INSERT INTO Client (id, nom, prenom, num_compte, nb_commandes) VALUES (1, 'Abdoulaye', 'Nzola', '200518NA', 20);

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (4, false, 'Nèh', 'kimia@ngando.fr');
INSERT INTO Client (id, nom, prenom, num_compte, nb_commandes) VALUES (4, 'Abdoulaye', 'Kimia', '161221KA', 53);

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (5, false, 'Innoss', 'inoss@molodoi.fr');
INSERT INTO Client (id, nom, prenom, num_compte, nb_commandes) VALUES (5, 'Balumé', 'Innocent', '160486IB', 53);

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (7, false, 'Aigle', 'Ipupa@tokosss.fr');
INSERT INTO Client (id, nom, prenom, num_compte, nb_commandes) VALUES (7, 'Ipupa', 'Fally Nsimba', '19760410FI', 53);

-- Persistance Admins Utilisateurs en Base..............................................................................

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (2, true, 'GegorMan', 'gegor@man.fr');
INSERT INTO Admin (id, niv_Acces) VALUES (2, 'Super Admin');

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (3, true, 'Jeff', 'jloyd.ba@gmail.fr');
INSERT INTO Admin (id, niv_Acces) VALUES (3, 'Super Admin');

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (6, true, 'Ngando', 'ngando.ba@gmail.fr');
INSERT INTO Admin (id, niv_Acces) VALUES (6, 'Admin');

INSERT INTO Utilisateur (id, is_admin,  pseudo, email) VALUES (8, true, 'Likoko', 'mokokoli@gmail.fr');
INSERT INTO Admin (id, niv_Acces) VALUES (8, 'Admin');

-- Persistance Commands Embedded Objects................................................................................

INSERT INTO Commande (id, id_client, date_commande, status ) VALUES (1, 1, '2023-07-19', 'Términée');

-- Persistance LigneCommands Embedded Objects

INSERT INTO Ligne_Commande (id, commande_id, article_id, quantite) VALUES (1, 1, 8, 1 );
INSERT INTO Ligne_Commande (id, commande_id, article_id, quantite) VALUES (2, 1, 12, 4 );








