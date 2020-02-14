select fi.title,fi.description,fi.release_year,fi.rating,fi.special_features from film as fi
inner join film_actor as fa
on fi.film_id = fa.film_id
where rating="G"
and special_features like "%Behind the Scenes%"
and fa.actor_id=15;