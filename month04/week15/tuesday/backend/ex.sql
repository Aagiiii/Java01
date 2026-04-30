SELECT
    c.name AS category,
    COUNT(DISTINCT f.film_id) AS film_count,
    ROUND(AVG(f.rental_rate), 2) AS avg_rate,
    MIN(f.rental_rate) AS min_rate,
    MAX(f.rental_rate) AS max_rate
FROM category c
INNER JOIN film_category fc ON c.category_id = fc.category_id
INNER JOIN film f ON fc.film_id = f.film_id
GROUP BY c.name
ORDER BY avg_rate DESC
LIMIT 4;

-- Хамгийн их рент хийлгэсэн 5 кино-г ол.

select f.title, f.rating, f.rental_rate, COUNT(r.rental_id) as rental_count
from film f 
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
group by f.title, f.rating, f.rental_rate
order by rental_count desc
limit 5;

-- Зорилго: Store бүрийн нийт орлого харуул
SELECT
    s.store_id,
    SUM(p.amount) AS total_revenue
FROM store s
LEFT JOIN staff st ON s.store_id = st.store_id
LEFT JOIN payment p ON p.staff_id = st.staff_id  -- Bug энд!
GROUP BY s.store_id
ORDER BY total_revenue DESC;


select rating , COUNT(*) as f_count, round(avg(rental_rate ),2) as avg_rate,
round((avg(rental_rate)- (select sum(rental_rate)/count(rental_rate) from film)),2) as diff
from film f
group by rating;

--rental_duration нь rating='G' кинонуудын дундаж rental_duration-аас их кинонуудыг ол.

select title, rating, rental_duration, replacement_cost
from film f
where rental_duration > (select avg(rental_duration) from film where rating ='G')
order by rental_duration desc
limit 500;


-- тус жүжигчин оролцсон кинонуудын дундаж rental_rate нь нийт бүх киноны дундажаас их жүжигчин-уудыг ол.

select first_name, last_name, round(avg(f.rental_rate),2) as avg_rental_rate
from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on f.film_id =fa.film_id
group by first_name , last_name 
having avg(rental_rate) > (select sum(rental_rate)/count(rental_rate)  from film f2 )
order by avg_rental_rate desc
limit 5;

--'Horror' эсвэл 'Sci-Fi' ангиллын кинонуудыг ол.
select f.title, f.rating, f.rental_rate
from film f 
where f.film_id in(
	select film_id 
	from film_category fc 
	join category c on fc.category_id =c.category_id 
	where c.name ='Horror' or c.name = 'Sci-Fi'
)
order by f.rating , f.rental_rate desc;

-- Эдгээр кинонууд хэзээ ч inventory-д ороогүй (рент хийлгэх боломжгүй)

select f.title, f.rating, f.rental_rate
from film f 
where f.film_id not in( 
	select film_id
	from inventory i
	where film_id is not null
)
order by f.title ;


--  2005 оны 7 сард хэзээ ч рент хийлгээгүй кинонуудыг ол.

select f.title, f.rating
from film f 
where f.film_id not in( 
	select film_id
	from rental r 
	 inner join inventory i on r.inventory_id = i.inventory_id
	where film_id is not null
)
order by f.title
limit 10;

-- rental_rate нь 'Action' ангиллын кинонуудын дундаж rental_rate-аас их 'Comedy' ангиллын кинонуудыг ол.

select
	title,
	rental_rate
from
	film f
where
	(
	select
		round(avg(rental_rate), 2)
	from
		film f2
	join film_category fc on
		fc.film_id = f2.film_id
	join category c on
		fc.category_id = c.category_id
	where
		c."name" = 'Comedy') > (
	select
		round(avg(rental_rate), 2)
	from
		film f2
	join film_category fc on
		fc.film_id = f2.film_id
	join category c on
		fc.category_id = c.category_id
	where
		c."name" = 'Action')
order by
	rental_rate desc
limit 10;

--  2 дэлгүүр хоёулаа-д байгаа кинонуудыг ол.

select f.title, f.rating
from film f 
where f.film_id in(  
	select film_id 
	from inventory i  
	where (store_id =1)
) and f.film_id in (select film_id 
	from inventory i  
	where (store_id =2))
order by f.title 
limit 10;