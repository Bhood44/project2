CREATE TABLE IF NOT EXISTS users(
	userid serial PRIMARY KEY,
	firstname(30),
	lastname(30),
	email varchar(30),
	password(30),
	birthday timestamp,
	phonenumber integer
);

CREATE TABLE IF NOT EXISTS todos(
	todoid serial PRIMARY KEY,
	user_id integer REFERENCES users(userid),
	description varchar(200),
	latitute float,
	longitude float,
	begintime timestamp,
	endtime timestamp
);
