select ci.name, ci.population from cities as ci
inner join countries as co
on co.id=ci.country_id
where co.name="México"
and ci.population>500000
order by ci.population DESC;