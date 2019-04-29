select* from EMPLOYEES;
select* from DEPARTMENTS;
select* from COUNTRIES;
select* from EMP_DETAILS_VIEW;
select* from JOB_HISTORY; 
select* from JOBS; --직책
select* from LOCATIONS; 
select first_name, last_name from employees; --특정 칼럼 단위로 조회
SELECT first_name as 이름, last_name as 성 FROM employees;  --별명 만들어주기
SELECT first_name 이름, last_name 성 FROM employees;	--별명 만들어주기
SELECT first_name 이름 , last_name 성, salary 일년연봉 FROM employees; --as를 생략해주어도 된다

--글자를 붙여 찍기 : 사이에 || 입력
--'babo' || 'ondal'  --> baboondal 이 출력된다.
select first_name, last_name from employees;
select first_name ||'씨의 봉급은 '||salary||' 원이지 말입니다.' from employees;  --이름과 봉급 출력
select first_name ||' '|| last_name || ' ' || salary*12 from employees; --이름, 연봉 출력

select department_id , department_name from departments; --부서id와 부서명을 출력

SELECT*
FROM employees
WHERE salary>5000; --봉급이 5000 이상인 사람을 출력

SELECT*
FROM employees
WHERE salary = 2400; --봉급이 2400인 사람을 출력

SELECT*
FROM employees
WHERE salary !=2400; --봉급이 2400이 아닌 사람을 출력
SELECT*
FROM employees
WHERE salary <> 2400; --봉급이 2400이 아닌 사람을 출력

SELECT first_name 이름,hire_date 입사일, department_id 부서번호
FROM employees
WHERE employee_id = 103; --사원 id가 103인 사람 출력

SELECT first_name||' '||last_name 이름,employee_id 사원id, department_id 부서번호 
FROM employees 
WHERE employee_id>=120 OR department_id=90  
AND SALARY<=8000;	--id가 120이상이거나, 부서번호가 90인 사원 출력. 추가로 salary가 8000이하인 사원 (and를 사용한다)

SELECT first_name||' '||last_name 이름,employee_id 사원id, department_id 부서번호 
FROM employees 
WHERE (employee_id>=120 OR department_id=90)  
AND SALARY<=8000; --AND가 먼저 계산된 후 나중에 OR가 처리된다. ()를 사용하면 OR가 먼저 처리된다. 결과가 달라진다.
					--상단의 '추가로'가 실제로 적용된 모습.
					
desc employees; --sql+ tool 명령어 이다.     '--'은 dos창에서 주석으로 역할한다.

SELECT DISTINCT department_id
FROM employees; --사원테이블을 이용하여 회사의 부서번호를 중복없이 조회 (distinct)

SELECT DISTINCT first_name||' '||last_name 성명
FROM employees 
WHERE department_id=90 or department_id=50; --부서번호가 90 or 50인 부서의 사원명(이름과 성 연결하여) 출력
SELECT DISTINCT first_name||' '||last_name 성명
FROM employees 
WHERE department_id IN (90,50) --상위 명령어에서 OR의 남발을 막는 방법
--(참고) SQL tuning : 속도를 빠르게 하는 것

SELECT salary 급여 
FROM employees 
WHERE salary>=5000 and salary<=10000; --급여가 5000부터 10000사이에 있는 직원의 이름과 급여를 출력 
--(기준이 되는 salary가 앞에 있어야 한다)
SELECT salary 급여 
FROM employees 
WHERE salary between 5000 and 10000; -- 상위의 between-and버전 (5000과 10000 포함)

SELECT first_name||' '||last_name 이름,salary 급여 
FROM employees 
WHERE department_id is null; --직원 중 부서id가 없는 직원의 이름과 급여를 출력

SELECT first_name||' '||last_name 이름,salary 급여 
FROM employees 
WHERE department_id is not null; --직원 중 부서id가 있는 직원의 이름과 급여를 출력

SELECT first_name||' '||last_name 이름,salary 급여, department_id 부서id 
FROM employees 
WHERE salary>=1500; --급여가 15000 이상인 직원들의 이름, 급여 부서ID를 조회하시오.

SELECT first_name||' '||last_name 이름,salary*12 연봉 
FROM employees 
WHERE (salary*12)>=170000; -- 직원중 해당조건만족하는 직원의 

