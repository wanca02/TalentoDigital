select 
	concat(cl.first_name," ",cl.last_name) as _name,
	count(le.leads_id) as no_leads,
    monthname(registered_datetime) as _month
from clients as cl
inner join sites as si
on cl.client_id=si.client_id
inner join leads as le
on le.site_id=si.site_id
where month(registered_datetime) between 1 and 6
and year(registered_datetime)=2011
group by _name, _month;



