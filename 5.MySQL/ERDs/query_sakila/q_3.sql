select ac.actor_id, ac.first_name, fi.title,fi.description,fi.release_year from actor as ac
inner join film_actor as fa
on ac.actor_id=fa.actor_id
inner join film as fi
on fa.film_id=fi.film_id
where fa.actor_id=5;