SELECT first_name||' '||last_name 이름,salary 급여, hire_date 입사일
FROM employees 
WHERE hire_date<'2004-01-01'; --날짜검색 할때의 형식  '0000-00-00'과 연산자로 비교검색
--eclipse  2004-01-01  ⇒ american방식
--‘04/01/01’(년월일) ⇒ 한국 방식
--만약 2004  3월1일을 입력한다고 한다면  01-MAR-04(일월년) 이것이 원래의 내부 구조 이다.
--RR/MM/DD : (1959~2049년까지 컼버가능)
--RR부분이 0~49는 2000년대를 의미한다. 50-99사이라면 1900년대 것으로 돼있다.(21세기와 20세기를 구분하기 위한 것)
--비교하라는 형식대로 비교하면 쉽다.



SELECT first_name 이름
FROM employees 
WHERE last_name like 'A%';--이름이 a로 시작하는 사람 조회
--윈도우 *(all) ?(a) a*.hwp as ?.hwp  
--_가 들어가면 한글자만 의미하게 되고 %는 여러글자를 의미한다.

SELECT first_name 이름
FROM employees 
WHERE last_name like 'A___'; --A로 시작하고 뒤에 세글자의 이름을 가진 사원 출력

SELECT first_name 이름
FROM employees 
WHERE last_name like 'L__'; --이름이 L로 시작하는 사원의 성 출력

SELECT first_name||' '||last_name 이름
FROM employees 
WHERE hire_date like '%17'; --(RR/MM/DD 이기 때문에 앞에 %가 들어간다.)입사일 중 입사날짜가 17인 직원 출력  date자료형 에서도 문자열 처럼 검색 할 수 있다.

SELECT first_name||' '||last_name 이름
FROM employees 
WHERE hire_date like '___03___'; --입사일이 3월인 사원을 출력해라. 8월로 검색 해도 된다. (%/03/% 도 되고 ___03___ 도 된다.)

SELECT first_name||' '||last_name 이름, commission_pct 커미션
FROM employees 
WHERE commission_pct is not null; --커미션을 받는 직원의 이름, 커미션 출력

SELECT first_name||' '||last_name 이름, NVL(commission_pct,0) 커미션
FROM employees; --커미션이 없는 직원의 이름과 이 경우 커미션을 0으로 출력 
--nvl 함수 null(칼럼명 값) 첫번째 인자값이 널이 아니면 그대로 출력, 컬럼값이 널이면 두번째 인자를 출력

--직원중 매니져 id가 없는 사원을 출력

SELECT first_name||' '||last_name 이름, salary
FROM employees
ORDER BY salary ASC; --직원의 이름과 급여를 출력하되 급여를 기준으로 오름차순을 출력
--sort 정렬 
--1)key 기준
--2)차순(오름:ASC,내림:DESC) ASC는 생략 가능하다.

SELECT first_name||' '||last_name 이름, salary 급여
FROM employees 
WHERE employee_id=110
ORDER BY salary DESC; --직원의 이름,급여를 출력하여 급여 내림차순으로 출력 단 사원아이디가 110이하인 직원만
--WHERE의 위치는 항상 FROM 다음에 온다**

SELECT first_name||' '||last_name 이름, salary 급여, employee_id 사원아이디
FROM employees 
WHERE employee_id<=110
ORDER BY salary DESC, employee_id ASC; 
--직원의 이름. 급여. 사원아이디를 출력하되 급여 내림차순으로 출력 단, 만일 같은 급여이면 사원아이디 오름차순으로 출력 단, 사원아이디가 110이하인 직원에 한해
--

SELECT first_name||' '||last_name 이름, salary 급여, hire_date, commission_pct
FROM employees 
WHERE department_id in (30,50,80) and salary between 5000 and 17000 and hire_date like '04______' and commission_pct is not null 
ORDER BY hire_date ASC, salary DESC; 
--2004년대에 입사해서 30,50,80 번 부서에 속해있으면서
--급여를 5000이상, 17000이하를 받는 직원을 조회하라
--단, 커미션을 받지 않는 직원들은 겁색 대상에서 제외시키며,
-- 먼저 입사한 직원이 먼저 출력되어야 하며 입사일이 같은 경우 급여가 많은 직원이 먼저 출력되도록

SELECT first_name||' '||last_name 이름, salary 급여
FROM employees 
WHERE employee_id=110
ORDER BY salary DESC; 

