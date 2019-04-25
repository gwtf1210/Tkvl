create table book(
isbn char(12) primay key,
title varchar(100) not null,
catalogue varchar(50) not null,
nation varchar(50),
publish_date date,
publisher varchar(100),
author varchar(100) not null,
price int(6) ,
currency char(6),
description varchar(4000)
);
INSERT INTO book VALUES('1233-111-111','Java 완성','프로그래밍','국내도서',
         '2019.1.1','사무국','사무국',3000,'원','java를 마시자');
INSERT INTO book VALUES('1233-111-123','Java와 함께','프로그래밍','국내도서',
         '2019.1.2','사무국','사무국',4000,'원','java와 동행');

commit;
