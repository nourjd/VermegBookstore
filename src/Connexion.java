import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connexion {
	 Connection con =null;
	 Statement stm =null;
	 ResultSet rs=null;
	 public Connexion() {
		  try {
			 Class.forName("com.mysql.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql","root","" );
			
		 }
		  catch(ClassNotFoundException e) { e.printStackTrace();}
		 
		  catch (SQLException e) {e.printStackTrace();}
	 }
	
	public  void insertBook() {
		 try {
		 stm =con.createStatement();
		 String req="insert into books(title , author, price , releasedate) values ('les miserable','victor hugo',20,'2020-11-22')";
	     stm.executeUpdate(req);
	     
		}
		 catch (SQLException e) { e.printStackTrace();}
		 
		 }
	
	public void displayBook(){   
		 try {
	      stm =  con.createStatement(); 
	      String req1="select *from books "; 
	      ResultSet rs = stm.executeQuery(req1);
	      int i=0;
	        while (rs.next()) {
	          i++; 
	        System.out.println("id : " + rs.getInt("id"));
	        System.out.println("title : " + rs.getString("title"));
	        System.out.println("author : " + rs.getString("author"));
	        System.out.println("price : " + rs.getFloat("price"));
	        System.out.println("date: " + rs.getDate("releasedate"));
	    }
	    }
	    catch(SQLException e){e.printStackTrace();}
	    }
	
}
