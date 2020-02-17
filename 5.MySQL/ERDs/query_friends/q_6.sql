/*delete fr FROM friendships as fr
LEFT JOIN users ON users.id= fr.user_id
LEFT JOIN users as user2 ON user2.id = fr.friend_id
where users.first_name="Eli" and user2.first_name="Marky";*/

/*insert into friends.friendships
values(5,2,5,"2020-02-17 10:30:00",null);*/