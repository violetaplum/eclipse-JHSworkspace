select* from EMPLOYEES;
select* from DEPARTMENTS;
select* from COUNTRIES;
select* from EMP_DETAILS_VIEW;
select* from JOB_HISTORY; 
select* from JOBS; --��å
select* from LOCATIONS; 
select first_name, last_name from employees; --Ư�� Į�� ������ ��ȸ
SELECT first_name as �̸�, last_name as �� FROM employees;  --���� ������ֱ�
SELECT first_name �̸�, last_name �� FROM employees;	--���� ������ֱ�
SELECT first_name �̸� , last_name ��, salary �ϳ⿬�� FROM employees; --as�� �������־ �ȴ�

--���ڸ� �ٿ� ��� : ���̿� || �Է�
--'babo' || 'ondal'  --> baboondal �� ��µȴ�.
select first_name, last_name from employees;
select first_name ||'���� ������ '||salary||' ������ ���Դϴ�.' from employees;  --�̸��� ���� ���
select first_name ||' '|| last_name || ' ' || salary*12 from employees; --�̸�, ���� ���

select department_id , department_name from departments; --�μ�id�� �μ����� ���

SELECT*
FROM employees
WHERE salary>5000; --������ 5000 �̻��� ����� ���

SELECT*
FROM employees
WHERE salary = 2400; --������ 2400�� ����� ���

SELECT*
FROM employees
WHERE salary !=2400; --������ 2400�� �ƴ� ����� ���
SELECT*
FROM employees
WHERE salary <> 2400; --������ 2400�� �ƴ� ����� ���

SELECT first_name �̸�,hire_date �Ի���, department_id �μ���ȣ
FROM employees
WHERE employee_id = 103; --��� id�� 103�� ��� ���

SELECT first_name||' '||last_name �̸�,employee_id ���id, department_id �μ���ȣ 
FROM employees 
WHERE employee_id>=120 OR department_id=90  
AND SALARY<=8000;	--id�� 120�̻��̰ų�, �μ���ȣ�� 90�� ��� ���. �߰��� salary�� 8000������ ��� (and�� ����Ѵ�)

SELECT first_name||' '||last_name �̸�,employee_id ���id, department_id �μ���ȣ 
FROM employees 
WHERE (employee_id>=120 OR department_id=90)  
AND SALARY<=8000; --AND�� ���� ���� �� ���߿� OR�� ó���ȴ�. ()�� ����ϸ� OR�� ���� ó���ȴ�. ����� �޶�����.
					--����� '�߰���'�� ������ ����� ���.
					
desc employees; --sql+ tool ��ɾ� �̴�.     '--'�� dosâ���� �ּ����� �����Ѵ�.

SELECT DISTINCT department_id
FROM employees; --������̺��� �̿��Ͽ� ȸ���� �μ���ȣ�� �ߺ����� ��ȸ (distinct)

SELECT DISTINCT first_name||' '||last_name ����
FROM employees 
WHERE department_id=90 or department_id=50; --�μ���ȣ�� 90 or 50�� �μ��� �����(�̸��� �� �����Ͽ�) ���
SELECT DISTINCT first_name||' '||last_name ����
FROM employees 
WHERE department_id IN (90,50) --���� ��ɾ�� OR�� ������ ���� ���
--(����) SQL tuning : �ӵ��� ������ �ϴ� ��

SELECT salary �޿� 
FROM employees 
WHERE salary>=5000 and salary<=10000; --�޿��� 5000���� 10000���̿� �ִ� ������ �̸��� �޿��� ��� 
--(������ �Ǵ� salary�� �տ� �־�� �Ѵ�)
SELECT salary �޿� 
FROM employees 
WHERE salary between 5000 and 10000; -- ������ between-and���� (5000�� 10000 ����)

SELECT first_name||' '||last_name �̸�,salary �޿� 
FROM employees 
WHERE department_id is null; --���� �� �μ�id�� ���� ������ �̸��� �޿��� ���

SELECT first_name||' '||last_name �̸�,salary �޿� 
FROM employees 
WHERE department_id is not null; --���� �� �μ�id�� �ִ� ������ �̸��� �޿��� ���

SELECT first_name||' '||last_name �̸�,salary �޿�, department_id �μ�id 
FROM employees 
WHERE salary>=1500; --�޿��� 15000 �̻��� �������� �̸�, �޿� �μ�ID�� ��ȸ�Ͻÿ�.

SELECT first_name||' '||last_name �̸�,salary*12 ���� 
FROM employees 
WHERE (salary*12)>=170000; -- ������ �ش����Ǹ����ϴ� ������ 

