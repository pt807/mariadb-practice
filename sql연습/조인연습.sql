-- inner join

-- 예제1) 현재, 근무하고 있는 직원의 이름과 직책을 모두 출력하세요.
select a.first_name, b.title
  from employees a, titles b
 where a.emp_no = b.emp_no			-- join 조건(n-1)
   and b.to_date = '9999-01-01';	-- row 선택 조건

select a.first_name, a.gender, b.title
from employees a, titles b
where a.emp_no = b.emp_no 	
and b.to_date = '9999-01-01' and a.gender = 'f' and b.title = 'engineer';
-- 같음
select a.first_name, a.gender, b.title
from employees a join titles b on a.emp_no = b.emp_no 	
where b.to_date = '9999-01-01' and a.gender = 'f' and b.title = 'engineer';

--
-- ANSI/ISO SQL1999 JOIN 표준 문법
--

-- 1) Natural Join
-- 	  조인 대상이 되는 두 테이블에 이름이 같은 공통 컬럼이 있으면 조인 조건을
--    명시하지 않고 암묵적으로 조인이 된다.
select a.first_name, a.gender, b.title
from employees a natural join titles b	
where b.to_date = '9999-01-01';

-- 2) join ~ using
--    natural join의 문제점
select count(*)
from salaries a join titles b using(emp_no)
where a.to_date = '9999-01-01' and b.to_date = '9999-01-01';

-- 3) join ~ on ***
-- 예제) 현재, 직책별 평균 연봉을 큰 순서대로 출력 하세요.
select a.title, avg(b.salary)
from titles a join salaries b on a.emp_no = b.emp_no
where a.to_date = '9999-01-01' and b.to_date = '9999-01-01'
group by a.title
order by avg(b.salary) desc;

-- 실습문제1
-- 현재, 직원별 근무 부서를 사번, 직원 이름, 부서명으로 출력해보세요
select a.emp_no, a.first_name, b.dept_name
from employees a join departments b join dept_emp c on  a.emp_no = c.emp_no and b.dept_no = c.dept_no
where c.to_date = '9999-01-01';

-- 실습문제2
-- 현재, 지급되고 있는 급여를 출력 해보세요
-- 사번, 이름, 급여 순으로 출력
select b.emp_no, b.first_name, a.salary
from salaries a join employees b on a.emp_no = b.emp_no
where a.to_date = '9999-01-01';

-- 실습문제3
-- 현재, 직책별 평균연봉, 직원수를 구하되 직책별 직원수가 100명 이상인 직책만 출력하세요
-- 직책, 평균연봉, 직원수 순으로 출력
select b.title, avg(a.salary), count(*)
from salaries a join titles b on a.emp_no = b.emp_no
where a.to_date = '9999-01-01' and b.to_date = '9999-01-01'
group by b.title
having count(*) >= 100;

-- 실습문제4
-- 현재, 부서별로 직책이 engineer 인 직원들에 대해서만 평균 급여를 구하세요
-- 부서이름, 평균급여 순으로 출력하세요
select a.dept_name, avg(d.salary)
from departments a join dept_emp b join titles c join salaries d on a.dept_no = b.dept_no and b.emp_no = c.emp_no and c.emp_no = d.emp_no
where b.to_date = '9999-01-01' and c.to_date = '9999-01-01' and d.to_date = '9999-01-01' and c.title = 'engineer'
group by a.dept_name
order by avg(d.salary) desc;

