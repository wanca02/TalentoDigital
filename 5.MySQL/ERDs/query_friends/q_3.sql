SELECT users.first_name,users.last_name,count(users.first_name) as no_friends FROM users 
LEFT JOIN friendships as fr ON users.id= fr.user_id
LEFT JOIN users as user2 ON user2.id = fr.friend_id
group by users.first_name
order by no_friends desc
limit 1;