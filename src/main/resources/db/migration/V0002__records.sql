INSERT INTO tb_brand VALUES('4180a4044da844adab544f00f5a29645', 'KIA'),
('74fc0b42f4d749fcbb474652d8b482e0', 'FORD'),
('acd2ad8801aa4cc1abd27cc7dd887be7', 'TESLA'),
('c88d5cc28d984b1f94c3a0e8133feace', 'TOYOTA');

INSERT INTO tb_car VALUES('1fc7e80f44c944318d44b5560e118691', 'Model S', 'acd2ad8801aa4cc1abd27cc7dd887be7'),
('30e8c8e254124ef2b51349880bc9e2bb', 'Soul', '4180a4044da844adab544f00f5a29645'),
('4368231be75b40c1a2d171a96ddeb8b1', 'Sorrento', '4180a4044da844adab544f00f5a29645'),
('4abf659f14ec403bae905e0640566d75', 'Corola', 'c88d5cc28d984b1f94c3a0e8133feace'),
('79959a83fb2b442fa65c70ab4e7a06e3', 'Model X', 'acd2ad8801aa4cc1abd27cc7dd887be7'),
('8ba336b005ec4b489f85dc20bde2d1e7', 'SW4', 'c88d5cc28d984b1f94c3a0e8133feace'),
('ac1b2b3d949c45c88040d2d0db87c5a8', 'Model 3', 'acd2ad8801aa4cc1abd27cc7dd887be7');

INSERT INTO tb_role VALUES('081583a1748944df8ccd19a383d85a6d', 'ROLE_ADMIN'),
('714d716ac6f7456f8656d957d609d935', 'ROLE_USER');

INSERT INTO tb_user VALUES('11491e1bb8c2453d8e68453a204fab88', '$2a$12$2X7fswrRBYImsItLx9YwB.sjPfjZsCJy/LhwxXDGxmOvSHZoJF1rW', 'user2'),
('370f843f9c7442c295784c772e5fe3a6', '$2a$12$2X7fswrRBYImsItLx9YwB.sjPfjZsCJy/LhwxXDGxmOvSHZoJF1rW', 'user1'),
('4a61b85b248141bd9de85a78ee1a6b81', '$2a$12$2X7fswrRBYImsItLx9YwB.sjPfjZsCJy/LhwxXDGxmOvSHZoJF1rW', 'user3');

INSERT INTO tb_users_roles VALUES('370f843f9c7442c295784c772e5fe3a6', '714d716ac6f7456f8656d957d609d935'),
('370f843f9c7442c295784c772e5fe3a6', '081583a1748944df8ccd19a383d85a6d'),
('11491e1bb8c2453d8e68453a204fab88', '714d716ac6f7456f8656d957d609d935');
