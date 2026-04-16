
create database week13_day02;

-- employees table
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DECIMAL(10,2),
    hire_date DATE,
    email VARCHAR(100)
);

INSERT INTO employees VALUES
(1, 'Alice Smith', 'IT', 75000, '2020-01-15', 'alice@company.com'),
(2, 'Bob Johnson', 'HR', 55000, '2019-03-20', 'bob@company.com'),
(3, 'Charlie Brown', 'IT', 80000, '2018-07-10', 'charlie@company.com'),
(4, 'Diana Wilson', 'Finance', 65000, '2021-02-01', 'diana@company.com'),
(5, 'Eve Davis', 'IT', 70000, '2020-06-15', 'eve@company.com'),
(6, 'Frank Miller', 'HR', 50000, '2022-01-10', 'frank@company.com'),
(7, 'Grace Lee', 'Finance', 72000, '2019-11-20', 'grace@company.com'),
(8, 'Henry Taylor', 'IT', 85000, '2017-04-05', 'henry@company.com');

-- products table
CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2),
    stock INT
);

INSERT INTO products VALUES
(1, 'Laptop', 'Electronics', 1299.99, 50),
(2, 'Mouse', 'Electronics', 29.99, 200),
(3, 'Keyboard', 'Electronics', 79.99, 150),
(4, 'Desk Chair', 'Furniture', 299.99, 30),
(5, 'Monitor', 'Electronics', 399.99, 75),
(6, 'Desk', 'Furniture', 499.99, 20),
(7, 'Headphones', 'Electronics', 149.99, 100),
(8, 'Webcam', 'Electronics', 89.99, 80);

-- 1.1 employees хүснэгтийн бүх өгөгдөл
-- Таны query энд:

select * from employees;

-- 1.2 products хүснэгтийн бүх өгөгдөл
-- Таны query энд:
select * from products p ;

-- 1.3 employees-ийн name, department баганууд
-- Таны query энд:
 select name, department from employees e ;

-- 1.4 products-ийн name, price, stock баганууд
-- Таны query энд:

select name, price, stock from products p ;

-- 2.1 Ажилтны нэр, цалин, email
-- Таны query энд:

select name, salary, email from employees e ;

-- 2.2 Бүтээгдэхүүний нэр, категори, үнэ
-- Таны query энд:
select name, category, price from products p ;

-- 2.3 Ажилтны нэр, хэлтэс, ажилд орсон огноо
-- Таны query энд:

select name, department, hire_date from employees e ;

-- 3.1 Ажилтны нэр, цалин, жилийн цалин (salary * 12)
-- Жилийн цалинг annual_salary гэж нэрлэх
-- Таны query энд:

select name, salary, salary*12 as annual_salary from employees e ;

-- 3.2 Бүтээгдэхүүний нэр, үнэ, 10% хөнгөлөлттэй үнэ
-- Хөнгөлөлттэй үнэ = price * 0.9, discounted_price гэж нэрлэх
-- Таны query энд:

select name, price, price*0.9 as discounted_price from products p ;

-- 3.3 Бүтээгдэхүүний нэр, stock, нийт үнэ (stock * price)
-- total_value гэж нэрлэх
-- Таны query энд:
select name, stock, stock*price as total_value from products p ;

-- 3.4 Ажилтны нэр, цалин, 15% татварын дараах цалин
-- after_tax гэж нэрлэх
-- Таны query энд:
select name, salary, salary *0.85 as after_tax from employees e ;


-- Хоосон зайг нөхнө үү

-- 1. Жилийн цалинг тооцоолох
SELECT name, salary, salary *12 AS annual_salary FROM employees;

-- 2. 20% хөнгөлөлт (80%-г авах)
SELECT name, price, price*0.8 AS discounted_price FROM products;

-- 3. 10% татвар хасах
SELECT name, salary, salary*0.9 AS after_tax FROM employees;

-- 4.1 Unique department-үүд
-- Таны query энд:

select distinct department from employees e ;

-- 4.2 Unique category-үүд
-- Таны query энд:

select distinct category from products p ;
-- 4.3 Хэдэн өөр department байна (COUNT DISTINCT)
-- Таны query энд:
select count (distinct department) from employees e ;

-- 4.4 Хэдэн өөр category байна
-- Таны query энд:
select count(distinct category) from products p ;

-- 5.1 name -> "Employee Name", salary -> "Monthly Salary"
-- Таны query энд:

select name as "Employee Name", salary as "Monthly Salary" from employees e ;
-- 5.2 name -> "Product", price -> "Price ($)", stock -> "In Stock"
-- Таны query энд:
select name as "Product", price as "Price ($)", stock as "In Stock" from products p ;

-- 5.3 Бүтээгдэхүүний нэр, "Inventory Value" (stock * price)
-- Таны query энд:

select name, stock*price as "Inventory Value" from products p ;


-- Хоосон зайг нөхнө үү

-- 1. Давхардалгүй department
select distinct  department FROM employees;

-- 2. Хэдэн өөр category байгааг тоолох
SELECT count (distinct category) FROM products;

-- 3. name баганыг "Full Name" гэж нэрлэх
SELECT name as "Full Name" FROM employees;
