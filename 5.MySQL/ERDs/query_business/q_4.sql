select
	client_id,count(domain_name) as no_web,
	monthname(created_datetime) as _month,
    year(created_datetime) as _year 
from sites
where client_id=1
group by domain_name;