package com.spring.rest.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleConnection {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			conn = DriverManager.getConnection(url,"HR","HR");
			//conn = DriverManager.getConnection(url, "SYSTEM", "manager");
			if (conn != null) {
				System.out.println("Connected -------1");
			}
			Statement statement = conn.createStatement();
			ResultSet resultset = statement.executeQuery("select * from EMPLOYEES");

			while (resultset.next()) {
				System.out.println(resultset.getString(1));
			}
			statement.close();
			conn.close();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

}
