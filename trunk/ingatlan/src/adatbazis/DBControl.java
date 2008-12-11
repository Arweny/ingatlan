package adatbazis;

import java.sql.*;
import java.util.Vector;

public class DBControl {

public Connection conn;

public DBControl() throws Exception {
    Class.forName("org.sqlite.JDBC");
    conn = DriverManager.getConnection("jdbc:sqlite:ingatlan.db");
    System.out.println("Database connected");
    DBInit();
}

private void DBInit() throws Exception {
	//adatbazis letrehozasa, ha nincs meg tabla
	Statement stat = conn.createStatement();

	try {
		ResultSet rs = stat.executeQuery("select count(*) as db from ingatlan");
		System.out.println( "Ingatlanok szama: " + rs.getString("db") );

	} catch (Exception e)  {
		//nincs meg adatbazis
		stat.executeUpdate("create table ingatlan ( azonosito integer unsigned not null default auto_increment primary key, cim varchar(128) not null, tipus tinyint unsigned not null, szobak_szama tinyint unsigned not null,	maximalis_lako tinyint unsigned not null, komfort_fokozat tinyint unsigned not null, kiadhato date not null, statusz tinyint unsigned not null, berleti_dij integer unsigned not null, terulet integer unsigned not null, futes tinyint unsigned not null, klima tinyint unsigned not null, butorozott tinyint unsigned not null, belmagassag integer unsigned not null, epites_eve integer unsigned not null, allapot tinyint unsigned not null ) ");
		System.out.println( "create table ingatlan" );
	}

	try {
		ResultSet rs2 = stat.executeQuery("select count(*) as db from ugyfel");
		System.out.println( "Ugyfelek szama: " + rs2.getString("db") );

	} catch (Exception e)  {
		stat.executeUpdate("create table ugyfel ( azonosito integer unsigned not null default auto_increment primary key, szigszam varchar(20), vezeteknev varchar(50), keresztnev varchar(50), leanykori_nev varchar(100), szuletesi_hely varchar(30), szuletesi_ido date, anyja_neve varchar(100), csaladi_allapota tinyint unsigned not null)");
		System.out.println("creat table ugyfel");
	}

	try {
		ResultSet rs2 = stat.executeQuery("select count(*) as db from szerzodes");
		System.out.println( "Szerzodesekek szama: " + rs2.getString("db") );

	} catch (Exception e)  {
		stat.executeUpdate("create table szerzodes ( azonosito integer unsigned not null default auto_increment primary key, kezdete date, lejarat date, hosszabbitas1 tinyint unsigned not null, hosszabbitas2 tinyint unsigned not null, hosszabbites3 tinyint unsigned not null, felmondas_tipusa varchar(40), felmondas_indoka tinyint unsigned not null, felmondta tinyint unsigned not null, lakok_szama integer unsigned not null, berlo_azonosito integer unsigned not null, ingatlan_azonosito integer unsigned not null, foreign key (berlo_azonosito) references ugyfel(azonosito), foreign key (ingatlan_azonosito) references ingatlan(azonosito))");
		System.out.println("creat table szerzodes");
	}
}

public void DBSaveIngatlan(Vector<String> field) throws Exception {
	System.out.println(field.toString());
	//adat ellenorzes
	if ( field.elementAt(1).equals("")) {
		//ures az azonosito, uj adat
		PreparedStatement prep = conn.prepareStatement("insert into ingatlan (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

		for (int i=1; i<field.size()/2; i++) {
			System.out.println("i=" + i);
			prep.setString(i, field.elementAt(i));
			prep.setString(i+15, field.elementAt(i+15));
		}
		prep.addBatch();
		conn.setAutoCommit(false);
		prep.executeBatch();
		conn.setAutoCommit(true);


/*
		ResultSet rs = stat.executeQuery("SELECT last_insert_rowid() as id");
		String id=rs.getString("id");
		System.out.println("uj ingatlan id=" + id);
		rs.close();
*/

		//PreparedStatement p= conn.PreparedStatement();
	} else {
		//van mar azonosito, frissites
		//PreparedStatement p= conn.PreparedStatement();
	}


}


	public void SaveData(Vector<String> field, String db_name) throws Exception {
		System.out.println(field.toString());
		//adat ellenorzes
		if ( field.elementAt(1).equals("")) {
			//ures az azonosito, uj adat
			String query = "insert into "+ db_name +" (";
			for (int j=0;  j<field.size()/2; j++) {

				query.concat("?");
			}
			query.concat(") values (");
			for (int j=0;  j<field.size()/2; j++) {

				query.concat("?");
			}
			query.concat(")");
			System.out.println(query);
			PreparedStatement prep = conn.prepareStatement(query);

			for (int i=1; i<field.size()/2; i++) {
				System.out.println("i=" + i);
				prep.setString(i, field.elementAt(i));
				prep.setString(i+15, field.elementAt(i+15));
			}
			prep.addBatch();
			conn.setAutoCommit(false);
			prep.executeBatch();
			conn.setAutoCommit(true);


	/*
			ResultSet rs = stat.executeQuery("SELECT last_insert_rowid() as id");
			String id=rs.getString("id");
			System.out.println("uj ingatlan id=" + id);
			rs.close();
	*/

			//PreparedStatement p= conn.PreparedStatement();
		} else {
			//van mar azonosito, frissites
			//PreparedStatement p= conn.PreparedStatement();
		}


	}
}
