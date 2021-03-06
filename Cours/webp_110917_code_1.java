package decouverteBdd;

import java.sql.*;

public class PremierExemple {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/EMP";
	
	// Database credentials
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			//STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, age, prenom, nom FROM employes";
			ResultSet rs = stmt.executeQuery(sql);
			
			//STEP 5: Extract data from result set
			while(rs.next()) {
				
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String prenom = rs.getString("prenom");
				String nom = rs.getString("nom");
				
				//Display values
				System.out.print("Id: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", Prenom: " + prenom);
				System.out.println(", Nom: " + nom);
				
			}
			
			//STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally {
			//finally block used to close resources
			
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}
			catch(SQLException se2) {
				// Nothing
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			System.out.println("--------------------------------------------");
		}
	}
}
