create table member
(memberid int primary key,
lastname varchar(255) not null,
firstname varchar(255),
address varchar(255),
city varchar(255),
mobNo varchar(255));

insert into member (memberid,lastname,firstname) values(1,'Gupta','Nohar');

create table payments(paymentid int primary key,
payment_type varchar(255),
amount double,
memberid int,
foreign key (memberid) references member(memberid) on delete cascade );

commit;