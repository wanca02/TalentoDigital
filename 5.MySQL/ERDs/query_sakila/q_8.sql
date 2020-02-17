select ac.first_name,ac.last_name,fi.title,fi.description,fi.release_year,fi.rating,fi.special_features,ca.name
from film as fi
inner join film_category as fc
on fi.film_id = fc.film_id
inner join category as ca
on ca.category_id = fc.category_id
inner join film_actor as fa
on fa.film_id=fi.film_id
inner join actor as ac
on fa.actor_id=ac.actor_id
where ca.name="Action"
and ac.first_name="SANDRA"
and ac.last_name="KILMER";
