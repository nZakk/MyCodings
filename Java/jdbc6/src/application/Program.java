package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			
			conn = DB.getConnection();
			
			// with commit false every statment need to reach the commit() command to be completed
			// or id it get any error during the code it doesn`t commit to the date base yet
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			int x = 1;
			if(x < 2) {
				throw new SQLException("Fake error");
			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

			// when it reaches the commit( command it commit to the db
			conn.commit();
			
			System.out.println("rows1 = " + rows1);
			
			System.out.println("rows2 = " + rows2);
		}
		catch(SQLException e) {

			//this rolls back to the state before the last commit
			try {
				conn.rollback();
				throw new DbException("Error: Transaction rolled back! " + e.getMessage() );
			} catch (SQLException e1) {
				throw new DbException("Error in rollback caused by: " + e1.getMessage() );
			}
			

		}
		finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
		
	}

}
