use webdb;

drop table member;
create table member(
	no int not null auto_increment,
    email varchar(100) not null,
    password varchar(64) not null,
    name varchar(100) not null,
    department varchar(100),
    primary key(no)
);

desc member;

alter table member add column juminbunho char(13) not null;
desc member;

alter table member drop juminbunho;
desc member;

alter table member add column juminbunho char(13) not null after email;
desc member;

alter table member change column department dept varchar(200) not null;
desc member;

alter table member add self_intro text;
desc member;

alter table member drop juminbunho;
desc member;

-- insert
insert into member values(null, 'asas@cas.com', password('1234'), '박대준', '개발팀', null);
select * from member;

insert into member(no, email, name, dept, password) values(null, 'asas2@cas.com', '박대준', '개발팀', password('1234'));

-- update
update member set email = 'asas3@cas.com', password = password('5678') where no = 2;

-- delete
delete from member where no = 2;


--  create user 'webdb'@'localhost' identified by 'webdb';
--  grant all privileges on webdb.* to 'webdb'@'localhost';

-- transaction
select @@autocommit;
set autocommit=0;

insert into member(no, email, name, dept, password) values(null, 'asas5@cas.com', '박대준', '개발팀', password('1234'));
select * from member;

commit;