--OREDER BY의 4가지 방식
--1) 칼럼명
-- order by 만만만만-----가능
--1)칼럼명2)alias3)순번4)계산식

--2) alias
select first_name 이름, employee_id 사번아이디, salary 급여
from employees
order by 급여 desc, 사번아이디 asc;

--3)순번
select first_name 이름, employee_id 사번아이디, salary 급여
from EMPLOYEES
order by 3 desc, 2 asc; --select절에서 1,2,3의 속성을 기준으로 정렬하는것을 줄여쓴 형태

--4)계산식
select first_name 이름,employee_id 사번아이디, salary*12 연봉
from EMPLOYEES
order by salary*12 desc, 2 asc; --속성에서 사용한 계산식 자체를 아예 칼럼명으로 적용시켜도 된다.


select first_name||' '||last_name 이름, salary*12 연봉
from EMPLOYEES
where salary*12>=120000
order by 연봉 desc; --salary*12 이 12000이상인 경우의 직원의 이름,연봉출력. 단, 연봉 내림차순 정렬

select first_name||' '||last_name 이름
from EMPLOYEES
where upper(last_name)='KING'; --lower()는 소문자로 변환 
--이름이 king인 사람 검색? 철자가 대소문자를 구별하지 않고 찾는방법 >> 전체를 대문자로 바꿔서 대문자로 물어본다.
--INITCAP('QUERY Course') >> Query Course : 각 단어의 첫 문자는 대문자, 난머지 문자는 소문자로 변환한다.

select *
from employees
where hire_date between '04/01/01' and '04/12/31'; --입사년도가 2004년인 직원 정보를 출력(1)
select *
from employees
where hire_date>='04/01/01' and hire_date<='04/12/31';--입사년도가 2004년인 직원 정보를 출력(2)

select first_name||' '||last_name 성명, salary 급여
from EMPLOYEES
where substr(hire_date,1,2)='04';--입사년도가 2004년인 직원 정보를 출력(3)
								--substring() 자바 형식
								--substr() sql 형식 substr('ondal',1,2)

select first_name||' '||last_name 성명, lpad(salary,10,'*') 급여
from EMPLOYEES; --직원의 이름과 급여를 출력. 단, 급여는 전체 10자리로 출력하되 남은 왼쪽 부분은 *으로 채우시오.
--lpad() : left padding 하여 채우는것
--rpad()
--ltrim() : trim은 빠지는것
--rtrim()    >>>>   이 조건은 특별히 SELECT 절에 들어간다.
--lpad(속성,공간확보,남는부분에 찍을 값)
--ltrim(문자열,삭제할 문자)  >> 삭제할 문자는 한글자한글자 취급된다.불일치 하는 문자가 등장하면 그때부터 출력.

select sysdate
from dual; --오늘날짜만 찍는다면 'sysdate'을 찍으면 된다.가상의 테이블 dual을 사용한다.(보통 쓸것 없을때 쓴다.)

select '방가방가'
from dual; --그냥 '방가방가'를 출력

select ROUND(36.754,1)
from dual;
--소수이하 소수이상  36.754를 반올림 하여 36.8이 나오도록 하시오 
--ROUND(숫자 OR 열 이름, 반올림 할 자리 값(까지))

select round(366,-2)
from dual; --자리값에 0~음수를 넣으면(에서) 정수부분을 조작할 수 있다.자리는 남아있되 해당하는 자릿값 이하는 0으로 바뀐다.

select round(438.765,0) --아니면 round(438.765)이라고 표기도 가능
from dual; --정수까지만 구해라.

select round(736.754,1)
from dual; --소수이하 양수 자리까지 구함

select round(736.754,2) 
from dual;

select round(736.754,-1) 
from dual; --소수이상 음수자리에서 버림

--truncate 
select trunc(736.954,1)
from dual; --버리는데 소수이하 양수자리까지 구함

select trunc(736.954,-1)
from dual; --버리는데 소수이하 양수자리까지 구함

select mod(76,10)
from dual; -- mod(숫자,나누는값)  : 나머지구하는 함수


select sysdate,sysdate+3
from dual; --날짜+숫자 => 날짜


select sysdate,sysdate-3
from dual; --날짜-날짜 => 숫자


