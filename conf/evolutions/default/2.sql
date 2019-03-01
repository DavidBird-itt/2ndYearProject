# --- Sample dataset

# --- !Ups
insert into user (email,name,password,role) values ( 'admin@adk.com', 'Alice Admin', 'password', 'admin' );
insert into user (email,name,password,role) values ( 'landlordr@adk.com', 'Lucy Landlord', 'password', 'landlord' );
insert into user (email,name,password,role) values ( 'member@adk.com', 'Mark Member', 'password', 'member' );

insert into LandLord (id,fname,lname,numOfProperties,rentAmount,email) values (1, 'Karl', 'Blair', 4, 1250, 'landlord123@adk.com');
insert into LandLord (id,fname,lname,numOfProperties,rentAmount,email) values (2, 'David', 'Bird', 5, 1400, 'landlord321@adk.com');