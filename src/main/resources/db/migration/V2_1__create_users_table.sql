CREATE TABLE `users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(60) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` VARCHAR(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `firstname` VARCHAR(60) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lastname`VARCHAR(60) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` VARCHAR(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `langue` VARCHAR(2) COLLATE utf8mb4_unicode_ci NOT NULL,
  `role`ENUM('admin','member','') COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
