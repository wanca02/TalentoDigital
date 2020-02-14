select region, count(id) as n_pais from countries
group by region
order by n_pais desc;