package quizsite;

import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class User {
	
	public static int count = 0;
	
	private int id;
	private String username;
	private String password;
	private String salt;
	private Date createdAt;
	private ArrayList<User> friends;
	private ArrayList<Quiz> quizCreated;
	private ArrayList<Quiz> quizTaken;
	private ArrayList<Mail> mailReceived;
	private boolean hasNewMail;
	
	DBConnection dbCon;
	
	public User(String username, DBConnection dbCon) {
		this.username = username;
		try {
			// get user id
			String selectSQL = "SELECT id FROM users WHERE username = ?";
			PreparedStatement preStmt = dbCon.getConnection().prepareStatement(selectSQL);
			preStmt.setString(1, username);
			ResultSet rs = preStmt.executeQuery();
			if(rs.next()) {
				int recordedId = rs.getInt("id");
				this.id = recordedId;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
//		this.friends = new ArrayList<User>();
//		this.quizCreated = new ArrayList<Quiz>();
//		this.quizTaken = new ArrayList<Quiz>();
//		this.mailReceived = new ArrayList<Mail>();
//		this.hasNewMail = false;
		
		this.dbCon = dbCon;
	}
	
	static public boolean registerUser(String username, String pw, DBConnection dbCon) {
		//User.count++;
		//int id = User.count;
		Date createdAt = new Date();
		String salt = createdAt.toString();
		System.out.println("user created at " + salt);
		String password = generateHash(pw + salt);
		System.out.println("hashed pw is  " + password);		
		try {
			PreparedStatement preStmt = dbCon.getConnection().prepareStatement("INSERT INTO users (username, password, salt) VALUES (?, ?, ?)");
			//preStmt.setInt(1, id);
			preStmt.setString(1, username);
			preStmt.setString(2, password);
			preStmt.setString(3, salt);
			preStmt.executeUpdate();
			System.out.println("in registerUser");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	static public boolean existUser(String username, DBConnection dbCon) {
		try {
			String selectSQL = "SELECT username FROM users WHERE username = ?";
			PreparedStatement preStmt = dbCon.getConnection().prepareStatement(selectSQL);
			preStmt.setString(1, username);
			ResultSet rs = preStmt.executeQuery();
			if(rs.next()) {
				System.out.println("user already exist");
				return true;
			}
			System.out.println("in existUser");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} 
		return false;
	}
	
	static public boolean Login(String username, String pw, DBConnection dbCon) {
		try {
			String selectSQL = "SELECT password, salt FROM users WHERE username = ?";
			PreparedStatement preStmt = dbCon.getConnection().prepareStatement(selectSQL);
			preStmt.setString(1, username);
			ResultSet rs = preStmt.executeQuery();
			if(rs.next()) {
				String recordedPw = rs.getString("password");
				String recordedSalt = rs.getString("salt");
				String inputPwWithSalt = generateHash(pw + recordedSalt);
				if(inputPwWithSalt.equals(recordedPw)) {
					System.out.println("login success");
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		System.out.println("login failed");
		return false;
	}
	
	public static String hexToString(byte[] bytes) {
		StringBuffer buff = new StringBuffer();
		for (int i=0; i<bytes.length; i++) {
			int val = bytes[i];
			val = val & 0xff;  // remove higher bits, sign
			if (val<16) buff.append('0'); // leading 0
			buff.append(Integer.toString(val, 16));
		}
		return buff.toString();
	}
	
	public static String generateHash(String pw) {	
		byte[] byteData = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA");
			md.update(pw.getBytes());
			byteData = md.digest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hexToString(byteData);
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public ArrayList<User> getFriendsList() {
		return null;
	}
	
	public ArrayList<Mail> getMails() {
		this.mailReceived = new ArrayList<Mail>();
		try {
			String selectSQL = "SELECT fromId, type, content FROM mails WHERE toId = ?";
			PreparedStatement preStmt = this.dbCon.getConnection().prepareStatement(selectSQL);
			preStmt.setInt(1, this.id);
			ResultSet rs = preStmt.executeQuery();
			while(rs.next()) {
				int fromId = rs.getInt("fromId");
				int type = rs.getInt("type");
				String content = rs.getString("content");
				Mail mail = new Mail(fromId, type, content);
				this.mailReceived.add(mail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return this.mailReceived;
	}
	
}
