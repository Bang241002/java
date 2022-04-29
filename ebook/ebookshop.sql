create database if not exists ebookshop;

use ebookshop;

drop table if exists books;
create table book(
    id int,
    title varchar(50),
    author varchar(50),
    price float,
    qty int,
    primary key(id)
);

insert into books values(1001,	'java for dummies',	'dang kim thi'	,11.11,	11);
insert into books values(1002,	'more java for dummies','Codelean VN',	22.22,	22	);
insert into books values(1003,	'more java for dummies','Mohammad Ali' ,33.33,	33	);
insert into books values(1004,	'A cup of java','Kumar',44.44,44);
insert into books values(1005,	'A cup of java','Kevin Jones',55.55	,55);

select * from books;