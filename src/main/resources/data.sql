INSERT INTO player (id, firstname, lastname, masters, newcourse)
VALUES (1, 'Johan', 'Rahm', 1, 2),
       (2, 'Felix', 'Rahm', 3, 4);

INSERT INTO scorecard (id, coursename, numberofrelocks, numberofrelocksused)
VALUES (1, 'masters', 5, 0),
       (2, 'new', 3, 0),
       (3, 'masters', 24, 0),
       (4, 'new', 18, 0);

INSERT INTO hole (id, scorecard, par, score, locked)
VALUES (1, 1, 4, 6, false),
       (2, 1, 3, 5, false),
       (3, 1, 4, 6, false),
       (4, 1, 3, 5, false),
       (5, 1, 3, 5, false),
       (6, 1, 4, 6, false),
       (7, 1, 4, 6, false),
       (8, 1, 4, 6, false),
       (9, 1, 5, 7, false),
       (10, 1, 4, 6, false),
       (11, 1, 4, 6, false),
       (12, 1, 4, 6, false),
       (13, 1, 4, 6, false),
       (14, 1, 4, 6, false),
       (15, 1, 5, 7, false),
       (16, 1, 3, 5, false),
       (17, 1, 5, 7, false),
       (18, 1, 3, 5, false),
       (1, 2, 4, 6, false),
       (2, 2, 3, 5, false),
       (3, 2, 4, 6, false),
       (4, 2, 4, 6, false),
       (5, 2, 4, 6, false),
       (6, 2, 4, 6, false),
       (7, 2, 5, 7, false),
       (8, 2, 3, 5, false),
       (9, 2, 5, 7, false),
       (10, 2, 4, 6, false),
       (11, 2, 4, 6, false),
       (12, 2, 3, 5, false),
       (13, 2, 5, 7, false),
       (14, 2, 3, 5, false),
       (15, 2, 4, 6, false),
       (16, 2, 4, 6, false),
       (17, 2, 4, 6, false),
       (18, 2, 4, 6, false),
       (1, 3, 4, 6, false),
       (2, 3, 3, 5, false),
       (3, 3, 4, 6, false),
       (4, 3, 3, 5, false),
       (5, 3, 3, 5, false),
       (6, 3, 4, 6, false),
       (7, 3, 4, 6, false),
       (8, 3, 4, 6, false),
       (9, 3, 5, 7, false),
       (10, 3, 4, 6, false),
       (11, 3, 4, 6, false),
       (12, 3, 4, 6, false),
       (13, 3, 4, 6, false),
       (14, 3, 4, 6, false),
       (15, 3, 5, 7, false),
       (16, 3, 3, 5, false),
       (17, 3, 5, 7, false),
       (18, 3, 3, 5, false),
       (1, 4, 4, 6, false),
       (2, 4, 3, 5, false),
       (3, 4, 4, 6, false),
       (4, 4, 4, 6, false),
       (5, 4, 4, 6, false),
       (6, 4, 4, 6, false),
       (7, 4, 5, 7, false),
       (8, 4, 3, 5, false),
       (9, 4, 5, 7, false),
       (10, 4, 4, 6, false),
       (11, 4, 4, 6, false),
       (12, 4, 3, 5, false),
       (13, 4, 5, 7, false),
       (14, 4, 3, 5, false),
       (15, 4, 4, 6, false),
       (16, 4, 4, 6, false),
       (17, 4, 4, 6, false),
       (18, 4, 4, 6, false);

COMMIT ;