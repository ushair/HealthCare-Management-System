package health;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DriverSql {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/Health_Care_Manage";
	
	 static final String USER = "root";
	 static final String PASS = "";
	 
public DriverSql() {
	   Statement stmt = null;

	
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting DB.. wait...");
			 con =(Connection) DriverManager.getConnection(DB_URL ,USER,PASS);
			 System.out.println("connected");
			   System.out.println("Creating statement...");
     	      stmt = (Statement) con.createStatement();
     	      String sql;
     	      sql = "SELECT * from Patient";
     	      ResultSet rs = stmt.executeQuery(sql);

     
     	      
     	      while(rs.next()){
     	         //Retrieve by column name
     	         int id  = rs.getInt("PID");
     	         String pname = rs.getString("Pname");
     	         String gen = rs.getString("Gender");
     	         String addr = rs.getString("PAddress");
     	         int cont = rs.getInt("Pcontact");
     	         //Display values
     	         System.out.print("ID: " + id);
     	         System.out.print(", NAME: " + pname);
     	         System.out.print(", GENDER: " + gen);
     	         System.out.println(", ADDRESS: " + addr);
     	         System.out.println(", Pcontact: "+ cont);
     	      }
     	      //STEP 6: Clean-up environment
     	      rs.close();
     	      stmt.close();
     	      con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
