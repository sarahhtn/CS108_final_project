package quizsite;

import java.security.MessageDigest;
import java.util.*;

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
	
	public User(String username, String pw) {
		this.count++;
		this.id = this.count;
		this.username = username;
		this.createdAt = new Date();
		this.salt = this.createdAt.toString();
		System.out.println("user created at " + this.salt);
		this.password = generateHash(pw + this.salt);
		System.out.println("hashed pw is  " + this.password);
		this.friends = new ArrayList<User>();
		this.quizCreated = new ArrayList<Quiz>();
		this.quizTaken = new ArrayList<Quiz>();
		this.mailReceived = new ArrayList<Mail>();
		this.hasNewMail = false;
		
	
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
	
}