SELECT first_name||' '||last_name �̸�,salary �޿�, hire_date �Ի���
FROM employees 
WHERE hire_date<'2004-01-01'; --��¥�˻� �Ҷ��� ����  '0000-00-00'�� �����ڷ� �񱳰˻�
--eclipse  2004-01-01  �� american���
--��04/01/01��(�����) �� �ѱ� ���
--���� 2004  3��1���� �Է��Ѵٰ� �Ѵٸ�  01-MAR-04(�Ͽ���) �̰��� ������ ���� ���� �̴�.
--RR/MM/DD : (1959~2049����� ��������)
--RR�κ��� 0~49�� 2000��븦 �ǹ��Ѵ�. 50-99���̶�� 1900��� ������ ���ִ�.(21����� 20���⸦ �����ϱ� ���� ��)
--���϶�� ���Ĵ�� ���ϸ� ����.



SELECT first_name �̸�
FROM employees 
WHERE last_name like 'A%';--�̸��� a�� �����ϴ� ��� ��ȸ
--������ *(all) ?(a) a*.hwp as ?.hwp  
--_�� ���� �ѱ��ڸ� �ǹ��ϰ� �ǰ� %�� �������ڸ� �ǹ��Ѵ�.

SELECT first_name �̸�
FROM employees 
WHERE last_name like 'A___'; --A�� �����ϰ� �ڿ� �������� �̸��� ���� ��� ���

SELECT first_name �̸�
FROM employees 
WHERE last_name like 'L__'; --�̸��� L�� �����ϴ� ����� �� ���

SELECT first_name||' '||last_name �̸�
FROM employees 
WHERE hire_date like '%17'; --(RR/MM/DD �̱� ������ �տ� %�� ����.)�Ի��� �� �Ի糯¥�� 17�� ���� ���  date�ڷ��� ������ ���ڿ� ó�� �˻� �� �� �ִ�.

SELECT first_name||' '||last_name �̸�
FROM employees 
WHERE hire_date like '___03___'; --�Ի����� 3���� ����� ����ض�. 8���� �˻� �ص� �ȴ�. (%/03/% �� �ǰ� ___03___ �� �ȴ�.)

SELECT first_name||' '||last_name �̸�, commission_pct Ŀ�̼�
FROM employees 
WHERE commission_pct is not null; --Ŀ�̼��� �޴� ������ �̸�, Ŀ�̼� ���

SELECT first_name||' '||last_name �̸�, NVL(commission_pct,0) Ŀ�̼�
FROM employees; --Ŀ�̼��� ���� ������ �̸��� �� ��� Ŀ�̼��� 0���� ��� 
--nvl �Լ� null(Į���� ��) ù��° ���ڰ��� ���� �ƴϸ� �״�� ���, �÷����� ���̸� �ι�° ���ڸ� ���

--������ �Ŵ��� id�� ���� ����� ���

SELECT first_name||' '||last_name �̸�, salary
FROM employees
ORDER BY salary ASC; --������ �̸��� �޿��� ����ϵ� �޿��� �������� ���������� ���
--sort ���� 
--1)key ����
--2)����(����:ASC,����:DESC) ASC�� ���� �����ϴ�.

SELECT first_name||' '||last_name �̸�, salary �޿�
FROM employees 
WHERE employee_id=110
ORDER BY salary DESC; --������ �̸�,�޿��� ����Ͽ� �޿� ������������ ��� �� ������̵� 110������ ������
--WHERE�� ��ġ�� �׻� FROM ������ �´�**

SELECT first_name||' '||last_name �̸�, salary �޿�, employee_id ������̵�
FROM employees 
WHERE employee_id<=110
ORDER BY salary DESC, employee_id ASC; 
--������ �̸�. �޿�. ������̵� ����ϵ� �޿� ������������ ��� ��, ���� ���� �޿��̸� ������̵� ������������ ��� ��, ������̵� 110������ ������ ����
--

SELECT first_name||' '||last_name �̸�, salary �޿�, hire_date, commission_pct
FROM employees 
WHERE department_id in (30,50,80) and salary between 5000 and 17000 and hire_date like '04______' and commission_pct is not null 
ORDER BY hire_date ASC, salary DESC; 
--2004��뿡 �Ի��ؼ� 30,50,80 �� �μ��� ���������鼭
--�޿��� 5000�̻�, 17000���ϸ� �޴� ������ ��ȸ�϶�
--��, Ŀ�̼��� ���� �ʴ� �������� �̻� ��󿡼� ���ܽ�Ű��,
-- ���� �Ի��� ������ ���� ��µǾ�� �ϸ� �Ի����� ���� ��� �޿��� ���� ������ ���� ��µǵ���

