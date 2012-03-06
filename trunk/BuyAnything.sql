create database buy_anything;
use buy_anything;

create table user(user_id integer auto_increment, user_name varchar(50), password varchar(50), description varchar(200), primary key(user_id));

create table category(category_id integer auto_increment, description varchar(200), primary key (category_id));

/*create table product(product_id integer auto_increment, product_name varchar(200), category integer, description varchar(200), primary key(product_id), foreign key(category) references category(category_id));

create table buy_request(buy_request_id integer auto_increment, category integer, product_name varchar(200), product_description varchar(200), request_description varchar(200), user integer, min_cost float, max_cost float, primary key(buy_request_id), foreign key(category) references category(category_id), foreign key(user) references user(user_id));

create table local_sell_request(sell_request_id integer auto_increment, category integer, product integer, description varchar(200), user integer, cost float, primary key(sell_request_id), foreign key(category) references category(category_id), foreign key(product) references product(product_id), foreign key(user) references user(user_id));*/

create table buy_request(buy_request_id integer auto_increment, category integer, product_name varchar(200), product_description varchar(200), request_description varchar(200), user integer, primary key(buy_request_id), foreign key(category) references category(category_id), foreign key(user) references user(user_id));

create table local_sell_request(sell_request_id integer auto_increment, category integer, product_name varchar(200), product_description varchar(200), quantity integer, request_description varchar(200), seller integer, cost float, primary key(sell_request_id), foreign key(category) references category(category_id), foreign key(seller) references user(user_id));

create table bill(bill_id integer auto_increment, purchase_date date, primary key(bill_id));

create table transaction(transaction_id integer auto_increment, sell_request_id integer, quantity integer, buyer integer, bill_id integer, primary key (transaction_id), foreign key(sell_request_id) references local_sell_request(sell_request_id), foreign key(buyer) references user(user_id), foreign key(bill_id) references bill(bill_id));

create table cart(cart_item_id integer auto_increment, sell_request_id integer, quantity integer, cart_owner integer, primary key (cart_item_id), foreign key(sell_request_id) references local_sell_request(sell_request_id), foreign key(cart_owner) references user(user_id));
