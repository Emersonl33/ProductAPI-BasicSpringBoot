create table products (
    id numeric not null primary key,
    productName varchar(50) not null,
    description varchar (300),
    price numeric (18, 2)
);