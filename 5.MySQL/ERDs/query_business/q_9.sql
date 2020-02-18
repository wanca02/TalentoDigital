select 
	concat(cl.first_name," ",cl.last_name) as _name,
    sum(amount),
    monthname(charged_datetime) as _month,
    year(charged_datetime) as _year
from billing as bi
natural join clients as cl
group by _name,_month,_year;