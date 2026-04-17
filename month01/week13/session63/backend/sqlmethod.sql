-- create new table 

create table animal(
id int,
animal_name varchar(255),
race varchar(255)
);


insert into animal(id, animal_name, race)
values(1, 'Horse', 'Mammal'),
(1, 'Whale', 'Mammal');

select * from animal a ;

select * from animal where id =1;


-- Database Constraint 
-- primary key

create table students(
id int primary key,
first_name varchar(255)
);

insert into students (id, first_name)
values  (1, 'Bat'), (2, 'Bold');

select * from students s ;

select * from students  where id =2;


-- auto increment 


create table teachers(
	id serial primary key,
	first_name varchar(255)
);

insert into teachers(first_name)
values('Bat'), ('Bold');

select * from teachers;


--- examples with dvd rental 

select * from actor;

-- actor deers 

select * from actor where last_name = 'Temple';

select * from actor where actor_id = 190;

-- actor -uudig nerer n usgiiin  daraallar erembluulj haruul

select * from actor order by actor.first_name desc;

-- actor -uudig nerer n usgiiin  daraallar erembluulj haruul
select * from actor order by actor.first_name asc;


-- actors 

select distinct last_name from actor where last_name = 'Temple'

-- aggregation function 
-- count 

-- how many actors 

select count(*) from actor;

select COUNT(*) from city c ;

select count(*) from country c ;




select * from payment p ;


--- which customer paid the most 

select max(amount) from payment;

select MIN(amount) from payment;

select avg(amount) from payment;


select sum(amount) from payment;
















