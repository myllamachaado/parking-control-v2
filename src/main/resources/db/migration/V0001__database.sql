-- parking_control_db.tb_brand definition

CREATE TABLE `tb_brand` (
  `id` varchar(255) NOT NULL,
  `brand_car` varchar(70) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- parking_control_db.tb_role definition

CREATE TABLE `tb_role` (
  `role_id` varchar(255) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `UK_c9lijtmr0x68iu1vxftbu2u33` (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- parking_control_db.tb_user definition

CREATE TABLE `tb_user` (
  `user_id` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_4wv83hfajry5tdoamn8wsqa6x` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- parking_control_db.tb_car definition

CREATE TABLE `tb_car` (
  `id` varchar(255) NOT NULL,
  `model_car` varchar(70) NOT NULL,
  `brand_car_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_9y9k7urfxo4r4pk8h50o13rlo` (`model_car`),
  KEY `FK6go3qfhy4bffcyv3ydagtp7du` (`brand_car_id`),
  CONSTRAINT `FK6go3qfhy4bffcyv3ydagtp7du` FOREIGN KEY (`brand_car_id`) REFERENCES `tb_brand` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- parking_control_db.tb_parking_spot definition

CREATE TABLE `tb_parking_spot` (
  `id` varchar(255) NOT NULL,
  `apartment` varchar(30) NOT NULL,
  `block` varchar(30) NOT NULL,
  `color_car` varchar(70) NOT NULL,
  `license_plate_car` varchar(7) NOT NULL,
  `parking_spot_number` varchar(10) NOT NULL,
  `registration_date` datetime(6) NOT NULL,
  `responsable_name` varchar(150) NOT NULL,
  `model_car_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_sms6qglh44hhw4bpgwnp8umw1` (`license_plate_car`),
  UNIQUE KEY `UK_678owtycsgr3anxf3qw4s9r8u` (`parking_spot_number`),
  KEY `FKhmj6q550xey8t7nqosykcy7i1` (`model_car_id`),
  CONSTRAINT `FKhmj6q550xey8t7nqosykcy7i1` FOREIGN KEY (`model_car_id`) REFERENCES `tb_car` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- parking_control_db.tb_users_roles definition

CREATE TABLE `tb_users_roles` (
  `user_id` varchar(255) NOT NULL,
  `role_id` varchar(255) NOT NULL,
  KEY `FK6p4o2kxbq23rthm174k19xo2h` (`role_id`),
  KEY `FK85qorv8qojsxvl1nv56vckxmj` (`user_id`),
  CONSTRAINT `FK6p4o2kxbq23rthm174k19xo2h` FOREIGN KEY (`role_id`) REFERENCES `tb_role` (`role_id`),
  CONSTRAINT `FK85qorv8qojsxvl1nv56vckxmj` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;