SELECT first_name||' '||last_name �̸�, salary �޿�
FROM employees 
WHERE employee_id=110
ORDER BY salary DESC; 

--OREDER BY�� 4���� ���
--1) Į����
-- order by ��������-----����
--1)Į����2)alias3)����4)����

--2) alias
select first_name �̸�, employee_id ������̵�, salary �޿�
from employees
order by �޿� desc, ������̵� asc;

--3)����
select first_name �̸�, employee_id ������̵�, salary �޿�
from EMPLOYEES
order by 3 desc, 2 asc; --select������ 1,2,3�� �Ӽ��� �������� �����ϴ°��� �ٿ��� ����

--4)����
select first_name �̸�,employee_id ������̵�, salary*12 ����
from EMPLOYEES
order by salary*12 desc, 2 asc; --�Ӽ����� ����� ���� ��ü�� �ƿ� Į�������� ������ѵ� �ȴ�.


select first_name||' '||last_name �̸�, salary*12 ����
from EMPLOYEES
where salary*12>=120000
order by ���� desc; --salary*12 �� 12000�̻��� ����� ������ �̸�,�������. ��, ���� �������� ����

select first_name||' '||last_name �̸�
from EMPLOYEES
where upper(last_name)='KING'; --lower()�� �ҹ��ڷ� ��ȯ 
--�̸��� king�� ��� �˻�? ö�ڰ� ��ҹ��ڸ� �������� �ʰ� ã�¹�� >> ��ü�� �빮�ڷ� �ٲ㼭 �빮�ڷ� �����.
--INITCAP('QUERY Course') >> Query Course : �� �ܾ��� ù ���ڴ� �빮��, ������ ���ڴ� �ҹ��ڷ� ��ȯ�Ѵ�.

select *
from employees
where hire_date between '04/01/01' and '04/12/31'; --�Ի�⵵�� 2004���� ���� ������ ���(1)
select *
from employees
where hire_date>='04/01/01' and hire_date<='04/12/31';--�Ի�⵵�� 2004���� ���� ������ ���(2)

select first_name||' '||last_name ����, salary �޿�
from EMPLOYEES
where substr(hire_date,1,2)='04';--�Ի�⵵�� 2004���� ���� ������ ���(3)
								--substring() �ڹ� ����
								--substr() sql ���� substr('ondal',1,2)

select first_name||' '||last_name ����, lpad(salary,10,'*') �޿�
from EMPLOYEES; --������ �̸��� �޿��� ���. ��, �޿��� ��ü 10�ڸ��� ����ϵ� ���� ���� �κ��� *���� ä��ÿ�.
--lpad() : left padding �Ͽ� ä��°�
--rpad()
--ltrim() : trim�� �����°�
--rtrim()    >>>>   �� ������ Ư���� SELECT ���� ����.
--lpad(�Ӽ�,����Ȯ��,���ºκп� ���� ��)
--ltrim(���ڿ�,������ ����)  >> ������ ���ڴ� �ѱ����ѱ��� ��޵ȴ�.����ġ �ϴ� ���ڰ� �����ϸ� �׶����� ���.

select sysdate
from dual; --���ó�¥�� ��´ٸ� 'sysdate'�� ������ �ȴ�.������ ���̺� dual�� ����Ѵ�.(���� ���� ������ ����.)

select '�氡�氡'
from dual; --�׳� '�氡�氡'�� ���

select ROUND(36.754,1)
from dual;
--�Ҽ����� �Ҽ��̻�  36.754�� �ݿø� �Ͽ� 36.8�� �������� �Ͻÿ� 
--ROUND(���� OR �� �̸�, �ݿø� �� �ڸ� ��(����))

select round(366,-2)
from dual; --�ڸ����� 0~������ ������(����) �����κ��� ������ �� �ִ�.�ڸ��� �����ֵ� �ش��ϴ� �ڸ��� ���ϴ� 0���� �ٲ��.

select round(438.765,0) --�ƴϸ� round(438.765)�̶�� ǥ�⵵ ����
from dual; --���������� ���ض�.

select round(736.754,1)
from dual; --�Ҽ����� ��� �ڸ����� ����

select round(736.754,2) 
from dual;

select round(736.754,-1) 
from dual; --�Ҽ��̻� �����ڸ����� ����

--truncate 
select trunc(736.954,1)
from dual; --�����µ� �Ҽ����� ����ڸ����� ����

select trunc(736.954,-1)
from dual; --�����µ� �Ҽ����� ����ڸ����� ����

select mod(76,10)
from dual; -- mod(����,�����°�)  : ���������ϴ� �Լ�


