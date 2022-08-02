--CREATE DATABASE Jaegers;
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(8),
    height DECIMAL(4,2),
    weight DECIMAL(5,3),
    status VARCHAR(9),
    origin TEXT,
    launch DATE,
    kaijuKill SMALLINT);
\i init_db.sql
\i queries.sql