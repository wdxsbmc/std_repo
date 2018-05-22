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


#show  database engines;
show engines;


#transaction
show variables like '%commit%';

start transaction;
select * from user_info;
update  user_info set  info_name='caca' where info_name='aaa';
update  user_info set  info_name='cbcb' where info_name='bbb';
select * from user_info;
rollback;
select * from user_info;

update  user_info set  info_name='caca' where info_name='aaa';
update  user_info set  info_name='cbcb' where info_name='bbb';
commit;
select * from user_info;

#create index
create index  index_user_info on  user_info(info_name);

show  index from user_info;

drop  index index_user_info on  user_info;


#view
create view  view_user_info as select * from user_info;
select  * from view_user_info;
drop view if exists view_user_info;