select sysdate,sysdate+3
from dual; --��¥+���� => ��¥


select sysdate,sysdate-3
from dual; --��¥-��¥ => ����


select sysdate, add_months(sysdate,6)
from dual; --���� �ǳʶٴ� �Լ� add_month(��¥,������ ��). ª���� ���� �� ������ ��� ���ش�.

select sysdate,sysdate+180
from dual; --�����ϰ� �Ѵ��� 30�Ϸ� ����Ͽ� ������� ��� add_month()�� �ٸ� ����� ����.

select round(sysdate,'year') --round() �ι�° �μ��� 'year'�� �־� �⵵ ���� ���϶�� �ǹ�. �׷��Ƿ� month���� �ݿø��Ѵ�.
from dual; --��¥�� �ݿø�
--2019.03.26 => 03���� �ݿø��ȴ�. => 01.01�� �ȴ�.

select round(sysdate,'mon') --round() �ι�° �μ��� 'mon'�� ������ ��¥���� �ݿø��ȴ�.
from dual; --'mon'������ �ݿø��� 07���� �����ϴ�. ��ü ���� 12�����̱� �����̴�.

select round(sysdate,'day')
from dual; --round() 'day'�� 16�� ���� �ݿø� �����ϴ�. 2���� 28�ϱ����ۿ� ������ �׷��� �����ϴ�.

select trunc(months_between(sysdate,hire_date)) �ٹ�_������
from employees;
--���ñ��� �ٹ��� ���� �� ���ϱ�
--trunc->truncation ��Ȯ���� 20.124���� �� ���� �� �ֱ� ������ �Ҽ��� �����ϴ� �Լ� �����.
--2019/03/26-2004/05/07 �� ����ϸ� �ٹ��� ���� ���� ������ �ȴ�. ��Ȯ�ϰ� �ϱ� ���� months_between(�ֱ�,����) �� ������ ���

select trunc(months_between(sysdate,hire_date)/12)||'��' �ٹ����
from employees;
--���ñ��� �ٹ��� ��� ���ϱ�
--months_between() �� ���� 12������ �����ָ� ����� ���

select first_name||' '||last_name �̸�, salary*12 �޿�, trunc(months_between(sysdate,hire_date)/12)||'��' �ٹ�����
from employees
where trunc(months_between(sysdate,hire_date)/12)>=13
order by �ٹ�����;
--13���̻� �ٹ��� ������ �̸�. �Ի���,�޿�,�ٹ������� ���. ��, �ٹ����� ������������ ��� 

--to_number(), to_date(), to_char() : ���� ����, ��¥, ���ڷ� ����.

select to_date('1998 02 13','yyyy mm dd') --'yyyy mm dd'�̸� �������ִ� ��¥ ���ľ���̴�. 
from dual; --'1998 02 13' ���ڿ��� �մµ� �̰��� 'yyyy mm dd' �����̴� �̰Ϳ� �°� ��¥�� �ٲٽÿ�.
--mold �� ����ϴ� ���� lpad, rpad�̴�.

select*
from nls_database_parameters; --8���� ���� DD-MON-RR �������� �� �ִ�. ���������δ� �̱������̶�� ���� �� �� ����.


select to_char(sysdate, 'yyyy/mm/dd') --���� ��¥�� 4�ڸ� �⵵�� ǥ���Ͻÿ� 
from dual; --��¥�� ���ڷ� �ٲٶ�� �ǹ��̴�. to_char()�� �ι�° ���ڴ� Ÿ�����ν� ���ǰ� �ִ�.
--�ӿ� �� �ִ� ��¥ ��ü�� �״�� date���� ������ select�� ���� ���ڷμ� ��µ� ���̴�.

select to_char(12345678,'$9999,999,999')
from dual;
--1234567�� �����ε� �ι�° ���� Ʋ�� �°� ���ڷ� �ٲٽÿ�
--9�� ���ڶ� 1:1����, (�ĸ�)�� �ĸ��� ���
--$�� ������ -->����:     $1,234,567    --> $�� ���̴� �������� �������� �þ���� �ʴ´�.

select first_name �̸�, NVL(to_char(manager_id),'�Ŵ��� ����') �Ŵ������̵� 
from employees;
-- NVL()�� first���ڿ� second������ type�� ���ƾ� �Ѵ�. ���� ���⼭ to_char()�� �̿��� type�� �����ش�.
--����̸��� �Ŵ��� ���̵� ����ϵ� �Ŵ������̵� ������ '�Ŵ��� ����'�� ���� ���
--NVL()�� ���� type�� ���� ��� ���ڷ� ��ȯ�ϰų� ��� ���ڷ� ��ȯ�Ͽ� ����� �� �ִ�.

