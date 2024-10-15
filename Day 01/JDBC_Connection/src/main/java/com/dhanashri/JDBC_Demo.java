package com.dhanashri;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Demo{
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String DB_USER = "W2_87323_Dhanashri";
	public static final String DB_PASSWD = "manager";
	
	// 1)Load & Register the driver class :->
	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter subject : ");
		String subject = sc.nextLine();
		System.out.println("Enter price :");
		Double price = sc.nextDouble();
    // 2)create jdbc connection->
		try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){
     // 3)create jdbc statement->
			String sql = "SELECT * FROM books WHERE subject = ? AND price > ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
					stmt.setString(1, subject);
					stmt.setDouble(2, price);
					
				try(ResultSet rs = stmt.executeQuery()){
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String author = rs.getString("author");
						String subjct = rs.getString("subject");
						Double pric = rs.getDouble("price");
						System.out.printf("%d,%s,%s,%s,%f\n",id,name,author,subjct,pric);
					}
						
				 
				}//rs.close();
		} // stmt.close();
			
		} //con.close();
		
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
