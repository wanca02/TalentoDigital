SELECT client_id, sum(amount) as total FROM billing
where client_id=2;