--�׷��Լ�
--sum() max() min() count() avg() --> DB�� ������ �ִ� group function : N���� �Է�->1���� ���
select sum(salary) --������� �޿��� ���� ���Ͻÿ�.
from employees; --sum()�� Ȱ��

select trunc(avg(salary),4) --�Ҽ��� 4�ڸ����� ����� ���Ͻÿ�
from employees; --����� ���Ҷ� �˾Ƽ� null������ �����ϰ� ���Ѵ�.

select trunc(avg(commission_pct),3) 
from employees; --commission_pct �� ����� �Ҽ���3�ڸ����� ǥ��

select count(salary) --�޿� ���� �̿��Ͽ� ������� �� �� �ִ�.
from employees;

select count(manager_id)
from employees; --�Ŵ��� ���̵� �̿��Ѵٸ� ���� ������ ��ü���� 1�� ����ä�� ����

select count(*) from employees; --employees�� �ִ� ��ü tuple���� ����.

select sum(salary) ��_�޿�,max(salary) �ִ�޿�, avg(salary) �޿����, count(manager_id) �Ŵ������ִ�_������, count(distinct department_id) �μ���
from employees; --�޿��� ��. �ּ�, �ִ� �޿� ���. �޿����, ������, �Ŵ����ִ� ������, ���� �μ��� ���ϱ�
--�μ����� ���Ҷ� �ߺ��� ���ϱ� ���� distinct�� �ٿ��ش�.**

select NVL(to_char(department_id),'�μ��� ����') �μ����̵�,trunc(avg(salary),4) �μ���_�޿�_���
from employees
group by department_id
order by 1; --1�̱� ������ select������ ó�� �Է��� �μ��� ������ ���ĵȴ�. ��� ���� 
--�μ��� �޿��� ���
--��, ��������, �������� group by
--from>where(where�� group by�� �ٲ� �� �ִ�.)>group by>select>order by ������ ó���ȴ�. --to_char() ������ order by�� �߱� ������ ���Ŀ� ������ �����.
--from>where>select�� �⺻ ó������

select first_name �̸�, NVL(to_char(department_id),'�μ��� ����') �μ����̵�,trunc(avg(salary),4) �μ���_�޿�_���
from employees
group by department_id,first_name --> ���������� �������� �� �ȴ�. 
order by department_id; --> error occures!! �μ��� ����� ���߱� ������ Ư�� ����� �̸��� ���� �� ����..
--group by�� ���� ��� ��ġ�� �´��� ������ ��� : select������ group�Լ�(sum(),max()..)�� ���������� ���� ���� group by�� �ִ��� Ȯ��


select NVL(to_char(department_id),'�μ�_����') �μ���, NVL(to_char(manager_id),'�Ŵ���_����') �Ŵ���_���̵�, trunc(avg(salary),4) �޿�_���
from employees
group by department_id,manager_id
order by department_id;
--�μ��� �Ŵ������̵� ��ձ޿� ���
--NVL�Լ� ���� ���� type ��ġ ����!!

select NVL(to_char(department_id),'�μ�_����') �μ�_���̵�, min(salary) �ּұ޿� 
from employees
where job_id not like 'AD%'
group by department_id
order by department_id;--job_id�� ù ���ڰ� AD�� �ƴ� ������ ���Ͽ� �μ��� �ּұ޿��� ���Ͻÿ�(1)
select NVL(to_char(department_id),'�μ�_����') �μ�_���̵�, min(salary) �ּұ޿� 
from employees
where substr(job_id,1,2) <> 'AD' 
group by department_id
order by department_id;--job_id�� ù ���ڰ� AD�� �ƴ� ������ ���Ͽ� �μ��� �ּұ޿��� ���Ͻÿ�(2)

--���� ���� : select>from>where>group by>having>order by (where�� group by�� ������ �ٲ� �� �ִ�.)
--���� ���� : from>where>group by>having>select>order by 

select NVL(to_char(department_id),'�μ����̵�_����') �μ�_���̵�, min(salary) �ּұ޿�
from employees
where salary*12<=50000
group by department_id 
order by department_id; --������ 5õ�� ������ ������ ���Ͽ� �μ��� �ּұ޿��� ���Ͻÿ�

select NVL(to_char(department_id),'�μ����̵�_����') �μ�_���̵�, min(salary) �ּұ޿�
from employees
where department_id>=30
group by department_id
having avg(salary)<=10000 
order by department_id; --�μ����̵� 30�̻��� ������ ���Ͽ� �μ��� �ּұ޿��� ���Ͻÿ�. ��, �μ��� ��ձ޿��� 10000������ ��츸 ���Ѵ�.
--�Ϲ����� >> where
--group����(sum,avg,min..) >>  having 

