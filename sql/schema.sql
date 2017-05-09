CREATE DATABASE realtor
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;


create table roles (
	uid int not null primary key,
	name varchar(50)
);

create table users (
    uid serial primary key,
    name varchar(100) not null,
    email varchar(70) not null,
    pass varchar(50) not null,
    phone varchar(17) not null,
    role_id int not null references roles(uid),
    registration boolean
);

create table objects (
    uid serial primary key,
    name varchar(100) not null,
    type varchar(100) not null,
    description varchar(255) not null,
    price real
);

create table views (
    uid serial primary key,
    user_id int not null references users(uid),
    object_id int not null references objects(uid),
    date_view date,
    time_view varchar(5)
);