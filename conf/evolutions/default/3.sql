# --- Sample dataset

# --- !Ups
delete from property;

insert into property (type,id,num_beds,num_baths,price,landlord_email,garden_size,garage,stock) values ('h',1,4, 3, 400000.00, 'landlord@adk.com', 132, true,1);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage,stock) values ( 'h',2,2, 2, 300000.00, 134, true,1);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage,stock) values ( 'h',3,6, 4, 100000.00, 164, true,1);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage,stock) values ( 'h',4,2, 1, 400000.00, 100, false,1);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage,stock) values ( 'h',5,3, 3, 600000.00, 134, false,1);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage,stock) values ( 'h',6,2, 1, 100300.00, 200, true,1);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage,stock) values ( 'h',7,4, 3, 700000.00, 88, false,1);

insert into property (type,id,num_beds,num_baths,price,floor,stock) values ('a', 8,2,1,1100,3,1);
insert into property (type,id,num_beds,num_baths,price,floor,stock) values ('a', 9,3,2,1400,5,1);
insert into property (type,id,num_beds,num_baths,price,floor,stock) values ('a', 10,3,3,1700,2,1);
insert into property (type,id,num_beds,num_baths,price,floor,stock) values ('a', 11,1,1,800,1,1);
insert into property (type,id,num_beds,num_baths,price,floor,stock) values ('a', 12,2,1,1600,4,1);