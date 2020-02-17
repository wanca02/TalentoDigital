SELECT users.first_name,users.last_name,user2.first_name,user2.last_name  FROM users 
LEFT JOIN friendships as fr ON users.id= fr.user_id
LEFT JOIN users as user2 ON user2.id = fr.friend_id
where users.first_name="Eli"
order by user2.first_name asc;