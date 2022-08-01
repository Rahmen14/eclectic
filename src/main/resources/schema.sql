CREATE TABLE player
(
    id        INTEGER PRIMARY KEY,
    firstname VARCHAR(64) NOT NULL,
    lastname  VARCHAR(64) NOT NULL,
    masters   INTEGER     NOT NULL,
    newcourse INTEGER     NOT NULL
);

CREATE TABLE scorecard
(
    id                  INTEGER PRIMARY KEY,
    coursename          VARCHAR(128) NOT NULL,
    numberofrelocks     integer      NOT NULL,
    numberofrelocksused integer      NOT NULL
);

CREATE TABLE hole
(
    id        INTEGER NOT NULL,
    scorecard INTEGER NOT NULL,
    par       integer NOT NULL,
    score     integer NOT NULL,
    locked    boolean not null,
    PRIMARY KEY (id, scorecard)
);
