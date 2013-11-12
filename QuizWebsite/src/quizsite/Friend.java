package quizsite;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Friend {

	static public boolean createFriends(int u1ID, int u2ID, DBConnection dbCon) {		
		try {
			Statement stmt = dbCon.getConnection().createStatement();
			stmt.executeQuery("USE " + DBConnection.database);
			PreparedStatement preStmt = dbCon.getConnection().prepareStatement("INSERT INTO friends (user1, user2) VALUES (?, ?)");
			// insert friends tuple bi-direction
			preStmt.setInt(1, u1ID);
			preStmt.setInt(2, u2ID);
			preStmt.executeUpdate();
			preStmt.setInt(2, u1ID);
			preStmt.setInt(1, u2ID);
			preStmt.executeUpdate();
			System.out.println("in createFriends");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
}
