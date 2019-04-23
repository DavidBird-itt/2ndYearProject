# --- Sample dataset

# --- !Ups
delete from property;
delete from style;

insert into style (id,name) values (1, 'Bungalow');
insert into style (id,name) values (2, 'Cottage');
insert into style (id,name) values (3, 'Semi-detached');
insert into style (id,name) values (4, 'Detached');


insert into style (id,name) values (5, 'Studio');
insert into style (id,name) values (6, 'Loft');
insert into style (id,name) values (7, 'Railroad');


insert into property (id,num_beds,num_baths,price,stock) values (1,4, 3, 400000.00,1);
insert into property (id,num_beds,num_baths,price,stock) values (2,2, 2, 300000.00,1);
insert into property (id,num_beds,num_baths,price,stock) values (3,6, 4, 100000.00,1);
insert into property (id,num_beds,num_baths,price,stock) values (4,2, 1, 400000.00,1);
insert into property (id,num_beds,num_baths,price,stock) values (5,3, 3, 600000.00,1);
insert into property (id,num_beds,num_baths,price,stock) values (6,2, 1, 100300.00,1);
insert into property (id,num_beds,num_baths,price,stock) values (7,4, 3, 700000.00,1);

insert into property (id,num_beds,num_baths,price,stock) values (8,2,1,1100,1);
insert into property (id,num_beds,num_baths,price,stock) values (9,3,2,1400,1);
insert into property (id,num_beds,num_baths,price,stock) values (10,3,3,1700,1);
insert into property (id,num_beds,num_baths,price,stock) values (11,1,1,800,1);
insert into property (id,num_beds,num_baths,price,stock) values (12,2,1,1600,1);

insert into style_property(style_id, property_id) values(1,1);
insert into style_property(style_id, property_id) values(3,1);
insert into style_property(style_id, property_id) values(2,2);
insert into style_property(style_id, property_id) values(3,3);
insert into style_property(style_id, property_id) values(4,4);
insert into style_property(style_id, property_id) values(5,5);
insert into style_property(style_id, property_id) values(6,6);
insert into style_property(style_id, property_id) values(7,7);
insert into style_property(style_id, property_id) values(4,8);
insert into style_property(style_id, property_id) values(5,9);
insert into style_property(style_id, property_id) values(1,11);
insert into style_property(style_id, property_id) values(7,12);
