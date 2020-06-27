create table IF NOT EXISTS Book (
	id Integer identity primary key,
	ISBN varchar(13),
	title varchar(255),
	price numeric
);

create table IF NOT EXISTS Author(
	id Integer identity primary key,
	author varchar(30)
);

create table IF NOT EXISTS Author_Book(
	id Integer identity primary key,
	author_id Integer ,
	book_id Integer
);

create table IF NOT EXISTS User(
	id varchar(40) primary key,
	password varchar(40),
	name varchar(30),
	phone varchar(13),
	email varchar(50)
);

create table IF NOT EXISTS Review(
	id Integer primary key,
	book varchar(255),
	grade int,
	content varchar(1000),
	date timestamp,
	user varchar(20)
);
/*
Alter table Author_Book Foreign key (author_id) refernces author (id);
Alter table Reivew add Foreign key (user) refernces user (name);

*/