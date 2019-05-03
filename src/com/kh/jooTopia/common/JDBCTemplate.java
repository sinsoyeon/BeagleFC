package com.kh.jooTopia.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	// create connection
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "biggle", "biggle");
			
			con.setAutoCommit(false);
			
			// properties 사용시
			/*// Properties객체를 생성하고 driver.properties 파일을 불러와 담는다
			Properties prop = new Properties();
			
			prop.load(new FileReader("driver.properties"));
			
			// driver, url, user, password정보를 불러온다.
			String driver = prop.getProperty("dirver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
			// Class.forName메소드 실행
			Class.forName(driver);
			
			// 커넥션을 가져온다. 
			con = DriverManager.getConnection(url, user, password);
			
			// 자동커밋 해지하기 
			con.setAutoCommit(false);*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// close Connection
	public static void close(Connection con) {
		// 커넥션이 null이 아니고 닫혀있지 않을 때만 커넥션을 닫아준다.
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// close Statement
	public static void close(Statement stmt) {
		// statement가 null이 아니고 닫혀있지 않을 때만 커넥션을 닫아준다.
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// close ResultSet
	public static void close(ResultSet rset) {
		// resultset이 null이 아니고 닫혀있지 않을 때만 커넥션을 닫아준다.
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// commit Connection
	public static void commit(Connection con) {
		// 커넷션이 null이 아니고 닫혀있지 않을 때만 commit실행
		try {
			if(con != null && !con.isClosed()) {
				con.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// rollback Connection
	public static void rollback(Connection con) {
		// 커넷션이 null이 아니고 닫혀있지 않을 때만 rollback실행
		try {
			if(con != null && !con.isClosed()) {
				con.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
