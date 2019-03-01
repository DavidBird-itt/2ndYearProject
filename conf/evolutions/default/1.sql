# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table houses (
  id                            bigint auto_increment not null,
  address                       varchar(255),
  postcode                      varchar(255),
  num_beds                      integer not null,
  num_baths                     integer not null,
  price                         double not null,
  constraint pk_houses primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

create table LandLord (
  id                            bigint auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  numOfProperties               INTEGER not null,
  rentAmount                    INTEGER not null,
  email                         varchar(255),
  role                          varchar(255)
  constraint pk_LandLord PRIMARY key (id)
)


# --- !Downs

drop table if exists houses;

drop table if exists user;

drop table if exists LandLord;

