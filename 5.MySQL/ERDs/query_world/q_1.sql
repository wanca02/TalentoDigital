select c.name,l.language,l.percentage 
from countries as c inner join languages as l
on c.id=l.country_id
where l.language="Slovene";