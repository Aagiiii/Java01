

select * from employees e where department = 'IT' and salary > 70000;

-- OR
SELECT * FROM employees
WHERE department = 'IT' OR department = 'HR';


-- Combined (хаалт чухал!)
SELECT * FROM employees
WHERE (department = 'IT' OR department = 'HR')
  AND salary > 60000;

-- Хоосон зайг нөхнө үү

-- 1. IT department, 70000+ цалинтай
SELECT * FROM employees
WHERE department = 'IT' and salary > 70000;

-- 2. IT эсвэл HR department
SELECT * FROM employees
WHERE department = 'IT' or department = 'HR';

-- 3. IT эсвэл HR, 60000+ цалинтай (хаалт хэрэгтэй!)
SELECT * FROM employees
WHERE (department = 'IT' OR department = 'HR')
  AND salary > 60000;


-- Хоосон зайг нөхнө үү

-- 1. Нэр 'B'-ээр эхэлсэн ажилтнууд
SELECT * FROM employees WHERE name  like 'B%';

-- 2. IT, HR, Finance department-ийн ажилтнууд
SELECT * FROM employees
WHERE department in ('IT', 'HR', 'Finance');

-- 3. Цалин 60000-75000 хооронд
SELECT * FROM employees
WHERE salary between 60000 and 75000;



-- Хоосон зайг нөхнө үү

-- 1. Цалингаар буурах дарааллаар
SELECT * FROM employees ORDER BY salary desc;

-- 2. Хамгийн өндөр цалинтай 5 ажилтан
SELECT * FROM employees ORDER BY salary DESC limit 5;

-- 3. 6-10 дахь ажилтан (pagination)
SELECT * FROM employees LIMIT 5 offset 5;


-- Хоосон зайг нөхнө үү

-- 1. Нийт ажилтны тоо
SELECT count(*) FROM employees;

-- 2. Нийт цалингийн сан
SELECT sum(salary) FROM employees;

-- 3. Дундаж цалин (2 орон)
SELECT round(AVG(salary), 2) AS avg_salary FROM employees;

-- 4. IT department-ийн статистик
SELECT
    count(*) AS it_count,
    sum(salary) AS it_total,
    ROUND(avg(salary), 2) AS it_avg
FROM employees
WHERE department = 'IT';