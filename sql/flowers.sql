DROP DATABASE IF EXISTS flowers;
CREATE DATABASE flowers;
USE flowers;

CREATE TABLE flower (
  id          INT(11)        NOT NULL AUTO_INCREMENT,
  name        VARCHAR(100)   NOT NULL,
  price       NUMERIC(10, 2) NOT NULL,
  url         VARCHAR(300)   NOT NULL,
  color       VARCHAR(50)    NOT NULL,
  description VARCHAR(200)   NOT NULL,
  PRIMARY KEY (id)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE cus (
  id       INT(11)      NOT NULL AUTO_INCREMENT PRIMARY KEY,
  email    VARCHAR(100) NOT NULL,
  name     VARCHAR(100) NOT NULL,
  phone    VARCHAR(20)  NOT NULL,
  city     VARCHAR(100) NOT NULL,
  address  VARCHAR(100) NOT NULL,
  flowerid INT(11)      NOT NULL,
  FOREIGN KEY (flowerid) REFERENCES flower (id)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

