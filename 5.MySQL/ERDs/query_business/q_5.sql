select 
	si.domain_name as website,
	count(le.leads_id) as no_leads,
    date_format(registered_datetime,"%M %D %Y") as _date
from leads as le
natural join sites as si
where registered_datetime>"2011-01-01"
and registered_datetime<"2011-02-15"
group by si.domain_name;