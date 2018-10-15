package com.software.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.software.entity.DbProperty;

public class DbUtil {
	private static DbProperty dbp=DbProperties.getDbProperty();
	static {
		try {
			Class.forName(dbp.getDriver());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(dbp.getUrl(),dbp.getUsername(),dbp.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void free(ResultSet rs,Statement st,Connection conn){
		
		try {
			if(rs!=null)
			rs.close();
			if(st!=null)
				st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
