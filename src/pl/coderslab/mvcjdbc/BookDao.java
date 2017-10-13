package pl.coderslab.mvcjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	// ZAPYTANIA SQL
	private static final String CREATE_BOOK_QUERY = "INSERT INTO book(title,author,isbn) VALUES (?,?,?)";
	private static final String DELETE_BOOK_QUERY = "DELETE FROM book where id = ?";
	private static final String FIND_ALL_BOOKS_QUERY = "SELECT * FROM book";
	private static final String READ_BOOK_QUERY = "Select * from book where id = ?";
	private static final String UPDATE_BOOK_QUERY = "UPDATE	book SET title = ? , author = ?, isbn = ? WHERE	id = ?";

	
	
	// POBIERANIE bookA PO ID
	public Book read(Integer bookId) {
		Book book = new Book();
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(READ_BOOK_QUERY);) {
			statement.setInt(1, bookId);
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					book.setId(resultSet.getInt("id"));
					book.setTitle(resultSet.getString("title"));
					book.setAuthor(resultSet.getString("author"));
					book.setIsbn(resultSet.getString("isbn"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}
		return book;

	}

	// LISTA WSZYSTKICH KSIAZEK
	public List<Book> findAll() {
		List<Book> bookList = new ArrayList<>();
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(FIND_ALL_BOOKS_QUERY);
				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {
				Book bookToAdd = new Book();
				bookToAdd.setId(resultSet.getInt("id"));
				bookToAdd.setTitle(resultSet.getString("title"));
				bookToAdd.setAuthor(resultSet.getString("author"));
				bookToAdd.setIsbn(resultSet.getString("isbn"));
				bookList.add(bookToAdd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}
		return bookList;

	}

	/**
	 * Create book
	 * 
	 * @param book
	 * @return
	 */
	public Book create(Book book) {
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement insertStm = connection.prepareStatement(CREATE_BOOK_QUERY,
						PreparedStatement.RETURN_GENERATED_KEYS)) {
			insertStm.setString(1, book.getTitle());
			insertStm.setString(2, book.getAuthor());
			insertStm.setString(3, book.getIsbn());
			int result = insertStm.executeUpdate();

			if (result != 1) {
				throw new RuntimeException("Execute update returned " + result);
			}

			try (ResultSet generatedKeys = insertStm.getGeneratedKeys()) {
				if (generatedKeys.first()) {
					book.setId(generatedKeys.getInt(1));
					return book;
				} else {
					throw new RuntimeException("Generated key was not found");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}
		return null;
	}

	// USUWANIE PO ID
	public void delete(Integer bookId) {
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_BOOK_QUERY);) {
			statement.setInt(1, bookId);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}
	}
	
	
	// UPDATE
	public void update(Book book) {
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_BOOK_QUERY);) {
			statement.setInt(4, book.getId());
			statement.setString(1, book.getTitle());
			statement.setString(2, book.getAuthor());
			statement.setString(3, book.getIsbn());

			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}

	}

}