select NVL(to_char(department_id),'�μ����̵�_����') �μ�_���̵�,count(first_name) ���, trunc(avg(salary),4) ��ձ޿�
from employees
group by department_id
having count(first_name)>=20 
order by department_id;
--�� �μ��� ������ �� ��ձ޿��� ��ȸ�ϵ� �������� 20�� �̻��� �μ��� ��µǵ��� �Ͻÿ�

--EQUI JOIN, SELF JOIN, OUTER JOIN, NON EQUI JOIN 

--pk�� fk�� �������� join =>  'EQUI JOIN'��� �Ѵ�.
select first_name||' '||last_name �̸�,salary �޿�, department_name �μ���
from employees, departments; 
--������ �̸�,�޿��� �μ����� ����Ͻÿ�
--from employees , departments �� �˻��ϸ� N:M�� ����� �ٲ��.
--�� ��� cartesian product�� �߻��Ѵ�.
--join�� ����Ҷ� 1:1������ �����ؾ� �Ѵ�.
--emp�� �ִ� �μ�id�� dep�� �ִ� �μ�id�� ������ join�� �ȴ�.
select employees.first_name||' '||employees.last_name �̸�,employees.salary �޿�, departments.department_name �μ���
from employees,departments
where employees.department_id = departments.department_id;
--�����Ǵ� Į������ ���̺� �� ��ù�� => ���̺� ��.Į����
--select,where�� ���ÿ� ���̺��.Į���� ������ ����ؾ� ��.

--������
select E.first_name||' '||E.last_name �̸�,E.salary �޿�, D.department_name �μ���
from employees E,departments D --������ �Ἥ ���̴� ���
where E.department_id = D.department_id;

select first_name||' '||last_name �̸�,salary �޿�, department_name �μ���
from employees natural join departments
where department_id = department_id;

--�� ����� ���� �Ŵ��� �̸��� ����Ͻÿ� (����� ������̵�, ����̸�, �Ŵ����̸�)
select e.employee_id ���_���̵�,e.first_name||' '||e.last_name ���_�̸�,m.first_name �Ŵ���_�̸� 
from employees e,employees m
where E.manager_id=M.employee_id; --SELF JOIN �̶�� �Ѵ�.

--������ ������̵� �Ŵ������̵� �Ŵ����̸��� ���. ��, �����ڰ� ���� ���� ���
select e.employee_id, m.manager_id,m.first_name
from employees e, employees m
where e.manager_id = m.employee_id(+); --���� table���� ������ �����ȴ�. manager�� ���⶧��
--�׷��� where������ ���̺��� ª���ʿ� (+)�� �ٿ��ش�.

--OUTER JOIN : EQUI JOIN���� ������ �ʴ� �� ���� ������� ���(���̺��� ������ ª�����)
select e.employee_id, e.manager_id,m.first_name
from employees e, employees m
where e.manager_id(+) = m.employee_id;
--������ ������̵� �Ŵ������̵� �Ŵ����̸��� ���. ��, ����� ���� ���� ���
--(+)ǥ�ô� ���ʸ� ����� �� ����.
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
--��ȣ��� �������ĵǴ� ���� �ƴϴ�. ���߿� order by�� �����Ѵ�.
--LOSAL : low salary,  HISAL : high salary
--�޿��� ������ ���� �޼��� �� �� �ִ� table�� ������

--NON EQUI JOIN
select e.first_name �̸� ,e.salary �޿�,s.grade �޼�
from employees e, salgrade s
where e.salary between s.losal and s.hisal;
--������ �޿��� ���������� ��ȸ�Ͻÿ�


select e.first_name �̸� ,d.department_name �μ���
from employees e, departments d
where e.department_id = d.department_id(+)
order by 1;--outer join
--�������� �̸��� �ٹ� �μ����� ����Ͻÿ�
--Kimberely�� �����Ͽ� ����ϱ�.
select e.first_name �̸� ,d.department_name �μ���
from employees e, departments d
where e.department_id(+) = d.department_id
order by 1;
--outer join
--�������� �̸��� �ٹ� �μ����� ����Ͻÿ�
--��, �ٹ��μ����� ���� ����� ����Ͻÿ�

