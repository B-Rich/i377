package db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db.Item;

public class Dao extends AbstractDao {

	public void insertItem(String name, String code) throws SQLException {
		try {
			String sql = String
					.format("INSERT INTO unit VALUES (NEXT VALUE FOR seq1), '"
							+ name + "', '" + code + "'");

			st = getConnection().createStatement();
			st.executeUpdate(sql);

		} finally {
			closeResources();
		}
	}

	public void deleteItemById(int itemId) throws SQLException {
		try {
			String sql = "DELETE FROM unit WHERE id=" + itemId;
			st = getConnection().createStatement();
			st.executeUpdate(sql);
		} finally {
			closeResources();
		}
	}

	public boolean deleteAllItems() throws SQLException {
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery("DELETE FROM unit");
		} finally {
			closeResources();
		}
		return true;
	}

	public List<Item> findAllItems() throws SQLException {
		List<Item> items = new ArrayList<Item>();
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM unit");
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setCode(rs.getString(3));
				items.add(item);
			}
		} finally {
			closeResources();
		}
		return items;
	}

	public List<Item> searchLikeItems(String like) throws SQLException {
		List<Item> items = new ArrayList<Item>();
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM unit WHERE UCASE(name) LIKE '%"
					+ like.toUpperCase() + "%'");
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setCode(rs.getString(3));
				items.add(item);
			}
		} finally {
			closeResources();
		}
		return items;
	}

}
