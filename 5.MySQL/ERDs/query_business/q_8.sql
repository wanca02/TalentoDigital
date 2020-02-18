select 
	concat(cl.first_name," ",cl.last_name) as _name,
    si.domain_name as website,
	count(le.leads_id) as no_leads,
    date_format(registered_datetime,"%M %D %Y") as _date
from clients as cl
inner join sites as si
on cl.client_id=si.client_id
inner join leads as le
on le.site_id=si.site_id
where registered_datetime between "2011-01-01" and "2011-12-31"
group by website;



