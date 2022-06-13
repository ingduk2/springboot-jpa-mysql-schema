CREATE DATABASE IF NOT EXISTS `bookstore`;

USE bookstore;
CREATE TABLE IF NOT EXISTS `book_store_table` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

DELETE from bookstore.book_store_table;
insert into bookstore.book_store_table values(1, 'A');
insert into bookstore.book_store_table values(2, 'B');

CREATE DATABASE IF NOT EXISTS `book`;

USE book;
CREATE TABLE IF NOT EXISTS `book_table` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `bookstore_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

DELETE from book.book_table;
insert into book.book_table values(1, 'book1', 1, 1);
insert into book.book_table values(2, 'book2', 2, 1);
insert into book.book_table values(3, 'book3', 3, 2);