select sysdate, add_months(sysdate,6)
from dual; --달을 건너뛰는 함수 add_month(날짜,더해질 달). 짧은달 까지 다 따져서 계산 해준다.

select sysdate,sysdate+180
from dual; --막연하게 한달을 30일로 취급하여 계산했을 경우 add_month()와 다른 결과가 나옴.

select round(sysdate,'year') --round() 두번째 인수에 'year'를 넣어 년도 까지 구하라는 의미. 그러므로 month에서 반올림한다.
from dual; --날짜의 반올림
--2019.03.26 => 03에서 반올림된다. => 01.01이 된다.

select round(sysdate,'mon') --round() 두번째 인수에 'mon'을 넣으면 날짜에서 반올림된다.
from dual; --'mon'에서의 반올림은 07부터 가능하다. 전체 달은 12개월이기 때문이다.

select round(sysdate,'day')
from dual; --round() 'day'는 16일 부터 반올림 가능하다. 2월은 28일까지밖에 없지만 그래도 동일하다.

select trunc(months_between(sysdate,hire_date)) 근무_개월수
from employees;
--오늘까지 근무한 개월 수 구하기
--trunc->truncation 정확히는 20.124개월 로 나올 수 있기 때문에 소수점 무시하는 함수 사용함.
--2019/03/26-2004/05/07 를 계산하면 근무한 일자 수가 나오게 된다. 명확하게 하기 위해 months_between(최근,과거) 로 개월수 출력

select trunc(months_between(sysdate,hire_date)/12)||'년' 근무년수
from employees;
--오늘까지 근무한 년수 구하기
--months_between() 한 다음 12개월로 나눠주면 년수가 출력

select first_name||' '||last_name 이름, salary*12 급여, trunc(months_between(sysdate,hire_date)/12)||'년' 근무년차
from employees
where trunc(months_between(sysdate,hire_date)/12)>=13
order by 근무년차;
--13년이상 근무한 직원의 이름. 입사일,급여,근무년차를 출력. 단, 근무년차 오름차순으로 출력 

--to_number(), to_date(), to_char() : 각각 숫자, 날짜, 문자로 구분.

select to_date('1998 02 13','yyyy mm dd') --'yyyy mm dd'미리 정해져있는 날짜 형식약속이다. 
from dual; --'1998 02 13' 문자열이 잇는데 이것은 'yyyy mm dd' 형식이니 이것에 맞게 날짜로 바꾸시오.
--mold 를 사용하는 것이 lpad, rpad이다.

select*
from nls_database_parameters; --8번에 보면 DD-MON-RR 형식으로 들어가 있다. 내부적으로는 미국기준이라는 것을 알 수 있음.


select to_char(sysdate, 'yyyy/mm/dd') --오늘 날짜를 4자리 년도로 표기하시오 
from dual; --날짜를 문자로 바꾸라는 의미이다. to_char()의 두번째 인자는 타입으로써 사용되고 있다.
--속에 들어가 있는 날짜 자체는 그대로 date형식 이지만 select로 인해 문자로서 출력될 뿐이다.

select to_char(12345678,'$9999,999,999')
from dual;
--1234567은 숫자인데 두번째 인자 틀에 맞게 문자로 바꾸시오
--9는 숫자랑 1:1대응, (컴마)는 컴마를 출력
--$는 유동형 -->대입:     $1,234,567    --> $는 줄이는 유동성은 보이지만 늘어나지는 않는다.

select first_name 이름, NVL(to_char(manager_id),'매니저 없음') 매니저아이디 
from employees;
-- NVL()는 first인자와 second인자의 type이 같아야 한다. 따라서 여기서 to_char()를 이용해 type을 맞춰준다.
--사원이름과 매니저 아이디를 출력하되 매니저아이디 없으면 '매니저 없음'을 으로 출력
--NVL()의 인자 type을 위해 모두 문자로 변환하거나 모두 숫자로 변환하여 사용할 수 있다.

--그룹함수
--sum() max() min() count() avg() --> DB가 가지고 있는 group function : N개의 입력->1개의 출력
select sum(salary) --사원들의 급여의 합을 구하시오.
from employees; --sum()의 활용

select trunc(avg(salary),4) --소숫점 4자리까지 평균을 구하시오
from employees; --평균을 구할때 알아서 null값들은 생략하고 구한다.