select e.first_name �̸� ,d.department_name �μ���
from employees e, departments d
where e.department_id(+) = d.department_id or e.department_id
order by 1;
--�������� �̸��� �ٹ� �μ����� ����Ͻÿ�
--��, �ο��� ���� �ٹ��μ��� ����Ͻÿ�
--��, �ٹ��μ����� ���� ������ ����Ͻÿ�
--equi join, self join, outer join, non-equi join
--�̵��� ��� ����Ŭ ������ ���θ��
--MS : document.all
--w3c document.getElementById
--ansi 1999

select e.first_name �̸� ,d.department_name �μ���
from employees e 
full outer join departments d 
on e.department_id=d.department_id
order by 1;
--�μ����� Ŵ������ ������� �μ��� ���ÿ� ���´�.
--full outer join ��� lest outer join/right outer join�� ����� �� �ִ�.(+)�� �ݴ�� �����
--ũ�Ⱑ ���� table�� �տ� ���� join�ϸ�  �ð��� ����ȴ�.(sql Ʃ��) ��ġȮ�� �۾��� �տ��� �������� �ϱ⶧��.

--3�� table�� join
--������ �̸�. �μ���, �ش� city�� ����Ͻÿ� ��, city������������
select e.first_name,d.department_name,l.city
from employees e , departments d , locations l
where e.department_id=d.department_id and d.location_id=l.location_id
order by 3;

--�� ���ÿ� ���� �μ� �̸� ���� 2007�� ������ �Ի��� �������� �ο����� ��ȸ�Ͻÿ� -> �Ϲ������̱� ������ having ���� �ʴ´�.
-- ������ ������ ����ϰ�, ������ ���ÿ� ���ؼ��� �ο����� ���� ������ ���
select count(*)
from employees e , departments d , locations l
where e.department_id=d.department_id 
and d.location_id=l.location_id 
and e.hire_date<'2007/01/01'
group by l.city, d.department_name
order by l.city asc, count(*) asc;

--������(job_title)�� 'Sales'�� �����ϴ� ���� �߿��� �޿��� 10000�̻�, 20000������
--�������� �̸�, ���� ���� �� ��å�� ���
--�� �޿��� ���� ������ ���
select e.first_name||' '||e.last_name �̸�,salary*12 ����, j.job_title ��å
from employees e , jobs j
where e.job_id=j.job_id 
and j.job_title like 'Sales%' and e.salary between 10000 and 20000
order by e.salary desc;


--�ٴϿ��� �ٹ��ϴ� �μ�(100��)�� ��ձ޿� ���
select trunc(avg(salary),4) ��ձ޿�
from employees
where department_id = 100;--daniel�� �μ��� 100���̶�� ���� �˶�
select trunc(avg(salary),4) ��ձ޿� --MAIN QUERY
from employees
where department_id = 
(select department_id 
from employees 
where lower(first_name)='daniel'); --SUBQUERY
--daniel�� �μ��� �˻��ϴ� �κ�
--����� JOIN����, � ���� SUBQUERY�� Ǯ �� �ִ�.

--�޿��� 8200�� �޴� ������ �μ����̵� ã�� �μ� ���̵�� �ش� �μ����� ���
--���� tuple�� subquery���� �Ѿ���⶧���� ����
select department_id, department_name
from departments
where department_id in
(select department_id 
from employees 
where salary=8200);	--in �� �߰��ؾ� '�Ǵ�' �̶�� �ǹ� ����.

--'IT'�μ����� �ٹ��ϴ� �������� �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�
--join
select distinct e.first_name||' '||e.last_name,salary,e.hire_date, d.department_name
from employees e , departments d
where e.department_id=d.department_id --join�� �� �ʼ� �κ� ���� 
and d.department_name like 'IT';
--subquery
select first_name||' '||last_name,salary,hire_date
from employees
where department_id in 
(select distinct department_id 
from departments 
where department_name like 'IT');

--�� �μ����� �����޿��� �޴� ������ �̸��� �μ����̵� �޿��� ��ȸ�Ͻÿ�.
--��, ����� �μ����̵� ��������
select first_name||' '||last_name,department_id,salary
from employees
where (department_id,salary) in --�ѱ�� ������ �ĺ� ������ ���ذ��� �Բ� �����ش�.
(select department_id,min(salary) 
from employees
group by department_id)
order by department_id asc; --pair wise error �߻��� ����

--java�� ���׿����� => sql�� decode
--java�� if��         => case ~~~ when
select
--��å �ޱ��ڰ� Manager�� ��� 10% �޿� �λ� �ƴϸ� 50%�λ�
select e.first_name �̸�, j.job_title ��å, e.salary �޿�, decode(substr(job_title,-7),'Manager',salary*1.1,salary*1.5) �λ�ȱ޿�
from employees e, jobs j
where e.job_id = j.job_id; --decode(ã����,Ȯ�ΰ�,������,�ƴҽ�)


