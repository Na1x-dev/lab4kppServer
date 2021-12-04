drop table users;
drop table bills;
drop table transactions;
drop table components;

CREATE TABLE IF NOT EXISTS users
(
    id    BIGSERIAL PRIMARY KEY ,
    firstname  VARCHAR(200) NOT NULL,
    lastname VARCHAR(200) NOT NULL,
    username VARCHAR(200) NOT NULL,
    password VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS bills
(
    id    BIGSERIAL PRIMARY KEY ,
    username VARCHAR(200) NOT NULL,
    iban VARCHAR (40) NOT NULL,
    card_number VARCHAR (19) NOT NULL,
    card_name VARCHAR (200) NOT NULL,
    card_validity VARCHAR (5) NOT NULL,
    balance DOUBLE PRECISION NOT NULL,
    is_auto_block BOOLEAN NOT NULL,
    is_manual_block BOOLEAN NOT NULL
    );

CREATE TABLE IF NOT EXISTS transactions
(
    id  BIGSERIAL PRIMARY KEY ,
    username VARCHAR(200) NOT NULL,
    name_of_transaction VARCHAR (200) NOT NULL,
    check_number VARCHAR (10) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    description VARCHAR NOT NULL,
    card_number VARCHAR (19) NOT NULL
    );

CREATE TABLE IF NOT EXISTS components
(
    id  BIGSERIAL PRIMARY KEY ,
    name_of_component VARCHAR (200) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    description VARCHAR NOT NULL
    );