select trunc(avg(commission_pct),3) 
from employees; --commission_pct 의 평균을 소숫점3자리까지 표기

select count(salary) --급여 수를 이용하여 사원수를 알 수 있다.
from employees;

select count(manager_id)
from employees; --매니저 아이디를 이용한다면 사장 때문에 전체에서 1명 빠진채로 나옴

select count(*) from employees; --employees에 있는 전체 tuple수를 센다.

select sum(salary) 총_급여,max(salary) 최대급여, avg(salary) 급여평균, count(manager_id) 매니저가있는_직원수, count(distinct department_id) 부서수
from employees; --급여의 합. 최소, 최대 급여 출력. 급여평균, 직원수, 매니저있는 직원수, 직원 부서수 구하기
--부서수를 구할때 중복을 피하기 위해 distinct를 붙여준다.**

select NVL(to_char(department_id),'부서명 없음') 부서아이디,trunc(avg(salary),4) 부서별_급여_평균
from employees
group by department_id
order by 1; --1이기 때문에 select절에서 처음 입력한 부서명 순서로 정렬된다. 사실 현재 
--부서별 급여의 평균
--별, 유유상종, 끼리끼리 group by
--from>where(where와 group by는 바뀔 수 있다.)>group by>select>order by 순서로 처리된다. --to_char() 다음에 order by를 했기 때문에 정렬에 문제가 생긴다.
--from>where>select이 기본 처리순서

select first_name 이름, NVL(to_char(department_id),'부서명 없음') 부서아이디,trunc(avg(salary),4) 부서별_급여_평균
from employees
group by department_id,first_name --> 끼리끼리의 끼리끼리 가 된다. 
order by department_id; --> error occures!! 부서의 평균을 구했기 때문에 특정 사원의 이름을 찍을 수 없다..
--group by가 사용된 경우 이치에 맞는지 따지는 방법 : select문에서 group함수(sum(),max()..)를 제거했을때 남는 것이 group by에 있는지 확인


select NVL(to_char(department_id),'부서_없음') 부서명, NVL(to_char(manager_id),'매니저_없음') 매니저_아이디, trunc(avg(salary),4) 급여_평균
from employees
group by department_id,manager_id
order by department_id;
--부서별 매니저아이디별 평균급여 출력
--NVL함수 사용시 인자 type 일치 주의!!

select NVL(to_char(department_id),'부서_없음') 부서_아이디, min(salary) 최소급여 
from employees
where job_id not like 'AD%'
group by department_id
order by department_id;--job_id의 첫 두자가 AD가 아닌 직원에 대하여 부서별 최소급여를 구하시오(1)
select NVL(to_char(department_id),'부서_없음') 부서_아이디, min(salary) 최소급여 
from employees
where substr(job_id,1,2) <> 'AD' 
group by department_id
order by department_id;--job_id의 첫 두자가 AD가 아닌 직원에 대하여 부서별 최소급여를 구하시오(2)

--문법 순서 : select>from>where>group by>having>order by (where와 group by의 순서는 바뀔 수 있다.)
--실행 순서 : from>where>group by>having>select>order by 

select NVL(to_char(department_id),'부서아이디_없음') 부서_아이디, min(salary) 최소급여
from employees
where salary*12<=50000
group by department_id 
order by department_id; --연봉이 5천만 이하인 직원에 대하여 부서별 최소급여를 구하시오

select NVL(to_char(department_id),'부서아이디_없음') 부서_아이디, min(salary) 최소급여
from employees
where department_id>=30
group by department_id
having avg(salary)<=10000 
order by department_id; --부서아이디가 30이상인 직원에 대하여 부서별 최소급여를 구하시오. 단, 부서별 평균급여가 10000이하인 경우만 구한다.
--일반조건 >> where
--group조건(sum,avg,min..) >>  having 

select NVL(to_char(department_id),'부서아이디_없음') 부서_아이디,count(first_name) 명수, trunc(avg(salary),4) 평균급여
from employees
group by department_id
having count(first_name)>=20 
order by department_id;
--각 부서별 직원수 및 평균급여를 조회하되 직원수가 20명 이상인 부서만 출력되도록 하시오

--EQUI JOIN, SELF JOIN, OUTER JOIN, NON EQUI JOIN 

