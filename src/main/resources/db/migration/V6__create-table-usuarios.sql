CREATE TABLE IF NOT EXISTS users (

    id bigint NOT NULL AUTO_INCREMENT,
    login varchar(100) NOT NULL,
    password varchar(255) NOT NULL,
    enabled tinyint(4) DEFAULT NULL,
    PRIMARY KEY(id)

);