#--check sql server codeset supportted
show character set;
#--check current code set
show variables like 'character_set%';
#--quick set charactor
set names gbk;

#--drop db 
drop database if exists mydata;

#--create
create database mydata;

#--change db
use mydata

#--drop table
drop table if exists user_info;

#--create table
create table user_info(
id int primary key auto_increment,
info_name varchar(10),
info_date date,
info_time time,
info_datetime datetime
)collate utf8_general_ci;
 

#--insert into  record
insert into user_info(info_name) values('aaa'),('bbb'),('ccc');

#--check collate
select * from user_info order by 'info_name';
