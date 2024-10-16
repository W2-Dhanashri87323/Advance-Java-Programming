package com.dhanashri.daos;
import com.dhanashri.entities.Customer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CustomerDao implements AutoCloseable {
	private Connection con;
	
	public CustomerDao() throws Exception {
		con = DbUtil.getConnection();
	}
	
	@Override
	public void close() throws Exception {
		if(con != null)
			con.close();
	}
	
	public Customer findByEmail(String email) throws Exception {
		String sql = "SELECT * FROM customers WHERE email = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, email);
			try(ResultSet rs = stmt.executeQuery()) {
				if(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String mobile = rs.getString("mobile");
					String address = rs.getString("address");
					String password = rs.getString("password");
					email = rs.getString("email");
					Date birth = rs.getDate("birth");
					Customer c = new Customer(id, name, email,password,mobile ,birth,address);
					return c;
				}
			} // rs.close();
		} // stmt.close();
		return null;
	}
	
	public int save(Customer c) throws Exception {
		String sql = "INSERT INTO customers (name, email, password, mobile ,birth, address) VALUES (?, ?, ?, ?, ?, ?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getPassword());
			stmt.setString(4, c.getMobile());
			stmt.setDate(5, c.getBirth());
			stmt.setString(6, c.getAddress());
			int count = stmt.executeUpdate();
			return count;
		} // stmt.close();
	}
}
