--liquibase formatted sql

--changeset abii:1
ALTER TABLE users
    ADD COLUMN image VARCHAR(64);

--changeset abii:2
ALTER TABLE users_aud
ADD COLUMN image VARCHAR(64);