-----------------����,����,����------------------------
--====create
--create table ���̺��(
--������(='Į����') ������Ÿ��,);

--������Ÿ��
--��������: char ���̰� ����, ��¼ӵ��� ����
--�������� : varchar2 ���̰� ����, ��� �ӵ��� �� ����. ���̿����� �ڵ����� �޸𸮸� ���Ծ���.
--date ��¥  ���̸� ��� �� �� ����. ���������� RR/MM/DD�� ������ �ֱ� ����
--number ���� --> int   10���� ���� ��ŭ ���� �ڷ���
--number(5,2) --> double�� : ��ü 5�ڸ��� ��Ƽ� �Ҽ� 2�ڸ�

create table bisang(
irum char(10),
tel varchar2(20),
nalja date default sysdate,
sabun number(5)
); --date default�� sysdate�� ������ ���� ��¥�� ����.

--describe : ���̺� �÷���� �÷� Ÿ���� ��ȸ
--desc bisang;
--���̺� ����
--drop table bisang;

---���̺� ����� �ǽ�--��Ű��(schema)
create table sunsoo(
name varchar2(20),
backno number(7),
position char(30),
dnal date default sysdate,
tayool number(5,2)
);

drop table ���̺��; --���̺� ����

--�ڷ����
insert into ���̺��
values(.........);--create�� �ڷ������ �Է����־�� �Ѵ�.

a.txt  ?a.txt

select* from tab; --����table�� �ڷ�� ���δ�. ������ �츱 �� �ִ�.

truncate table ���̺��; --������ ���� ���븸 �������.

create table sunsoo(
name varchar2(20),
backno number(7),
position char(30),
dnal date default sysdate,
tayool number(5,2)
);

insert into BISANG
values('������','010-4001-7881',null,12345);
insert into BISANG
values('�����','010-2768-2354','16/09/27',12346); --������, ������� ���� ���� �Է�
--tuple�� ������ �Է� �� ��� ����Ǵ� ���� �ƴϴ�.

insert into bisang(irum,tel,sabun)
values('���ؿ�','010-2863-5072',59234); --������ ���� �Ӽ� �̸��� ���ؼ� �����ϴ� ���
--������ ��¥�� ���ó�¥�� ���Եȴ�. : table������ �ʱⰪ�� �����־��� �����̴�.
select* from bisang;

select irum �̸�, to_char(nalja,'yyyy-mm-dd') ��¥
from bisang;--�⵵�� ����ϴ� ������ �����ִ� ���

--��� ģ ������ �Էµ� ���¿��� /�� ġ�� �� insert�� ������ �ݺ��ȴ�.

update bisang
set sabun=sabun+1000; --�����ϱ� UPDATE ���̺�� SET ����; ��� ����� 1000�� ��������.

insert into bisang(irum,tel,kisoo)
values('������','010-2863-5072',56);

update emp
set salary=salary*1.1;

update bisang
set sabun=sabun+1000
where irum like '��%';

update bisang
set sabun = sabun+1000, irum='�Ҵ��'
where irum like '��%';

------------������ ����

delete from BISANG
where irum='������';

--��Ŭ���� ����� Auto Commit
--DML _ (������ ���۾��)
--insert ����, update ����, delete ���� �� rollback���� �ǵ��� �� �ִ�.
-- => buffer ���� ó��
--dml + commit
--	  + rollback;
--��Ŭ������ Auto Commit �������ֱ� ������ �ڵ�commit�� ����ǰ� database�� ���� ������ �ٲ�°�
--insert�� �����ϸ� ������ buffer�� �Էµȴ�. ������� ���̴� ǥ�� �⺻������ buffer�� ����� ��
--rollback�� �ϸ� �� buffer�� �ִ� ���� �ǵ��ư���. �̸� ����ϱ� ���ؼ��� ��Ŭ���� ȯ�漳������ �ٲٸ� ��.
--rollback �Ҷ� ����ǥ�� ǥ�� ���־�� �Ѵ�.

insert into SUNSOO (name,backno,position,tayool)
values ('�����',4,'����',1.34);

insert into sunsoo (name, backno, position, tayool)
values ('�����',5,'����',1.34);

update sunsoo
set tayool=1.34
where name like'�����';

delete from sunsoo
where tayool=1.01;

---- sql+ �󿡼� �ݺ��Ǵ� insert ó���ϱ�
insert into sunsoo (name, backno, position, tayool)
values (&name,5,'����',1.34);
/ --���� query�� �ݺ��Ǿ� ����ȴ�.







