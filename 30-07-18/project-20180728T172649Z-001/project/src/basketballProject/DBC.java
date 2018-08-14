package basketballProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBC {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/project_db";
	
	static final String USER = "root";
	static final String Pass = "oxford";
	
	public DBC() {
		
	}
	
	public void createLesson() {
		
	}
	
	public void getAllUsers(){
		try(
			Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
			Statement stmt = conn.createStatement();){
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database ..");
			System.out.println("Creating statement ..");
			String sql;
			sql = "select * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String first = rs.getString("UserID");
				String second = rs.getString("First_Name");
				String third = rs.getString("Last_Name");
				String fourth = rs.getString("Local_Court");
				String fifth = rs.getString("password");
				String sixth = rs.getString("userName");
				System.out.println(" UserID: " + first);
				System.out.println(" First Name: " + second);
				System.out.println(" Last Name: " + third);
				System.out.println(" Local Court ID: " + fourth);
				System.out.println(" password: " + fifth);
				System.out.println(" userName: " + sixth);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int getNewestUserID() {
		int result = 0;
		try(
			Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
			Statement stmt = conn.createStatement();){
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database ..");
			System.out.println("Creating statement ..");
			String sql;
			sql = "select UserID FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int userID = rs.getInt("UserID");
				result = userID;
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int getNewestID(String table ,String colName) {
		int result = 0;
		if(colName == "user") {
			System.out.println("NO USER ALLOWED");
			return 0;
		}
		try(
			Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
			Statement stmt = conn.createStatement();){
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database ..");
			System.out.println("Creating statement ..");
			String sql;
			sql = "select "+table+" FROM "+ colName;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int userID = rs.getInt("UserID");
				result = userID;
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public void addUser(User user) {
		if(user.addable() == true) {
			String name = user.getfName();
			String lname = user.getlname();
			String pass = user.getPass();
			String userN = user.getUserName();
			try(Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
				Statement stmt = conn.createStatement();){
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				System.out.println("Connecting to database ..");
				System.out.println("Inserting data");
				String sql; 
				sql = "INSERT INTO user(UserID, First_Name, Last_Name, Local_Court, password, userName)" + "VALUES("+"'"+user.getID()+"'"+","+"'"+name+"'"+","+"'"+lname+"'"+","+"(select CourtID from bballCourt where CourtID = \"1201\")" + "," +"'"+ pass +"'" + "," +"'" + userN+"'"+")";
				stmt.executeUpdate(sql);
				stmt.close();
				conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("user does not have all details filled!");
		}
	}
	
	public User getUser(String username) {
		User requestedUser = new User();
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
				Statement stmt = conn.createStatement();){
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				String sql; 
				sql = "SELECT * FROM user WHERE userName="+"'"+username+"'";
				ResultSet result = stmt.executeQuery(sql);
				
				/// /////
				if(result.next()) {
				String first = result.getString("UserID");
				String second = result.getString("First_Name");
				String third = result.getString("Last_Name");
				String fifth = result.getString("password");
				String sixth = result.getString("userName");
				requestedUser.storeDetails(Integer.parseInt(first), second, third,  fifth, sixth);
				}
				/// /////
				
				stmt.close();
				conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		return requestedUser;
	}
	
	
	
	
	
//		Adding lessons should be done in the database to allow easier addition this will be focused on later on if I have time
//	  
//	//needs to be completed
//	public void addLesson(Lesson lessonTobeAdded, User currentUser) {
//		try(Connection conn = DriverManager.getConnection(DB_URL, USER, Pass);
//			Statement stmt = conn.createStatement();){
//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//			System.out.println("Connecting to database ..");
//			System.out.println("Inserting data");
//			String sql; 
//			sql = "INSERT INTO lesson(LessonID, lesson_Title, AchievementID, Play_ID, Rule_ID, User_ID, Video_ID)" + "VALUES("+"'"+lessonTobeAdded.getID()+"'"+","+"'"+lessonTobeAdded.getTitle()+"'"+","+"(select AchievementID where AchievementID= "+lessonTobeAdded.getAchievementID()+")" + "," +"'"+ lessonTobeAdded.getRule() +"'" + "," +"'" + // +"'"+")";
//			stmt.executeUpdate(sql);
//			stmt.close();
//			conn.close();
//		}catch(SQLException se) {
//			se.printStackTrace();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}
