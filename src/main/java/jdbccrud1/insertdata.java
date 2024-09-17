package jdbccrud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdata {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/college";
			String user="postgres";
			String pass="Pavan@123";
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println(con);
			String query1="INSERT INTO student VALUES(101,'PAVAN',99)";
			String query2="INSERT INTO student VALUES(102,'NITISH',98)";
			String query3="INSERT INTO student VALUES(1013,'REVAN',100)";
			Statement st = con.createStatement();
			st.execute(query1);
			st.execute(query2);
			st.execute(query3);
			con.close();
			System.out.println("query executed successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
