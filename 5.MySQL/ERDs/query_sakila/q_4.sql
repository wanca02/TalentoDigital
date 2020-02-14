select ad.city_id,cu.first_name,cu.last_name,cu.email,ad.address,store_id from customer as cu
inner join address as ad
on cu.address_id=ad.address_id
where store_id=1
and (ad.city_id=1 or ad.city_id=42 or ad.city_id=312 or ad.city_id=459);