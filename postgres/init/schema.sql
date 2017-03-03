DROP SCHEMA IF EXISTS dev_base CASCADE;
CREATE SCHEMA IF NOT EXISTS dev_base;
ALTER DATABASE postgres SET search_path TO dev_base, public;

-- Language table
CREATE TABLE dev_base.language (
  id SERIAL PRIMARY KEY,
  name VARCHAR NOT NULL
);

INSERT INTO dev_base.language VALUES (0, 'Java');
INSERT INTO dev_base.language VALUES (1, 'C');
INSERT INTO dev_base.language VALUES (2, 'C++');

-- Developer table
CREATE TABLE dev_base.developer (
  id SERIAL PRIMARY KEY,
  firstname VARCHAR NOT NULL,
  lastname VARCHAR NOT NULL,
  experience INT,
  language_id INT REFERENCES dev_base.language(id)
);

INSERT INTO dev_base.developer VALUES (0, 'Jean', 'Mark', 3, 0);
INSERT INTO dev_base.developer VALUES (1, 'Jean', 'Luc', 5, 1);
INSERT INTO dev_base.developer VALUES (2, 'Jean', 'Charles', 10, 2);
INSERT INTO dev_base.developer VALUES (3, 'Jean', 'Louis', 1, 2);
