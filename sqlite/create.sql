
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
	kiadhato date not null,
	statusz tinyint unsigned not null,
	berleti_dij integer unsigned not null,
	terulet integer unsigned not null,
	futes tinyint unsigned not null,
	klima tinyint unsigned not null,
	butorozott tinyint unsigned not null,
	belmagassag integer unsigned not null,
	epites_eve integer unsigned not null,
	allapot tinyint unsigned not null
);




