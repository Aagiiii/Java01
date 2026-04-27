
-- foreign key constraint

-- departments table
CREATE TABLE departments (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    location VARCHAR(100)
);

INSERT INTO departments VALUES
(1, 'IT', 'Building A'),
(2, 'HR', 'Building B'),
(3, 'Finance', 'Building A'),
(4, 'Marketing', 'Building C'),
(5, 'Research', 'Building D');

-- employees table
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department_id INT,
    salary DECIMAL(10,2),
    hire_date DATE
);

INSERT INTO employees VALUES
(1, 'Alice Smith', 1, 75000, '2020-01-15'),
(2, 'Bob Johnson', 2, 55000, '2019-03-20'),
(3, 'Charlie Brown', 1, 80000, '2018-07-10'),
(4, 'Diana Wilson', 3, 65000, '2021-02-01'),
(5, 'Eve Davis', 1, 70000, '2020-06-15'),
(6, 'Frank Miller', 2, 50000, '2022-01-10'),
(7, 'Grace Lee', 3, 72000, '2019-11-20'),
(8, 'Henry Taylor', NULL, 85000, '2017-04-05');  -- department_id null



select * from departments;

select * from departments where location = 'Building A';

select * from employees e ;

select * from employees e where department_id = 1  or department_id =3;


select * from employees e where department_id is null;

-- unstructured table 

create table messy_sales(
order_id serial primary key,
customer_name text,
customer_email text,
product_name text,
product_price decimal,
order_date DATE
);

insert into messy_sales (customer_name, customer_email, product_name, product_price, order_date)
values
('Bat', 'bat@gmail.com', 'laptop', 1200.00, '2026-04-20'),
('Bat', 'bat@gmail.com', 'mouse', 25.00, '2026-04-20'),
('Bat', 'bat@gmail.com', 'keyboard', 75.00, '2026-04-20');

select * from messy_sales ms ;

-- 

create table customers( 
customer_id serial primary key,
customer_name text not null,
customer_email text unique not null
);

create table products( 
product_id serial primary key,
product_name text not null,
price decimal not null
);

create table orders( 
order_id serial primary key,
customer_id int ,
product_id int ,
order_date Date default current_date,

constraint fk_customer 
foreign key (customer_id)  references customers(customer_id),
constraint fk_products
	foreign key(product_id) references products(product_id)
);



select * from customers c ;
select * from products p ;
select * from orders;

insert into customers (customer_name, customer_email)
values 
('Bat', 'bat@gmail.com');


insert into products (product_name, price)
values 
('laptop', 1200.00),
('mouse', 25.00),
('keyboard', 200.00);


insert into orders(customer_id, product_id, order_date)
values 
(1,1,'2026-04-20'),
(1,2,'2026-04-20'),
(1,3,'2026-04-20');




select * from country;
select * from country where country ='Afganistan';

select * from city;
select * from city where country_id = 1;


-- JOIN

select * from city 
join country 
on city.country_id = country.country_id ;

select city.city_id, city.city, country.country
from city 
join country 
on city.country_id = country.country_id where country ='China' ;

select f.title, l."name" from film f
join "language" l on f.language_id = l.language_id ;


select
	a.first_name,
	a.last_name,
	f2.title
from
	actor a
join film_actor f on
	a.actor_id = f.actor_id
join film f2 on
	f2.film_id = f.film_id
where
	f2.title = 'Academy Dinosaur';


select
	c.last_name || ' ' ||  c.first_name as full_name,
	a.address ,
	c2.city
from
	customer c
join address a on
	c.address_id = a.address_id
join city c2 on
	c2.city_id = a.city_id;

SELECT
    e.name AS employee_name,
    d.name AS department_name
FROM employees e
left JOIN departments d ON e.department_id = d.id;

SELECT
    e.name AS employee_name,
    d.name AS department_name
FROM employees e
right JOIN departments d ON e.department_id = d.id;

--inner join

SELECT
    e.name AS employee_name,
    d.name AS department_name
FROM employees e
INNER JOIN departments d ON e.department_id = d.id;


-- group by clause

select count(*), d."name" from departments d 
join employees e on d.id = e.department_id where d."name" ='IT'
group by d."name";

select d."name" ,count(e.id) as "num of emp" from departments d 
left join employees e on d.id  = e.department_id 
group by d."name" 
order by count(e.id) desc;

-- 1. **INNER JOIN:**
   
-- Employee + Department нэр авах

select e."name" , d."name"  from employees e 
inner join departments d 
on e.department_id = d.id;


--IT department-ийн ажилтнууд
select e."name" , d."name"  from employees e 
inner join departments d 
on e.department_id = d.id where d."name" ='IT';

--Цалин 60000+ ажилтнууд + department
select e."name" , d."name"  from employees e 
inner join departments d 
on e.department_id = d.id where e.salary >=60000;


-- Бүх ажилтан (department байхгүй ч)

select e.name
from employees e 
left join departments d 
on e.department_id = d.id;


-- Department-гүй ажилтнууд олох
select e.name
from employees e 
left join departments d 
on e.department_id = d.id where d.name is null;


-- RIGHT JOIN:
-- Бүх department (ажилтангүй ч)
select e.name
from employees e 
right join departments d 
on e.department_id = d.id;


--Ажилтангүй department олох

select e.name, d."name"
from employees e 
right join departments d 
on e.department_id = d.id where e.name is null;


-- 1. INNER JOIN syntax
SELECT e.name, d.name AS department
FROM employees e
inner join departments d on e.department_id = d.id;

-- 2. LEFT JOIN - бүх ажилтнуудыг авах
SELECT e.name, d.name AS department
FROM employees e
left join departments d ON e.department_id = d.id;

-- 3. Department-гүй ажилтан олох
SELECT e.name
FROM employees e
LEFT JOIN departments d ON e.department_id = d.id
WHERE d.id is null;

-- 4. Ажилтангүй department олох
SELECT d.name
FROM employees e
right JOIN departments d ON e.department_id = d.id
WHERE e.id IS NULL;

-- 5. Table alias ашиглах
select e.name AS employee, d.name AS department
FROM employees e
INNER JOIN departments d ON e.department_id = d.id;












