/*
* creat table
*/
drop database if exists mydata;

create database mydata;

use mydata

drop table if exists user_info;

create table user_info(
id int primary key auto_increment,
info_name varchar(10),
info_date date,
info_time time,
info_datetime datetime
);
 
insert into user_info(info_name) values('aaa');

