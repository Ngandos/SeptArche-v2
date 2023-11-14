--DROP TABLE IF EXISTS dbuser;
--
--CREATE TABLE dbuser (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  username VARCHAR(250) NOT DROP
--  password VARCHAR(250) NOT NULL,
--  role VARCHAR(250) NOT NULL
--);

--DataBase Users Petsistance________________________________________________________________________________________

INSERT INTO DbUser (username, password, role) VALUES
('dbuser', '$2y$10$.qkbukzzX21D.bqbI.B2R.tvWP90o/Y16QRWVLodw51BHft7ZWbc.', 'USER'),
('dbadmin', '$2y$10$kp1V7UYDEWn17WSK16UcmOnFd1mPFVF6UkLrOOCGtf24HOYt8p1iC', 'ADMIN');

--Categories Persistence................................................................................................

INSERT INTO Categorie (id, nom, description) VALUES (1, 'Livres', 'Litterature');
INSERT INTO Categorie (id, nom, description) VALUES (2, 'DVD', 'film');
INSERT INTO Categorie (id, nom, description) VALUES (3, 'CD', 'Bandes Annonce');
INSERT INTO Categorie (id, nom, description) VALUES (4, 'Goodies', 'Objets & Accessoires');

-- Persistance Auteurs..................................................................................................

INSERT INTO Auteurs (id, nom, prenom) VALUES (1, 'Victor', 'Hugo');
INSERT INTO auteurs (id, nom, prenom) VALUES (2, 'Charles', 'Baudelaire');
INSERT INTO auteurs (id, nom, prenom) VALUES (3, 'Anne', 'Rice');
INSERT INTO auteurs (id, nom, prenom) VALUES (4, 'Jean Baptiste', 'Poquelin');
INSERT INTO auteurs (id, nom, prenom) VALUES (5, 'Mark', 'Twain');
INSERT INTO auteurs (id, nom, prenom) VALUES (6, 'Jules', 'Vernes');
INSERT INTO auteurs (id, nom, prenom) VALUES (7, '', 'Tolkien');
INSERT INTO auteurs (id, nom, prenom) VALUES (8, 'Yann', 'Martel');
INSERT INTO auteurs (id, nom, prenom) VALUES (9, 'Pierre', 'Boulle');
INSERT INTO auteurs (id, nom, prenom) VALUES (10, 'Georges RR', 'Martin');
INSERT INTO auteurs (id, nom, prenom) VALUES (11, 'Thomas', 'Harris');
INSERT INTO auteurs (id, nom, prenom) VALUES (12, 'Philipp', 'KK Dick');
INSERT INTO auteurs (id, nom, prenom) VALUES (13, 'Steves', 'Kloves');
INSERT INTO auteurs (id, nom, prenom) VALUES (14, 'Tite', 'Kubo');
INSERT INTO auteurs (id, nom, prenom) VALUES (15, 'Chris', 'Evans');

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

-- Persistence Adresses.................................................................................................

INSERT INTO Adresses (id, num_rue, rue, code_postal, ville, pays) VALUES (1, 12, 'Rue des étangs', '62870', 'Roussent', 'France');

-- Persistence Adresses Clients.........................................................................................

--INSERT INTO Client_Adresses (client_username, adresses_id) VALUES ('Popi', 1);

--Insertion Users Roles Admins dans les tables Users et Authorities......................................................

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (1, 'Nguma', 'nzola@ngando.fr', '1234', 0, 'ADMIN');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (2, 'Neh', 'kimia@ngando.fr', '5678', true, 'USER');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (3, 'Innoss', 'inoss@molodoi.fr', '9101112', true, 'USER');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (4, 'Aigle', 'Ipupa@tokosss.fr', '131415', true, 'USER');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (5, 'GegorMan', 'gegor@man.fr', '161718', true, 'USER');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (6, 'Jeff', 'jloyd.ba@gmail.fr', '192021', true, 'USER');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (7, 'Ngando', 'ngando.ba@gmail.fr', '222324', true, 'USER');

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (8, 'Likoko', 'mokokoli@gmail.fr', '252627', true, 'USER');

--Insertion Users Roles Clients dans les table Clients et Authorities...................................................

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (9, 'Popi', 'popilele@gmail.fr', '170990', true, 'USER');
INSERT INTO Client (username, nom, prenom, numCompte, email, password) VALUES ('Popi', 'Popilele', 'Maev', 'ACCU263456', 'Popilele@gmail.fr', '170990' );

INSERT INTO Users (id, username, email, password, enabled, role) VALUES (10,'Zolana', 'nzola@gmail.fr', '200518', true, 'USER');
INSERT INTO Client (username, nom, prenom, numCompte, email, pasword) VALUES ('Zolana', 'Abdoulaye', 'Nzola', 'ACCU256389', 'nzola@gmail.fr', '200518');

--Persistance Commands Embedded Objects................................................................................

--INSERT INTO Commande (id, contenu, numComm, dateComm, status) VALUES (1, '[ contenu: {"id": "1", "commande_id": "1", "article_id": "8", "quantité": "1" },{"id": "2", "commande_id": "1", "article_id": "12", "quantité": "4"}]', '00001', '2023-07-19', 'Términée');
--INSERT INTO LigneCommande (id, commandes_id, article_id, quantite) VALUES (1, 1, 8, 1);
--INSERT INTO LigneCommande (id, commandes_id, article_id, quantite) VALUES (2, 1, 12, 4);

--INSERT INTO Commande (id, contenu, numComm, dateComm, status) VALUES (2, '[ contenu: {"id": "3", "commande_id": "2", "article_id": "10", "quantité": "1" },{"id": "4", "commande_id": "2", "article_id": "9", "quantité": "10"}]', '00002', '2023-10-19', 'Términée');
--INSERT INTO LigneCommande (id, commande_id, article_id, quantite) VALUES (3, 2, 10, 5);
--INSERT INTO LigneCommande (id, commande_id, article_id, quantite) VALUES (4, 2, 9, 10);








