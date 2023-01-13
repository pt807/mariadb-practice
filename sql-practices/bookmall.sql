-- select
-- user
select no, name, phoneNo, email from user order by no asc;
select * from user;
-- category
select no, name from category order by no asc;
select * from category;
-- book
select a.no, b.name as category, a.title, a.price from book a, category b where a.category_no = b.no order by a.no asc;
select * from book;
-- cart
select b.title, a.bookcount, (b.price * a.bookcount) as price from cart a, book b where a.book_no = b.no order by a.no asc;
select * from cart;
-- order
select a.no, b.name, b.email, a.price, a.address from orders a, user b where a.user_no = b.no order by a.no;
select * from orders;
-- order_book
select a.book_no, b.title, a.bookcount from order_book a, book b where a.book_no = b.no order by a.no;
select * from order_book;

-- insert
-- user
insert into user values(null, 'name', 1223, 'email', 'password');

-- category
insert into category values(null, 'it');

-- book
insert into book values(null, 'title', 1000, 1);

-- cart
insert into cart values(null, 1, 1, 2);

-- order
insert into orders values(null, 1, 1000, '부산광역시', 1);

-- order_book
insert into order_book values(null, 1, 2, 1);


