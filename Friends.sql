--Creating a friends table and performing the adding, updating and deleting of records.
CREATE TABLE friends(id INTEGER, name TEXT, birthday DATE);
INSERT INTO friends(id, name, birthday)
VALUES(1, 'Jane Doe', '1990-05-30');
SELECT *
FROM friends;

INSERT INTO friends(id, name, birthday)
VALUES(2, 'Kurt Weller', '1908-06-12');
INSERT INTO friends(id, name, birthda);
VALUES(3, 'Agent Patterson', '1990-07-08');
SELECT *
FROM friends;

UPDATE friends
SET name = 'Jane Smith'
WHERE id = 1;
SELECT *
FROM friends;

ALTER TABLE friends
ADD COLUMN email TEXT; 
ALTER TABLE friends
ADD COLUMN instagram TEXT;
SELECT *
FROM friends;

UPDATE friends
SET email = 'jane@codecademy.com'
WHERE id = 1;
UPDATE friends
SET email = 'jane@codecademy.com'
WHERE id = 2;
UPDATE friends
SET email = 'jane@codecademy.com'
WHERE id = 3;
SELECT *
FROM friends;

DELETE FROM friends
WHERE id = 1;
SELECT *
FROM friends;