--pk와 fk가 같을때의 join =>  'EQUI JOIN'라고 한다.
select first_name||' '||last_name 이름,salary 급여, department_name 부서명
from employees, departments; 
--직원의 이름,급여의 부서명을 출력하시오
--from employees , departments 로 검색하면 N:M의 관계로 바뀐다.
--이 경우 cartesian product가 발생한다.
--join을 사용할때 1:1대응이 존재해야 한다.
--emp에 있는 부서id와 dep에 있는 부서id가 같을때 join이 된다.
select employees.first_name||' '||employees.last_name 이름,employees.salary 급여, departments.department_name 부서명
from employees,departments
where employees.department_id = departments.department_id;
--참조되는 칼럼들의 테이블 명 명시방법 => 테이블 명.칼럼명
--select,where문 동시에 테이블명.칼럼명 형식을 사용해야 함.

--별명쓰기
select E.first_name||' '||E.last_name 이름,E.salary 급여, D.department_name 부서명
from employees E,departments D --별명을 써서 줄이는 방법
where E.department_id = D.department_id;

select first_name||' '||last_name 이름,salary 급여, department_name 부서명
from employees natural join departments
where department_id = department_id;

--각 사원에 대한 매니저 이름을 출력하시오 (출력은 사원아이디, 사원이름, 매니저이름)
select e.employee_id 사원_아이디,e.first_name||' '||e.last_name 사원_이름,m.first_name 매니저_이름 
from employees e,employees m
where E.manager_id=M.employee_id; --SELF JOIN 이라고 한다.

--직원의 사번아이디 매니저아이디 매니저이름을 출력. 단, 관리자가 없는 직원 출력
select e.employee_id, m.manager_id,m.first_name
from employees e, employees m
where e.manager_id = m.employee_id(+); --현재 table에서 사장은 누락된다. manager가 없기때문
--그래서 where절에서 테이블이 짧은쪽에 (+)을 붙여준다.

--OUTER JOIN : EQUI JOIN에서 나오지 않는 것 까지 끄집어내는 방법(테이블이 한쪽이 짧은경우)
select e.employee_id, e.manager_id,m.first_name
from employees e, employees m
where e.manager_id(+) = m.employee_id;
--직원의 사번아이디 매니저아이디 매니저이름을 출력. 단, 사원이 없는 직원 출력
--(+)표시는 한쪽만 사용할 수 있음.
--anci1999

--NONE EQUI JOIN
CREATE TABLE SALGRADE 
( GRADE number(10) NOT NULL,
  LOSAL number(10),
  HISAL number(10),
  CONSTRAINT SALGRADE_PK PRIMARY KEY (GRADE)
);
INSERT INTO SALGRADE(GRADE, LOSAL, HISAL) VALUES (1, 700, 1999);
INSERT INTO SALGRADE(GRADE, LOSAL, HISAL) VALUES (2, 2000, 2499);
INSERT INTO SALGRADE(GRADE, LOSAL, HISAL) VALUES (3, 2500, 2999);
INSERT INTO SALGRADE(GRADE, LOSAL, HISAL) VALUES (4, 3000, 4999);
INSERT INTO SALGRADE(GRADE, LOSAL, HISAL) VALUES (5, 5000, 9999);
INSERT INTO SALGRADE(GRADE, LOSAL, HISAL) VALUES (6, 10000, 30000);
--번호대로 내부정렬되는 것은 아니다. 나중에 order by로 조작한다.
--LOSAL : low salary,  HISAL : high salary
--급여의 범위에 따라 급수를 알 수 있는 table이 생성됨

--NON EQUI JOIN
select e.first_name 이름 ,e.salary 급여,s.grade 급수
from employees e, salgrade s
where e.salary between s.losal and s.hisal;
--직원의 급여가 몇등급인지를 조회하시오


select e.first_name 이름 ,d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id(+)
order by 1;--outer join
--직원들의 이름과 근무 부서명을 출력하시오
--Kimberely를 포함하여 출력하기.
select e.first_name 이름 ,d.department_name 부서명
from employees e, departments d
where e.department_id(+) = d.department_id
order by 1;
--outer join
--직원들의 이름과 근무 부서명을 출력하시오
--단, 근무부서명이 없는 사람도 출력하시오

