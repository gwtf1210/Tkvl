create table addressBook(id int auto_increment primary key,
name varchar(10) not null,
phone varchar(13) not null,
address varchar(20),
company varchar(16) );

insert into addressBook values(1,'dada','011-111-2225','seoul','abc');
insert into addressBook values(2,'tommy','011-900-2245','la','hiland');
insert into addressBook values(3,'billy','011-133-2300','tokyo','abc');
insert into addressBook values(4,'jane','011-623-2235','pusan','goodguy');
insert into addressBook values(5,'mel','011-155-5211','tokyo','goodguy');
insert into addressBook values(6,'bruce','011-721-7800','pusan','meetus');
insert into addressBook values(7,'neil','011-451-3888','seoul','meetus');
insert into addressBook values(8,'mat','011-112-2095','la','hiland');
insert into addressBook values(9,'bong','011-354-2332','london','abc');
commit;

