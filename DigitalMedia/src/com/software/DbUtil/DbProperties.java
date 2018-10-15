package com.software.DbUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.software.entity.DbProperty;

public class DbProperties {
	
	public static DbProperty getDbProperty() {
		InputStream in=DbProperties.class.getResourceAsStream("/db.properties");		
		Properties properties=new Properties();
		
		try {
			properties.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DbProperty dbproperty=new DbProperty();
		dbproperty.setDriver(properties.getProperty("driver").trim());
		dbproperty.setUrl(properties.getProperty("url").trim());
		dbproperty.setUsername(properties.getProperty("username"));
		dbproperty.setPassword(properties.getProperty("password"));
		
		return dbproperty;
		
		
	}
}
