CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

DROP TABLE IF EXISTS "user";
CREATE TABLE "user"(
    id uuid default uuid_generate_v4 (),
    username varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null,
    avatar varchar(255),
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS "person";
DROP TYPE IF EXISTS "sex";
CREATE TYPE "sex" AS ENUM('MALE', 'FEMALE', 'DIVERSE', 'INDEFINITE');
CREATE TABLE "person" (
    id uuid default uuid_generate_v4 (),
    day_of_birth date not null,
    sex sex not null
);