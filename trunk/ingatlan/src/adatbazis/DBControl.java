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
		stat.executeUpdate("create table ugyfel ( azonosito integer unsigned not null default auto_increment primary key, szigszam varchar(20), vezeteknev varchar(50), keresztnev varchar(50), leanykori_nev varchar(100), szuletesi_hely varchar(30), szuletesi_ido date, anyja_neve varchar(100), csaladi_allapota varchar(100))");
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


	public void addItem(Vector<String> field, String db_name) throws Exception {

		//adat ellenorzes
		if ( field.elementAt(1).equals("")) {
			//ures az azonosito, uj adat
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("SELECT max(azonosito) as id from " + db_name);
			String id=rs.getString("id");
			if (id == null) id = "0";
			int i_id = Integer.valueOf(id).intValue();
			if (i_id == 0) i_id = 1;
			else i_id = i_id+1;
			System.out.println("uj id=" + i_id);
			rs.close();
			stat.close();

			String query = "";
			StringBuffer sb = new StringBuffer();
			StringBuffer fields = new StringBuffer();
			StringBuffer values = new StringBuffer();
			fields.append("(");
			values.append(" values (");
			sb.append("insert into "+ db_name +" ");
			for (int i=0; i<field.size(); i+=2) {
				if (i > 0) {
					fields.append(",");
					values.append(",");
				}
				if (i == 0) {
					fields.append("azonosito");
					values.append(i_id);
				}
				else {
					fields.append(field.elementAt(i));
					values.append("'" + field.elementAt(i+1) + "'");
				}


			}
			fields.append(")");
			values.append(")");
			sb.append(fields);
			sb.append(values);
			query = sb.toString();
			System.out.println(query);
			Statement update = conn.createStatement();
			//conn.setAutoCommit(false);
			update.executeUpdate(query);
			//conn.setAutoCommit(true);
			update.close();

		} else {
			//van mar azonosito, frissites
			System.out.println("Létező azonosító!");
		}


	}

	public void modItem(Vector<String> field, String db_name) throws Exception {

		//adat ellenorzes
		if ( field.elementAt(1).equals("")) {
			//ures az azonosito
			System.out.println("Hibás input, hiányzik az azonosító!");
		} else {

			String query = "";
			StringBuffer sb = new StringBuffer();
			sb.append("update "+ db_name +" set");
			for (int i=0; i<field.size(); i+=2) {
				sb.append(field.elementAt(i));
				sb.append("=");
				sb.append("'" + field.elementAt(i+1) + "'");
			}
			sb.append("where azonosito=" + field.elementAt(1));
			query = sb.toString();
			System.out.println(query);
			Statement stat = conn.createStatement();
			conn.setAutoCommit(false);
			stat.executeUpdate(query);
			conn.setAutoCommit(true);
			stat.close();
		}


	}

	public ResultSet getItems(String db_name) throws Exception {

		System.out.println("database: " + db_name);

		Statement stmnt = conn.createStatement();
		ResultSet rs = stmnt.executeQuery("select * from " + db_name);

		return rs;
	}


	public ResultSet getItem(String db_name, int azonosito) throws Exception {

		System.out.println("database: " + db_name);

		Statement stmnt = conn.createStatement();
		ResultSet rs = stmnt.executeQuery("select * from " + db_name + "where azonosito=" + azonosito);

		return rs;
	}


	public ResultSet getItemAttribute(String db_name, int azonosito, String attribute) throws Exception {

		System.out.println("database: " + db_name);

		Statement stmnt = conn.createStatement();
		ResultSet rs = stmnt.executeQuery("select " + attribute + " from " + db_name + "where azonosito=" + azonosito);

		return rs;
	}


	public void delItem(String db_name, int azonosito) throws Exception {

		System.out.println("database: " + db_name);

		Statement stmnt = conn.createStatement();
		stmnt.executeQuery("delete from " + db_name + "where azonosito=" + azonosito);
	}
}
