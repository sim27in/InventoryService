CREATE TABLE TBL_INVENTORY(
id serial PRIMARY KEY,
product_name varchar(100) NOT NULL,
product_desc varchar(100),
units integer,
quantity integer,
rate integer,
created_date DATE NOT NULL DEFAULT CURRENT_DATE,
updated_date DATE,
record_state varchar(100)
);