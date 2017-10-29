CREATE SCHEMA `hibernateproject` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `hibernateproject`.`students` (
  `id` varchar(15) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `avatar_url` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `student_id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `hibernateproject`.`librarians` (
  `id` varchar(15) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `avatar_url` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `librarian_id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `hibernateproject`.`books` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;


CREATE TABLE `hibernateproject`.`history` (
  `id` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `action` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*
	insert query for books table
*/
insert into books (id, title, author, quantity) values (1, 'research nurse', 'royall patel', 16);
insert into books (id, title, author, quantity) values (2, 'senior editor', 'kellie deniske', 5);
insert into books (id, title, author, quantity) values (3, 'senior quality engineer', 'clive bon', 12);
insert into books (id, title, author, quantity) values (4, 'developer i', 'waverly fidian', 13);
insert into books (id, title, author, quantity) values (5, 'occupational therapist', 'obidiah poacher', 7);
insert into books (id, title, author, quantity) values (6, 'chief design engineer', 'ardisj whitley', 2);
insert into books (id, title, author, quantity) values (7, 'research nurse', 'isobel jarratt', 13);
insert into books (id, title, author, quantity) values (8, 'cost accountant', 'magdaia van leeuwen', 2);
insert into books (id, title, author, quantity) values (9, 'legal assistant', 'mickey britney', 15);
insert into books (id, title, author, quantity) values (10, 'business systems development analyst', 'grover duplain', 7);
insert into books (id, title, author, quantity) values (11, 'help desk technician', 'larisa goldstraw', 17);
insert into books (id, title, author, quantity) values (12, 'food chemist', 'dilan simenet', 25);
insert into books (id, title, author, quantity) values (13, 'community outreach specialist', 'libbi sealove', 18);
insert into books (id, title, author, quantity) values (14, 'structural analysis engineer', 'dani west', 20);
insert into books (id, title, author, quantity) values (15, 'internal auditor', 'trescha filippello', 21);
insert into books (id, title, author, quantity) values (16, 'recruiting manager', 'moyna kear', 7);
insert into books (id, title, author, quantity) values (17, 'account representative i', 'darya seywood', 3);
insert into books (id, title, author, quantity) values (18, 'cost accountant', 'jenn monshall', 19);
insert into books (id, title, author, quantity) values (19, 'senior cost accountant', 'myrtice wherton', 2);
insert into books (id, title, author, quantity) values (20, 'senior developer', 'garret steljes', 19);
insert into books (id, title, author, quantity) values (21, 'legal assistant', 'allis gronno', 20);
insert into books (id, title, author, quantity) values (22, 'systems administrator iii', 'padraic minger', 8);
insert into books (id, title, author, quantity) values (23, 'marketing manager', 'winni oxteby', 19);
insert into books (id, title, author, quantity) values (24, 'senior sales associate', 'edgardo pitrelli', 2);
insert into books (id, title, author, quantity) values (25, 'general manager', 'toby del checolo', 3);
insert into books (id, title, author, quantity) values (26, 'marketing manager', 'cammy gallie', 11);
insert into books (id, title, author, quantity) values (27, 'database administrator i', 'debora kisbee', 19);
insert into books (id, title, author, quantity) values (28, 'assistant media planner', 'elnore slight', 5);
insert into books (id, title, author, quantity) values (29, 'senior developer', 'naoma endacott', 16);
insert into books (id, title, author, quantity) values (30, 'internal auditor', 'eduino raddon', 10);
insert into books (id, title, author, quantity) values (31, 'civil engineer', 'luce scolding', 5);
insert into books (id, title, author, quantity) values (32, 'speech pathologist', 'myrah arnaldo', 8);
insert into books (id, title, author, quantity) values (33, 'safety technician ii', 'luz barnewille', 17);
insert into books (id, title, author, quantity) values (34, 'director of sales', 'carlo lacky', 3);
insert into books (id, title, author, quantity) values (35, 'assistant professor', 'sharity byrnes', 23);
insert into books (id, title, author, quantity) values (36, 'compensation analyst', 'gabe tapton', 20);
insert into books (id, title, author, quantity) values (37, 'senior cost accountant', 'harriot shillabear', 1);
insert into books (id, title, author, quantity) values (38, 'graphic designer', 'cortie lomis', 1);
insert into books (id, title, author, quantity) values (39, 'media manager iii', 'alyssa paxforde', 10);
insert into books (id, title, author, quantity) values (40, 'environmental tech', 'kelsey forsard', 25);
insert into books (id, title, author, quantity) values (41, 'structural analysis engineer', 'patrizius peddie', 11);
insert into books (id, title, author, quantity) values (42, 'help desk technician', 'michelina leyband', 19);
insert into books (id, title, author, quantity) values (43, 'account representative i', 'kristen lilbourne', 6);
insert into books (id, title, author, quantity) values (44, 'web designer i', 'jayson connors', 18);
insert into books (id, title, author, quantity) values (45, 'nurse practicioner', 'paige ashworth', 16);
insert into books (id, title, author, quantity) values (46, 'administrative officer', 'pall aberkirdo', 18);
insert into books (id, title, author, quantity) values (47, 'food chemist', 'amble lempenny', 23);
insert into books (id, title, author, quantity) values (48, 'nurse', 'robin bellham', 24);
insert into books (id, title, author, quantity) values (49, 'accountant i', 'denys faas', 15);
insert into books (id, title, author, quantity) values (50, 'civil engineer', 'somerset bockh', 17);
insert into books (id, title, author, quantity) values (51, 'sales associate', 'amie seger', 14);
insert into books (id, title, author, quantity) values (52, 'editor', 'karel mcisaac', 7);
insert into books (id, title, author, quantity) values (53, 'computer systems analyst ii', 'bax smerdon', 22);
insert into books (id, title, author, quantity) values (54, 'clinical specialist', 'lory aspinall', 11);
insert into books (id, title, author, quantity) values (55, 'administrative officer', 'udall etherington', 2);
insert into books (id, title, author, quantity) values (56, 'statistician iii', 'simonne newcomb', 9);
insert into books (id, title, author, quantity) values (57, 'nurse', 'antoni perrygo', 6);
insert into books (id, title, author, quantity) values (58, 'database administrator iv', 'roxi wraith', 2);
insert into books (id, title, author, quantity) values (59, 'product engineer', 'norry gozney', 21);
insert into books (id, title, author, quantity) values (60, 'account representative ii', 'amalia jollye', 21);
insert into books (id, title, author, quantity) values (61, 'senior editor', 'lenka benford', 6);
insert into books (id, title, author, quantity) values (62, 'librarian', 'magdaia lovekin', 22);
insert into books (id, title, author, quantity) values (63, 'analog circuit design manager', 'blythe kenvin', 7);
insert into books (id, title, author, quantity) values (64, 'vp quality control', 'omar o''sherrin', 12);
insert into books (id, title, author, quantity) values (65, 'help desk operator', 'tymothy martugin', 21);
insert into books (id, title, author, quantity) values (66, 'business systems development analyst', 'rosie joscelin', 4);
insert into books (id, title, author, quantity) values (67, 'general manager', 'tiphany grimster', 25);
insert into books (id, title, author, quantity) values (68, 'automation specialist iv', 'harrietta hugo', 15);
insert into books (id, title, author, quantity) values (69, 'chemical engineer', 'noble desouza', 7);
insert into books (id, title, author, quantity) values (70, 'environmental specialist', 'annabelle oldroyde', 20);
insert into books (id, title, author, quantity) values (71, 'occupational therapist', 'wood akerman', 9);
insert into books (id, title, author, quantity) values (72, 'accounting assistant ii', 'nikki durbyn', 16);
insert into books (id, title, author, quantity) values (73, 'internal auditor', 'ivar cordobes', 10);
insert into books (id, title, author, quantity) values (74, 'director of sales', 'natale wrigley', 24);
insert into books (id, title, author, quantity) values (75, 'director of sales', 'cati etherton', 13);
insert into books (id, title, author, quantity) values (76, 'speech pathologist', 'augustin wandrach', 22);
insert into books (id, title, author, quantity) values (77, 'mechanical systems engineer', 'ella duddell', 6);
insert into books (id, title, author, quantity) values (78, 'clinical specialist', 'kamila gotliffe', 12);
insert into books (id, title, author, quantity) values (79, 'tax accountant', 'roseanne buddles', 9);
insert into books (id, title, author, quantity) values (80, 'compensation analyst', 'durante rickett', 21);
insert into books (id, title, author, quantity) values (81, 'vp accounting', 'zorina dyne', 7);
insert into books (id, title, author, quantity) values (82, 'community outreach specialist', 'amby wingate', 17);
insert into books (id, title, author, quantity) values (83, 'safety technician i', 'kirstin lapping', 4);
insert into books (id, title, author, quantity) values (84, 'analyst programmer', 'tanhya choudhury', 10);
insert into books (id, title, author, quantity) values (85, 'executive secretary', 'dallas duchenne', 19);
insert into books (id, title, author, quantity) values (86, 'junior executive', 'lindy gillies', 15);
insert into books (id, title, author, quantity) values (87, 'help desk technician', 'rachelle ithell', 15);
insert into books (id, title, author, quantity) values (88, 'professor', 'arabela jellings', 16);
insert into books (id, title, author, quantity) values (89, 'senior financial analyst', 'janeen drinnan', 15);
insert into books (id, title, author, quantity) values (90, 'vp product management', 'almira feige', 10);
insert into books (id, title, author, quantity) values (91, 'health coach iii', 'jarvis huckerby', 7);
insert into books (id, title, author, quantity) values (92, 'quality control specialist', 'gareth terbruggen', 19);
insert into books (id, title, author, quantity) values (93, 'office assistant iii', 'selig degoy', 11);
insert into books (id, title, author, quantity) values (94, 'editor', 'shelley elintune', 8);
insert into books (id, title, author, quantity) values (95, 'payment adjustment coordinator', 'clarine bodell', 2);
insert into books (id, title, author, quantity) values (96, 'senior developer', 'hedvige kornyshev', 22);
insert into books (id, title, author, quantity) values (97, 'director of sales', 'ruthanne menichini', 22);
insert into books (id, title, author, quantity) values (98, 'food chemist', 'aura gloy', 18);
insert into books (id, title, author, quantity) values (99, 'research assistant iii', 'anni gillbee', 15);
insert into books (id, title, author, quantity) values (100, 'vp accounting', 'lanny vince', 25);
insert into books (id, title, author, quantity) values (101, 'assistant professor', 'conrade woliter', 16);
insert into books (id, title, author, quantity) values (102, 'information systems manager', 'lydia weall', 17);
insert into books (id, title, author, quantity) values (103, 'programmer analyst i', 'aubert hanlin', 14);
insert into books (id, title, author, quantity) values (104, 'executive secretary', 'ed alaway', 12);
insert into books (id, title, author, quantity) values (105, 'cost accountant', 'ethyl piller', 7);
insert into books (id, title, author, quantity) values (106, 'safety technician i', 'arlina munt', 8);
insert into books (id, title, author, quantity) values (107, 'vp accounting', 'leonerd lawrie', 13);
insert into books (id, title, author, quantity) values (108, 'budget/accounting analyst iv', 'stanley wedmore', 11);
insert into books (id, title, author, quantity) values (109, 'quality engineer', 'loleta hurn', 19);
insert into books (id, title, author, quantity) values (110, 'occupational therapist', 'dyann veryan', 11);
insert into books (id, title, author, quantity) values (111, 'social worker', 'elinore champney', 14);
insert into books (id, title, author, quantity) values (112, 'systems administrator i', 'vitoria van der krui', 18);
insert into books (id, title, author, quantity) values (113, 'vp accounting', 'fitzgerald whitehouse', 8);
insert into books (id, title, author, quantity) values (114, 'assistant media planner', 'marilyn bardill', 24);
insert into books (id, title, author, quantity) values (115, 'structural engineer', 'ediva foat', 1);
insert into books (id, title, author, quantity) values (116, 'senior quality engineer', 'dorena stuckey', 19);
insert into books (id, title, author, quantity) values (117, 'chemical engineer', 'kerwin stroyan', 3);
insert into books (id, title, author, quantity) values (118, 'teacher', 'harriette sondland', 2);
insert into books (id, title, author, quantity) values (119, 'software engineer i', 'vita crus', 11);
insert into books (id, title, author, quantity) values (120, 'database administrator iv', 'virgie fellows', 21);
insert into books (id, title, author, quantity) values (121, 'executive secretary', 'silvester dowgill', 2);
insert into books (id, title, author, quantity) values (122, 'legal assistant', 'babara hunnisett', 18);
insert into books (id, title, author, quantity) values (123, 'operator', 'diandra ainger', 10);
insert into books (id, title, author, quantity) values (124, 'vp product management', 'coralyn eriksson', 8);
insert into books (id, title, author, quantity) values (125, 'computer systems analyst ii', 'julie varnam', 13);
insert into books (id, title, author, quantity) values (126, 'web developer iii', 'silvain ferraresi', 6);
insert into books (id, title, author, quantity) values (127, 'sales representative', 'anne ferrant', 2);
insert into books (id, title, author, quantity) values (128, 'marketing manager', 'jacintha ennever', 5);
insert into books (id, title, author, quantity) values (129, 'registered nurse', 'clotilda baitey', 24);
insert into books (id, title, author, quantity) values (130, 'teacher', 'shermie mcgreil', 8);
insert into books (id, title, author, quantity) values (131, 'clinical specialist', 'liz lipprose', 19);
insert into books (id, title, author, quantity) values (132, 'community outreach specialist', 'barbra bougen', 12);
insert into books (id, title, author, quantity) values (133, 'data coordiator', 'gerrie greatex', 22);
insert into books (id, title, author, quantity) values (134, 'safety technician ii', 'elysee emanuelli', 16);
insert into books (id, title, author, quantity) values (135, 'associate professor', 'janenna domico', 8);
insert into books (id, title, author, quantity) values (136, 'structural analysis engineer', 'catlee ianitti', 6);
insert into books (id, title, author, quantity) values (137, 'nurse', 'ivor brenstuhl', 7);
insert into books (id, title, author, quantity) values (138, 'geologist ii', 'shurlocke jewell', 12);
insert into books (id, title, author, quantity) values (139, 'design engineer', 'lani dallinder', 2);
insert into books (id, title, author, quantity) values (140, 'programmer analyst iv', 'lindsay hordle', 25);
insert into books (id, title, author, quantity) values (141, 'senior developer', 'lolita blaksley', 25);
insert into books (id, title, author, quantity) values (142, 'nuclear power engineer', 'hinze snary', 13);
insert into books (id, title, author, quantity) values (143, 'pharmacist', 'xaviera alexsandrev', 1);
insert into books (id, title, author, quantity) values (144, 'director of sales', 'ulric larose', 5);
insert into books (id, title, author, quantity) values (145, 'recruiting manager', 'ulises lacotte', 23);
insert into books (id, title, author, quantity) values (146, 'computer systems analyst iv', 'cissiee wigmore', 5);
insert into books (id, title, author, quantity) values (147, 'vp quality control', 'manolo adcock', 6);
insert into books (id, title, author, quantity) values (148, 'senior developer', 'fran duckels', 2);
insert into books (id, title, author, quantity) values (149, 'accountant ii', 'collen tithecott', 23);
insert into books (id, title, author, quantity) values (150, 'assistant manager', 'debor vigurs', 23);



