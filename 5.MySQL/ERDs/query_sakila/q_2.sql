select fi.title,fi.description,fi.release_year,fi.rating,fi.special_features from film as fi
inner join film_category as fc
on fi.film_id = fc.film_id
inner join category as ca
on ca.category_id = fc.category_id
where ca.name="Comedy";
