select c.name,count(ci.name) as n_cities from countries as c 
inner join cities as ci
on c.id=ci.country_id
group by c.name
order by n_cities desc;