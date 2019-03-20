
# --- !Ups

create table property (
  type                          varchar(31) not null,
  id                            bigint auto_increment not null,
  num_beds                      integer not null,
  num_baths                     integer not null,
  price                         double not null,
  garden_size                   double,
  garage                        boolean default false,
  floor                         integer,
  constraint pk_property primary key (id)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  role                          varchar(255),
  fname                         varchar(255),
  lname                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);


# --- !Downs

drop table if exists property;

drop table if exists user;

