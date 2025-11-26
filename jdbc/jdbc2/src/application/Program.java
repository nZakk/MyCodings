package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = DB.getConnection();
			
			//create a statement object
			st = conn.createStatement();
			
			//brings the result od the query to a ResultSet object to rs
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
				
				}
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatment(st);
			DB.closeConnection();
		}
	}

}
