create database if not exists harry_potter;
use harry_potter;
create table if not exists accounts(
	code int primary key auto_increment,
    name varchar(20) not null,
    username varchar(10) not null unique key,
    password varchar(10) not null
);

create table if not exists houses(
	code int primary key,
    name varchar(10) not null,
    animal varchar(10) not null,
    color varchar(10) not null,
    value varchar(100) not null
);

create table if not exists affiliations(
	code int not null,
    name varchar(50) not null,
    code_affiliation int not null,
    constraint pk_affiliations primary key (code, code_affiliation),
    constraint fk_character_affiliation foreign key (code_character) references characters(code)
);

create table if not exists characters(
	code int not null,
    name varchar(50) not null,
    code_house int not null,
    constraint pk_characters primary key (code, code_house),
    constraint fk_character_house foreign key (code_house) references houses(code)
);
