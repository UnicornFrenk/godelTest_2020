create schema cinema;
	-- creating tables
CREATE TABLE film
(
    id bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    film_name varchar(256) NOT NULL,
    release_date date,
    genre varchar(256),
    director_id bigint(64) NOT NULL
);
CREATE UNIQUE INDEX film_id_uindex ON film (id);

CREATE TABLE director
(
    id bigint(64) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    first_name varchar(256) NOT NULL,
    last_name varchar(256) NOT NULL,
    birth_date date
);
CREATE UNIQUE INDEX director_id_uindex ON director (id);


ALTER TABLE film
ADD CONSTRAINT film_director_id_fk
FOREIGN KEY (director_id) REFERENCES director (id);

--filling table

--directors
insert into director (first_name, last_name, birth_date) VALUES ('Kventin',
                                                                 'Tarantino',
                                                                 '1963-03-26');


insert into director (first_name, last_name, birth_date) VALUES ('Kristopher',
                                                                 'Nolan',
                                                                 '1970-07-30');



insert into director (first_name, last_name, birth_date) VALUES ('Tatsiana',
                                                                 'Melgui',
                                                                 '1989-03-29');


insert into director (first_name, last_name, birth_date) VALUES ('Told',
                                                                 'Fillips',
                                                                 '1970-12-20');

--director1 films
insert into film (film_name, release_date, genre, director_id) VALUES
('Reservoir Dogs','1991-01-01', 'THRILLER',1);


insert into film (film_name, release_date, genre, director_id) VALUES
('Django Unchained','2012-01-01', 'DRAMA',1);


insert into film (film_name, release_date, genre, director_id) VALUES
('Kill Bill','2003-01-01', 'DRAMA',1);


insert into film (film_name, release_date, genre, director_id) VALUES
('Pulp Fiction','1994-01-01', 'COMEDY',1);



--director2 films
insert into film (film_name, release_date, genre, director_id) VALUES
('Remember','2000-02-02', 'COMEDY',2);


insert into film (film_name, release_date, genre, director_id) VALUES
('Inception','2010-02-02', 'THRILLER',2);


insert into film (film_name, release_date, genre, director_id) VALUES
('Due Date','2010-02-02', 'COMEDY',2);


--director4 films
insert into film (film_name, release_date, genre, director_id) VALUES
('Joker','2019-04-04', 'THRILLER',4);