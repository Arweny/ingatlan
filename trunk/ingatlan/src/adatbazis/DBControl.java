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

}
