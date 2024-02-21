/* Data for the User table */
INSERT INTO users (username, password, names, paternal_surname, maternal_surname, nationality, region, phone, birthdate, terms_and_conditions) VALUES ('pablo@gmail.com', '123456', 'Pablo', 'Guti', 'San.', 'Chileno', 'Metropolitana', 56567678, '1999-08-09', 'accept')


/* Data for the Country table */
INSERT INTO categories( name ) VALUES ( 'flores')
INSERT INTO categories( name ) VALUES ( 'Maceteros')

/* Data for the Country table */
INSERT INTO countries( name ) VALUES ( 'Argentina')
INSERT INTO countries( name ) VALUES ( 'Bolivia')
INSERT INTO countries( name ) VALUES ( 'Chile')
INSERT INTO countries( name ) VALUES ( 'Colombia')
INSERT INTO countries( name ) VALUES ( 'España')
INSERT INTO countries( name ) VALUES ( 'Mexico')
INSERT INTO countries( name ) VALUES ( 'Perú')


/* Data for the Region table */
INSERT INTO regions( name ) VALUES ( 'Arica y Parinacota')
INSERT INTO regions( name ) VALUES ( 'Antofagasta')
INSERT INTO regions( name ) VALUES ( 'Coquimbo')
INSERT INTO regions( name ) VALUES ( 'Metropolitana')
INSERT INTO regions( name ) VALUES ( 'Maule')
INSERT INTO regions( name ) VALUES ( 'Biobío')
INSERT INTO regions( name ) VALUES ( 'Los Ríos')

/* Data for the Post table */
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso A', 'Descripcion breve examples', 1, 2, 1, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso B', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso C', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso D', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso E', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso F', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso G', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso H', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso I', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso J', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', true, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso K', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', false, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso L', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', false, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso M', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', false, NOW())
INSERT INTO posts ( user_id, title, brief_description, category_id, country_id, region_id, detailed_description, enabled, creation_date ) VALUES (1, 'Aviso N', 'Descripcion breve examples', 1, 2, 3, 'descripcion detallada lalalala', false, NOW())
