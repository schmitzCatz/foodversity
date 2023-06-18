--liquibase formatted sql
--changeset oschmitz:1 dbms:postgresql
-- Clean Up
DROP TABLE IF EXISTS "Person" CASCADE ;
DROP TABLE IF EXISTS "User" CASCADE ;
DROP TABLE IF EXISTS "Acquaintance" CASCADE ;
DROP TYPE IF EXISTS "sex" CASCADE ;
-- Enable UUID
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
-- Custom Types
CREATE TYPE sex AS ENUM('MALE','FEMALE', 'DIVERSE', 'INDEFINITE');

CREATE TABLE "Person" (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    created_at timestamp DEFAULT now(),
    ---
    name varchar NOT NULL,
    day_of_birth date NOT NULL,
    height numeric(3,2) NOT NULL,
    sex sex DEFAULT 'INDEFINITE'
);
CREATE TABLE "User" (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    created_at timestamp DEFAULT now(),
    ---
    email varchar NOT NULL ,
    password varchar NOT NULL,
    avatar varchar,
    person_id uuid references "Person"(id)
);

CREATE TABLE "Acquaintance" (
    user_id uuid references "User"(id),
    person_id uuid references "Person"(id)
)