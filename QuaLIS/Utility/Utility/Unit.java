package Utility;

	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class Unit {
		
		
		public static void main(String[] args) {
			
		
		
	   java.sql.Connection conn =null;
	   ResultSet result = null;
	   try {

	//Initialize Sqldriver instance 
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	// Creating the connection providing URL and username password
	  conn = DriverManager.getConnection("sqlserver://AGL78\\SQLEXPRESS;Database=LIMSUGANDA", "sa", "admin@123");
	          
	   String query = "select * from unit";
	   PreparedStatement pst=conn.prepareStatement(query);

	   result=pst.executeQuery();
	    while(result.next()) {

	           }

	  System.out.println(result);

	           } catch (Exception e) {
	           e.printStackTrace();
	           }finally {

	           }

	   System.out.println(result);


	}}

