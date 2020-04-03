
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `first_name` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `last_name` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `email_address` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `job_title` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `mobile_phone` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `city` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `web_page` text CHARACTER SET utf8 COLLATE utf8_general_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `customers` (`id`, `first_name`, `last_name`, `email_address`, `job_title`, `mobile_phone`, `city`, `web_page`) VALUES
(1, 'Tilek', 'Sydykov', 'tilek@from.kg', 'student', '+99765123w', 'Osh', 'vector.edu.uk');

ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

