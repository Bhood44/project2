create table users (
	userid serial PRIMARY KEY,
	firstname varchar(30),
	lastname varchar(30),
	email varchar(30),
	password varchar(30),
	birthday timestamp,
	phonenumber integer
);

create table todos(
	todoid serial PRIMARY KEY,
	user_id integer REFERENCES users(userid),
	description varchar(200),
	latitute float,
	longitude float,
	begintime timestamp,
	endtime timestamp
);