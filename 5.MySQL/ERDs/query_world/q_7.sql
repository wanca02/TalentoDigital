select co.name, ci.name,ci.district,ci.population from cities as ci
inner join countries as co
on co.id = ci.country_id
where ci.district="Buenos Aires"
and ci.population>500000;