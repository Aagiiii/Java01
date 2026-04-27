

select count(*) from film;
select count(*) from customer;
select count(*) from rental;

SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
ORDER BY table_name;

-- CREATE
create table students( 
id serial primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
email varchar(100) unique not null,
birth_date date,
enrollment_date date default current_date,
created_at timestamp default current_timestamp
);

create table courses(
id serial primary key,
code varchar(10) unique not null,
name varchar(100) not null,
credits int check (credits > 0 and credits <=6),
instructor varchar(100)
);

create table grades(
id serial primary key,
student_id int references students(id) on delete cascade,
course_id int references courses(id) on delete cascade,
grade decimal(3,2) check (grade >=0 and grade <=4),
semester varchar(20),
grade_date date default current_date,
unique(student_id, course_id, semester)
);

INSERT INTO students (first_name, last_name, email, birth_date)
VALUES ('Батбаяр', 'Дорж', 'batbayar@email.com', '2000-05-15');

INSERT INTO courses (code, name, credits, instructor) VALUES
('CS101', 'Introduction to Programming', 3, 'Prof. Bat'),
('CS201', 'Data Structures', 4, 'Prof. Dulam'),
('CS301', 'Database Systems', 3, 'Prof. Bold');

INSERT INTO students (first_name, last_name, email)
VALUES ('Сарангэрэл', 'Ганбат', 'sarangerel@email.com')
RETURNING id, first_name, last_name;

update students s 
set email = 'batbayar.new@gmail.com'
where id =1;

UPDATE students
SET
    first_name = 'Батбаатар',
    last_name = 'Ганбат'
WHERE id = 1;

UPDATE courses
SET credits = 4
WHERE code = 'CS101';

UPDATE students
SET email = 'updated@email.com'
WHERE id = 1
RETURNING *;

DELETE FROM students WHERE id = 5;
DELETE FROM grades WHERE grade < 1.0;
DELETE FROM students;  -- Deletes ALL rows!
TRUNCATE TABLE students RESTART IDENTITY CASCADE;

-- 1. Auto-increment primary key

-- 2. Foreign key with cascade delete
CREATE TABLE grades (
    id SERIAL PRIMARY KEY,
    student_id INT references students(id) ON DELETE cascade,
    grade DECIMAL(3,2)
);

-- 3. Check constraint
CREATE TABLE courses (
    credits INT check (credits > 0 AND credits <= 6)
);

-- 4. INSERT with RETURNING
INSERT INTO students (first_name, last_name, email)
VALUES ('Батбаяр', 'Дорж', 'bat@email.com')
returning id;

-- 5. Safe update (with WHERE clause)
UPDATE students
SET email = 'new@email.com'
where id = 1;

-- Category тус бүрийн нийт rental тоо, дундаж rental_rate:

select * from category c ;
select * from film_category fc ;
select * from film f ;
select * from inventory i ;
select * from rental;



select rating, count(*) as total_films, round(avg(rental_rate),2) as avg_rate 
from film f 
group by rating 
order by total_films desc;

-- film table-аас хамгийн урт 10 кино-г гаргаарай. title, length, rating баганатай байх ёстой.
select title, length, rating
from film f 
order by length desc limit 10;

-- Rental rate нь 0.99 бөгөөд rating нь G эсвэл PG байгаа кинонуудыг title-аар эрэмбэлж гаргаарай.
select title, rental_rate , rating
from film f 
where rental_rate = 0.99 and (rating ='G' or rating = 'PG')
order by title limit 10;

-- special_features багананд 'Behind the Scenes' агуулсан кинонуудын тоо хэд вэ? (Hint: LIKE ашиглана)

select count(*)
from film f 
where special_features LIKE '%Behind the Scenes%';

SELECT COUNT(*)
FROM film 
WHERE special_features LIKE 'Behind the Scenes%';

-- Last name нь 'S' үсгээр эхэлдэг customers-ийн first_name, last_name, email-ийг last_name эрэмбэлж гаргаарай.

select first_name, last_name, email
from customer c 
where last_name like 'S%';

SELECT rating, COUNT(*) AS total, AVG(rental_rate) AS avg_rate
FROM film
GROUP BY rating
ORDER BY total desc;

-- Category тус бүрийн нийт rental тоо, дундаж rental_rate:

select * from category c ;
select * from film_category fc ;
select * from film f ;
select * from inventory i ;
select * from rental;


select c.name, count(*) as total_rentals, round(avg(rental_rate ),2) as avg_rate
from film f 
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
group by c.name;

-- Rating тус бүрийн хамгийн өндөр rental_rate-тай кино:

select distinct on(rating) rating, title, rental_rate
from film f
order by rating,rental_rate desc;

-- B1. Rental хийгдсэн боловч буцааж өгөөгүй (return_date IS NULL) кинонуудын жагсаалтыг гаргаарай. Customer нэр, кино нэр, rental огноо харуул.

select c.first_name, f.title , r.rental_date 
from film f 
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
join customer c on c.customer_id = r.customer_id
where return_date is null;

-- B2. Жүжигчид (actor) тус бүрийн оролцсон кинонуудын дундаж rental_rate хэд вэ? Хамгийн өндөр дундаж rental_rate-тай 5 жүжигчийг гаргаарай.

select a.first_name , round(avg(f.rental_rate),2) as avg_rate
from film f
join film_actor fa  on f.film_id = fa.actor_id
join actor a on fa.actor_id = a.actor_id
group by a.first_name 
order by avg_rate desc limit 5

-- Store 1 болон Store 2-т хоёуланд нь байдаг (inventory-д) кинонуудыг гаргаарай. title харуул, давхардалгүй.

select title
from film f
inner join inventory i on f.film_id = i.film_id where i.store_id =1
inner join inventory i2 on f.film_id = i2.film_id where i.store_id =2;


-- B4. 2005 оны rental бүртгэлүүдийг сар тус бүр нийлүүлж хэдэн rental хийгдсэнийг гаргаарай. Сараар эрэмбэлэх.




