
/* Drop Tables */

DROP TABLE TelTable CASCADE CONSTRAINTS;
DROP TABLE DeptTable CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE DeptTable
(
	dept_id number(5,0) NOT NULL,
	dept_name varchar2(0) NOT NULL UNIQUE,
	PRIMARY KEY (dept_id)
);


CREATE TABLE TelTable
(
	id number(5,0) NOT NULL,
	tel varchar2(20),
	address char(50),
	hire_date date,
	dept_id number(5,0) NOT NULL,
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE TelTable
	ADD FOREIGN KEY (dept_id)
	REFERENCES DeptTable (dept_id)
;



