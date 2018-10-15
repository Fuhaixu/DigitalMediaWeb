package com.software.dao;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.software.DbUtil.DbUtil;
import com.software.entity.User;

public class UserDao {
	private Connection conn=null;
	private ResultSet rs=null;
	private PreparedStatement pst=null;
	private Statement st=null;
	public User login(long id) {
		conn=DbUtil.getConnection();
		User user=null;
		String sql="select * from student where sid=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setLong(1, id);
			rs=pst.executeQuery();
			while(rs.next()){
				user=new User();
				user.setId(rs.getLong("sid"));
				user.setPassword(rs.getString("password"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.free(rs, st, conn);
		return user;
	}
	
//	public static void main(String[] args) {
//		Connection conn2=DbUtil.getConnection();
//		if(conn2!=null)
//			System.out.println("成功连接");
//	}
	
}