select e.first_name 이름 ,d.department_name 부서명
from employees e, departments d
where e.department_id(+) = d.department_id or e.department_id
order by 1;
--직원들의 이름과 근무 부서명을 출력하시오
--단, 인원이 없는 근무부서명도 출력하시오
--단, 근무부서명이 없는 직원도 출력하시오
--equi join, self join, outer join, non-equi join
--이들은 모두 오라클 고유의 조인명령
--MS : document.all
--w3c document.getElementById
--ansi 1999

select e.first_name 이름 ,d.department_name 부서명
from employees e 
full outer join departments d 
on e.department_id=d.department_id
order by 1;
--부서없는 킴벌리와 사원없는 부서명 동시에 나온다.
--full outer join 대신 lest outer join/right outer join을 사용할 수 있다.(+)와 반대로 적용됨
--크기가 작은 table을 앞에 놓고 join하면  시간이 단축된다.(sql 튜닝) 일치확인 작업을 앞에걸 기준으로 하기때문.

--3개 table을 join
--직원의 이름. 부서명, 해당 city를 출력하시오 단, city오름차순으로
select e.first_name,d.department_name,l.city
from employees e , departments d , locations l
where e.department_id=d.department_id and d.location_id=l.location_id
order by 3;

--각 도시에 속한 부서 이름 별로 2007년 이전에 입사한 직원들의 인원수를 조회하시오 -> 일반조건이기 때문에 having 쓰지 않는다.
-- 도시의 순으로 출력하고, 동일한 도시에 대해서는 인원수가 작은 순으로 출력
select count(*)
from employees e , departments d , locations l
where e.department_id=d.department_id 
and d.location_id=l.location_id 
and e.hire_date<'2007/01/01'
group by l.city, d.department_name
order by l.city asc, count(*) asc;

--업무명(job_title)에 'Sales'로 시작하는 직원 중에서 급여가 10000이상, 20000이하인
--직원들의 이름, 성과 연봉 및 직책을 출력
--단 급여가 많은 순으로 출력
select e.first_name||' '||e.last_name 이름,salary*12 연봉, j.job_title 직책
from employees e , jobs j
where e.job_id=j.job_id 
and j.job_title like 'Sales%' and e.salary between 10000 and 20000
order by e.salary desc;


--다니엘이 근무하는 부서(100번)의 평균급여 출력
select trunc(avg(salary),4) 평균급여
from employees
where department_id = 100;--daniel의 부서가 100번이라는 것을 알때
select trunc(avg(salary),4) 평균급여 --MAIN QUERY
from employees
where department_id = 
(select department_id 
from employees 
where lower(first_name)='daniel'); --SUBQUERY
--daniel의 부서를 검색하는 부분
--어떤것은 JOIN으로, 어떤 것은 SUBQUERY로 풀 수 있다.

--급여를 8200을 받는 직원의 부서아이디를 찾아 부서 아이디와 해당 부서명을 출력
--여러 tuple이 subquery에서 넘어오기때문에 주의
select department_id, department_name
from departments
where department_id in
(select department_id 
from employees 
where salary=8200);	--in 을 추가해야 '또는' 이라는 의미 포함.

--'IT'부서에서 근무하는 직원들의 이름, 급여, 입사일을 조회하시오
--join
select distinct e.first_name||' '||e.last_name,salary,e.hire_date, d.department_name
from employees e , departments d
where e.department_id=d.department_id --join할 때 필수 부분 주의 
and d.department_name like 'IT';
--subquery
select first_name||' '||last_name,salary,hire_date
from employees
where department_id in 
(select distinct department_id 
from departments 
where department_name like 'IT');

--각 부서별로 최저급여를 받는 직원의 이름과 부서아이디 급여를 조회하시오.
--단, 출력은 부서아이디 오름차순
select first_name||' '||last_name,department_id,salary
from employees
where (department_id,salary) in --넘기고 받을때 식별 가능한 기준값을 함께 묶어준다.
(select department_id,min(salary) 
from employees
group by department_id)
order by department_id asc; --pair wise error 발생에 주의

--java의 삼항연산자 => sql의 decode
--java의 if문         => case ~~~ when
select
--직책 뒷글자가 Manager인 경우 10% 급여 인상 아니면 50%인상
select e.first_name 이름, j.job_title 직책, e.salary 급여, decode(substr(job_title,-7),'Manager',salary*1.1,salary*1.5) 인상된급여
from employees e, jobs j
where e.job_id = j.job_id; --decode(찾을값,확인값,맞을시,아닐시)


