select co.name, l.percentage from languages as l
inner join countries as co
on co.id=l.country_id
where l.percentage>89
order by l.percentage desc;