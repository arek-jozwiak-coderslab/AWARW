package pl.coderslab.mvcjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SmurfDao {

	private static final String FIND_ALL_SMURFS = "SELECT * FROM smurfs";
	private static final String DELETE_SMURF_QUERY = "DELETE FROM smurfs where id = ?";
	private static final String UPDATE_SMURF_QUERY = "UPDATE smurfs SET name = ? , attribute = ?, description = ? WHERE	id = ?";
	private static final String READ_SMURF_QUERY = "Select * from smurfs where id = ?";
	
	
	
	// UPDATE
	public void update(Smurf smurf) {
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_SMURF_QUERY);) {
			statement.setInt(4, smurf.getId());
			statement.setString(1, smurf.getName());
			statement.setString(2, smurf.getAttribute());
			statement.setString(3, smurf.getDescription());

			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}

	}

	// POBIERANIE smurf PO ID
	public Smurf read(Integer smurfId) {
		Smurf smurf = new Smurf();
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(READ_SMURF_QUERY);) {
			statement.setInt(1, smurfId);
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					smurf.setId(resultSet.getInt("id"));
					smurf.setName(resultSet.getString("name"));
					smurf.setAttribute(resultSet.getString("attribute"));
					smurf.setDescription(resultSet.getString("description"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}
		return smurf;

	}



	public void delete(int id) {
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_SMURF_QUERY);) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Find all Smurfs
	 * 
	 * @return
	 */
	public List<Smurf> findAll() {
		List<Smurf> smurfs = new ArrayList<>();
		try (Connection conn = DbUtil.getConnection();
				PreparedStatement statement = conn.prepareStatement(FIND_ALL_SMURFS);
				ResultSet rs = statement.executeQuery()) {
			while (rs.next()) {
				Smurf s = new Smurf();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setDescription(rs.getString("description"));
				s.setAttribute(rs.getString("attribute"));
				smurfs.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Cos sie nie powiodło");
		}

		return smurfs;
	}

}
