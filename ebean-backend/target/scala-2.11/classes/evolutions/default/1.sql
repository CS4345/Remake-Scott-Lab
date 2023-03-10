# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table application (
  application_id                bigint auto_increment not null,
  user_id                       bigint,
  pref_one                      bigint,
  pref_two                      bigint,
  pref_three                    bigint,
  constraint pk_application primary key (application_id)
);

create table position (
  position_id                   bigint auto_increment not null,
  course_title                  varchar(255),
  faculty                       varchar(255),
  pay                           varchar(255),
  hours                         varchar(255),
  constraint pk_position primary key (position_id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  firstname                     varchar(255),
  lastname                      varchar(255),
  research_area                 varchar(255),
  title                         varchar(255),
  position                      varchar(255),
  affiliation                   varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  fax                           varchar(255),
  address                       varchar(255),
  city                          varchar(255),
  country                       varchar(255),
  zipcode                       varchar(255),
  comments                      varchar(255),
  status                        varchar(255),
  courses_taken                 varchar(255),
  degree_plan                   varchar(255),
  starting_semester             varchar(255),
  expected_graduation           varchar(255),
  constraint pk_user primary key (id)
);

alter table application add constraint fk_application_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_application_user_id on application (user_id);


# --- !Downs

alter table application drop foreign key fk_application_user_id;
drop index ix_application_user_id on application;

drop table if exists application;

drop table if exists position;

drop table if exists user;

