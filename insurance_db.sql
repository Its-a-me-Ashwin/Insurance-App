SELECT * FROM grocers.quote;
DELETE FROM grocers.product WHERE pid>=1 and pid<5;
SELECT * FROM grocers.product;




create database grocers; 
use grocers;

create table customer(
email varchar(30) primary key,
password varchar(20),
firstName varchar(20),
lastName varchar(20),
gender varchar(10),
dob date,
phonenumber varchar(10),
accnumber int unique auto_increment,
amount int
);

alter table customer auto_increment=101010;

create table product(
pid int primary key auto_increment,
productName varchar(30),
productPrice int,
productQuantity int,
productUrl varchar(250)
);


insert into product(productName,productPrice,productquantity,productUrl) values("101010",8900,1,"https://media.gettyimages.com/photos/tray-full-of-granny-smiths-picture-id109908841?k=6&m=109908841&s=612x612&w=0&h=ECFTEKnpHpn33mL8-8vGKah7BxceWAMDh-I2W5ItpGQ=");
insert into product(productName,productPrice,productquantity,productUrl) values("Grapes",150,20,"https://media.gettyimages.com/photos/white-and-black-grapes-picture-id175428035?k=6&m=175428035&s=612x612&w=0&h=WIp55yqIcLGfrKpFmH0yVX2XdIl0PfvUVEM3y7gK2_A=");
insert into product(productName,productPrice,productquantity,productUrl) values("Banana",80,30,"https://media.gettyimages.com/photos/closeup-of-banana-against-white-background-picture-id1239274254?k=6&m=1239274254&s=612x612&w=0&h=hBbYst-wMeG4H8z-y5uxqCpl-2clojYenGIQg7wK9Xo=");
insert into product(productName,productPrice,productquantity,productUrl) values("Orange",90,10,"https://media.gettyimages.com/photos/full-frame-shot-of-orange-slices-pattern-picture-id1221393824?k=6&m=1221393824&s=612x612&w=0&h=RKuZNYsrP4pb6oP5Cy2PZ7-KS16Z8x9u9SIP-h0HNl0=");

create table quote(
qid int primary key auto_increment,
email varchar(40),
monthlypremium float,
dwellingcoverage float,
personalproperty int,
medicalexpense float,
additional int,
deductible float
);

alter table quote auto_increment=101010;

create table Orders(
orderId int primary key auto_increment,
orderDate date,
email varchar(40),
productName varchar(250),
amount float, 
constraint c_fk foreign key(email) references customer(email)
);
