select cu.first_name,cu.last_name,cu.email,ad.address from customer as cu
inner join address as ad
on ad.address_id=cu.address_id
where ad.city_id=312;