-- 문자열 함수

-- upper
select upper('busan'), ucase('BusaN'), upper('Busan') from dual;
select upper(first_name), last_name 
from employees
order by upper(first_name);

-- lower
select lower('BUSAN'), lcase('BusaN'), lower('Busan') from dual;
select lower(first_name), last_name 
from employees
order by lower(first_name);

-- substring(문자열, index, length) 1부터
select substring('hello world', 3, 2);

-- 예제) 1989년에 입사한 사원들의 이름, 입사일을 출력하라
select first_name, hire_date
from employees
where substring(hire_date, 1, 4) = '1989';

-- lpad(오른쪽 정렬), rpad(왼쪽 정렬)
select lpad('1234', 10, '-'), rpad('1234', 10, '-');

-- 예제) 직원들의 월급을 오른쪽 정렬(빈공간 *)
select lpad(salary, 10, '*')
from salaries;

-- trim(leading, trailing), ltrim, rtrim
select 
concat('---', ltrim('     hello     '), '---'), 
concat('---', rtrim('     hello     '), '---'),
concat('---', trim(both 'x' from 'xxxxxhelloxxxxx'), '---')
from dual;

-- length
select length('hello wolrd') from dual;