show databases;
use webdb;

-- 대소문자 구분 안한다.
sElect version(), current_date(), nOw() from dual;

-- 수학함수, 사칙 연산도 된다.
select 1+2+3+4 sum from dual;
SELECT SIN(PI() / 4) FROM DUAL;

-- table 생성: DML
CREATE TABLE pet (
    name VARCHAR(100),
    owner VARCHAR(20),
    species VARCHAR(20),
    gender CHAR(1),
    birth DATE,
    death DATE
);

-- schema 확인 describe
desc pet;

-- table 삭제
drop table pet;
show tables;

-- insert: DML(C)
insert into pet values(
'ㄹㄹ', 'me', 'dog', 'm', '2000-12-12', null
);

-- select: DML(R)
select * from pet;

-- update: DML(U)
update pet set name='ddog' where name = 'dd';
update pet set death=null where name != 'bowger';

-- delete: DML(D)
delete from pet where name='ddog';

-- load data
load data local infile 'd:\pet.txt' into table pet;

-- select
select name, gender from pet where name = 'bowser';