-----------------삭제,수정,삽입------------------------
--====create
--create table 테이블명(
--변수명(='칼럼명') 데이터타입,);

--데이터타입
--고정길이: char 길이가 고정, 잡는속도는 빠름
--가변길이 : varchar2 길이가 변해, 잡는 속도가 덜 빠름. 길이에따라 자동으로 메모리를 적게쓴다.
--date 날짜  길이를 명시 할 수 없다. 내부적으로 RR/MM/DD로 정해져 있기 때문
--number 숫자 --> int   10진수 숫자 만큼 들어가는 자료형
--number(5,2) --> double형 : 전체 5자리를 잡아서 소수 2자리

create table bisang(
irum char(10),
tel varchar2(20),
nalja date default sysdate,
sabun number(5)
); --date default에 sysdate를 넣으면 오늘 날짜가 들어간다.

--describe : 테이블 컬럼명과 컬럼 타입을 조회
--desc bisang;
--테이블 삭제
--drop table bisang;

---테이블 만들기 실습--스키마(schema)
create table sunsoo(
name varchar2(20),
backno number(7),
position char(30),
dnal date default sysdate,
tayool number(5,2)
);

drop table 테이블명; --테이블 삭제

--자료삽입
insert into 테이블명
values(.........);--create의 자료순서로 입력해주어야 한다.

a.txt  ?a.txt

select* from tab; --지운table도 자료로 보인다. 때문에 살릴 수 있다.

truncate table 테이블명; --구조는 남고 내용만 사라진다.

create table sunsoo(
name varchar2(20),
backno number(7),
position char(30),
dnal date default sysdate,
tayool number(5,2)
);

insert into BISANG
values('조희정','010-4001-7881',null,12345);
insert into BISANG
values('김수현','010-2768-2354','16/09/27',12346); --조희정, 김수현에 대한 정보 입력
--tuple의 순서는 입력 순 대로 저장되는 것은 아니다.

insert into bisang(irum,tel,sabun)
values('정해용','010-2863-5072',59234); --본인이 넣을 속성 이름을 정해서 삽입하는 경우
--누락된 날짜는 오늘날짜가 삽입된다. : table생성시 초기값을 정해주었기 때문이다.
select* from bisang;

select irum 이름, to_char(nalja,'yyyy-mm-dd') 날짜
from bisang;--년도를 출력하는 형식을 정해주는 방법

--방금 친 내용이 입력된 상태에서 /를 치면 또 insert가 나오고 반복된다.

update bisang
set sabun=sabun+1000; --수정하기 UPDATE 테이블명 SET 수정; 모든 사번에 1000이 더해진다.

insert into bisang(irum,tel,kisoo)
values('김은순','010-2863-5072',56);

update emp
set salary=salary*1.1;

update bisang
set sabun=sabun+1000
where irum like '정%';

update bisang
set sabun = sabun+1000, irum='할담비'
where irum like '정%';

------------데이터 삭제

delete from BISANG
where irum='김은순';

--이클립스 상단의 Auto Commit
--DML _ (데이터 조작언어)
--insert 삽입, update 수정, delete 삭제 를 rollback으로 되돌릴 수 있다.
-- => buffer 에서 처리
--dml + commit
--	  + rollback;
--이클립스는 Auto Commit 설정돼있기 때문에 자동commit이 수행되고 database의 값이 실제로 바뀌는것
--insert를 수행하면 원래는 buffer에 입력된다. 출력으로 보이는 표는 기본적으로 buffer에 저장된 값
--rollback을 하면 이 buffer에 있는 것이 되돌아간다. 이를 사용하기 위해서는 이클립스 환경설정에서 바꾸면 됨.
--rollback 할때 이정표를 표시 해주어야 한다.

insert into SUNSOO (name,backno,position,tayool)
values ('장희수',4,'투수',1.34);

insert into sunsoo (name, backno, position, tayool)
values ('김민정',5,'포수',1.34);

update sunsoo
set tayool=1.34
where name like'장희수';

delete from sunsoo
where tayool=1.01;

---- sql+ 상에서 반복되는 insert 처리하기
insert into sunsoo (name, backno, position, tayool)
values (&name,5,'포수',1.34);
/ --상위 query가 반복되어 실행된다.







