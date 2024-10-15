package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao implements AutoCloseable {
	private Connection con;

	public BookDao() throws Exception {
		Connection con = DbUtil.getConnection();
	}

	public void close() throws Exception {
		if (con != null)
			con.close();
	}

	public int save(Book b) {

		return 0;
	}

	public int update(Book b) throws Exception {
		String sql = "UPDATE books SET name=?, author=?, subject=?, price=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, b.getName());
			stmt.setString(2, b.getAuthor());
			stmt.setString(3, b.getSubject());
			stmt.setDouble(4, b.getPrice());
			stmt.setInt(5, b.getId());
			int count = stmt.executeUpdate();
			return count;
		} // stmt.close();
	}

	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM books WHERE id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int count=stmt.executeUpdate();    			
			return count;
			}
		}
		
	

	public List<Book> findAll() throws Exception {
		List<Book> list = new ArrayList<Book>();
		String sql = "SELECT * FROM books";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book b = new Book(id, name, author, subject, price);
					list.add(b);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	public Book findById(int id) throws Exception {
		String sql = "SELECT * FROM books WHERE id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book b = new Book(id, name, author, subject, price);
					return b;
				}
			} // rs.close();
		} // stmt.close();
		return null;
	}

	public List<Book> findBySubject(String subject) throws Exception {
		List<Book> list = new ArrayList<>();
		String sql = "SELECT * FROM Books WHERE subject = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, subject);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					subject = rs.getString("subject");
					Double price = rs.getDouble("price");
					Book b = new Book(id, name, author, subject, price);
					list.add(b);
				}
			}
		}
		return list;
	}

	public List<String> findAllSubjects() {
		return null;
	}
}
