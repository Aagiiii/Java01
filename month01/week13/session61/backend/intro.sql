-- Create new database

create database db_intro;

-- create table and data types

create table employee(
	id INTEGER,
	name VARCHAR(150),
	department VARCHAR(10),
	salary integer
);


--`EX

create table student(
	id integer,
	firstname varchar(150),
	surname varchar(150),
	class varchar(50)
);


-- employee table data oruulya

insert
	into
	employee(id, name, department, salary)
values(1, 'Alice', 'IT', 75000),
 (2,
'Bob',
'HR',
55000),
(3,
'Charlie',
'IT',
80000);

insert into student(id,firstname, surname, class)
values(1, 'Aagii', 'AS', 'IT'), (2, 'Bat', 'Bold', 'PM'), (3, 'Oyu', 'Erdene', 'BA');

-- show data
select * from employee;

select * from employee limit 1;  -- only one row


-- select columns

select id, name from employee;

-- select with column alias name

select id as employee_nr, name as employee_name from employee;

-- select data with condition

select * from employee where department = 'HR';


-- select id, 

select id, name, salary from employee where salary > 70000;






-- exercise

create table products(
	id integer,
	name varchar(150),
	price decimal,
	stock integer,
	category varchar(150)
);


insert
	into
	products (id,
	name,
	price,
	stock,
	category)
values(1, 'laptop', 999.99, 50, 'Electronics'),
(2, 'mouse', 29.99, 200, 'Electronics'),
(3, 'desk chair', 199.99, 30, 'Furniture'),
(4, 'keyboard', 79.99, 150, 'Electronics'),
(5, 'monitor', 349.99, 75, 'Electronics');

-- Homework 1: products хүснэгтээс бүх өгөгдөл авах

select * from products;
-- Homework 2: Зөвхөн name, price баганыг авах

select name, price from products;

-- Homework 3: 10% татвартай үнэ тооцоолох (price_with_tax)

select name, price, price*1.1 as price_with_tax from products ;

-- Homework 4: Unique category-үүдийг авах

select distinct category from products;



-- 1.3 Жилийн цалинг тооцоолох (salary * 12) AS annual_salary
select name, salary, salary*12 as annual_salary from employee ;


-- 2.1 Unique department-үүд авах

select distinct department from employee;

-- 2.2 Хэдэн өөр department байгааг тоолох
select count (distinct department) from employee;

-- 2.3 name-ийг "Employee Name", salary-г "Monthly Pay" гэсэн нэртэй харуулах

select name as employee_name , salary as monthly_pay from employee e ;