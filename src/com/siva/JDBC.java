package com.siva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sivadb","root","password");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from students_detail");
			
			while(resultSet.next()) {
				System.out.println("id:"+resultSet.getInt(1)+" "+"name:"+resultSet.getString(2)+" "+"address:"+resultSet.getString(3));
			}
			connection.close();
		} catch (Exception e) {

		
		}

	}

}
