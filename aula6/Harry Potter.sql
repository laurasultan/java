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
	code int primary key,
    name varchar(50) not null
);

create table if not exists characters(
	code int not null,
    name varchar(50) not null,
    code_house varchar(10) not null,
    code_affiliation varchar(50) not null,
    constraint pk_characters primary key (code_house, code_affiliation),
    constraint fk_house_character foreign key (code_house) references houses(code),
    constraint fk_affiliation_character foreign key (code_affiliation) references affiliations(code)
);