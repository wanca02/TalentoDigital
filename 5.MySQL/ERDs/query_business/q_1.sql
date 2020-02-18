SELECT monthname(charged_datetime) as _month,sum(amount) as _AVG FROM billing
where year(charged_datetime)="2012"
and month(charged_datetime)="03";