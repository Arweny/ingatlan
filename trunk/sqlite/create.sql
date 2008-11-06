
create table ingatlan (
	azonosito integer unsigned not null default auto_increment primary key,
	cim varchar(128) not null,
	tipus enum('lakas', 'haz', 'nyaralo'),
	szobak_szama tinyint unsigned not null,
	maximalis_lako tinyint unsigned not null,
	komfort_fokozat enum('komfort nelkuli', 'felkomfortos', 'osszkomfortos'),
	kiadhato date not null
);


create table ingatlan (
	azonosito integer unsigned not null default auto_increment primary key,
	cim varchar(128) not null,
	tipus tinyint unsigned not null,
	szobak_szama tinyint unsigned not null,
	maximalis_lako tinyint unsigned not null,
	komfort_fokozat tinyint unsigned not null,
	kiadhato date not null
);



