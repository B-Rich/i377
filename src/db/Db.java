package db;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import db.SetupDao;

public class Db {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//List<Person> persons = new Dao().findAllPersons();
		//System.out.println(persons);
		
		new SetupDao().createSchema();
		
		/**Connection conn = null;
	    Statement stmt = null;
	    ResultSet rset = null;
	    try {
	    	Class.forName("org.hsqldb.jdbcDriver");
	        conn = DriverManager.getConnection(
	            "jdbc:hsqldb:file:${user.home}/data/KirillRyzhkov/db;shutdown=true");

	     
	        stmt = conn.createStatement();
	        rset = stmt.executeQuery("select * from person");
	        while(rset.next()) {
	        	System.out.println(rset.getString(1));
	        }
	    } finally {
	        DbUtils.closeQuietly(stmt);
	        DbUtils.closeQuietly(conn);
	        DbUtils.closeQuietly(rset);
	    }*/
	}
}
