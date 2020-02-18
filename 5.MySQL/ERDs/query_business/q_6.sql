select concat(cl.first_name," ",cl.last_name) as _name,count(le.leads_id) from clients as cl
inner join sites as si
on cl.client_id=si.client_id
inner join leads as le
on le.site_id=si.site_id
where registered_datetime>"2011-01-01"
and registered_datetime<"2011-12-31"
group by _name;