select 
	concat(cl.first_name," ",cl.last_name) as _name,
    group_concat(si.domain_name)
from clients as cl
natural join sites as si
group by _name;