CREATE TABLE IF NOT EXISTS users
(
    id            bigint,
    name          varchar(32),
    creation_date date,
    primary key(id)
);