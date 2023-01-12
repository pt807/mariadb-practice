-- 서브쿼리(SUBQUERY) SQL 문제입니다.

-- 문제1.
-- 현재 평균 연봉보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select count(*)
from salaries
where to_date ='9999-01-01' and salary > (select avg(salary)
										  from salaries
                                          where to_date ='9999-01-01');

-- 문제2.(x)
-- 현재, 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 급여를 조회하세요. 단
-- 조회결과는 연봉의 내림차순으로 정렬되어 나타나야 합니다.

-- 문제3.
-- 현재, 자신의 부서 평균 급여보다 급여 많은 사원의 사번, 이름과 급여를 조회하세요
-- select avg(a.salary)
-- from  salaries a join dept_emp b  on  a.emp_no = b.emp_no
-- where a.to_date = '9999-01-01' and b.to_date = '9999-01-01'
-- group by b.dept_no;

select a.emp_no, a.first_name, b.salary
from employees a join salaries b join dept_emp c on a.emp_no = b.emp_no and a.emp_no = c.emp_no ,
	(select c.dept_no, avg(b.salary) as savg
	from employees a join salaries b join dept_emp c on a.emp_no = b.emp_no and a.emp_no = c.emp_no
	where b.to_date = '9999-01-01' and c.to_date = '9999-01-01'
	group by c.dept_no) d
where b.to_date = '9999-01-01' and c.to_date = '9999-01-01' and b.salary > d.savg;

-- 문제4.
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
-- select a.first_name
-- from employees a join dept_manager b on a.emp_no = b.emp_no
-- where b.to_date = '9999-01-01';

select a.emp_no, a.first_name, d.first_name, e.dept_name
from employees a join dept_emp b join dept_manager c join employees d join departments e
on a.emp_no = b.emp_no and b.dept_no = c.dept_no and d.emp_no = d.emp_no and c.dept_no = e.dept_no
where b.to_date = '9999-01-01' and c.to_date = '9999-01-01';

SELECT 
    a.emp_no,
    CONCAT(a.first_name, ' ', a.last_name) as name,
    CONCAT(d.first_name, ' ', d.last_name) as manage_name,
    e.dept_name
FROM
    employees a,
    dept_emp b,
    dept_manager c,
    employees d,
    departments e
WHERE
    a.emp_no = b.emp_no
        AND b.dept_no = c.dept_no
        AND d.emp_no = d.emp_no
        AND c.dept_no = e.dept_no
        AND b.to_date = '9999-01-01'
        AND c.to_date = '9999-01-01';

-- 문제5.
-- 현재, 평균급여가 가장 높은 부서의 사원들의 사번, 이름, 직책, 급여를 조회하고 급여순으로 출력하세요.
select a.emp_no, a.first_name, b.title, c.salary
from employees a join titles b join salaries c join dept_emp d
on a.emp_no = b.emp_no and a.emp_no = c.emp_no and a.emp_no = d.emp_no
where b.to_date = '9999-01-01' and c.to_date = '9999-01-01' and d.to_date = '9999-01-01' and d.dept_no = 
	(select dept_no
	 from (select dept_no, avg(salary)
            from salaries a join dept_emp b on a.emp_no = b.emp_no
            where b.to_date = '9999-01-01'
            group by dept_no
            order by avg(salary) desc
            limit 0, 1) a)
order by c.salary desc;

-- 문제6.
-- 평균 급여가 가장 높은 부서는?
-- 부서이름, 평균 급여
select c.dept_name, avg(a.salary)
from salaries a join dept_emp b join departments c on a.emp_no = b.emp_no and b.dept_no = c.dept_no
where b.to_date = '9999-01-01'
group by c.dept_name
order by avg(a.salary) desc
limit 0, 1;

-- 문제7.
-- 평균 급여가 가장 높은 직책?
-- 직책, 평균 급여
select b.title, avg(a.salary)
from salaries a join titles b on a.emp_no = b.emp_no
where a.to_date = '9999-01-01' and b.to_date = '9999-01-01'
group by b.title
order by avg(a.salary) desc
limit 0, 1;

-- 문제8.
-- 현재 자신의 매니저보다 높은 급여를 받고 있는 직원은?
-- 부서이름, 사원이름, 급여, 매니저 이름, 메니저 급여 순으로 출력합니다.



