import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletedata {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/university";
			String user="postgres";
			String pass="Pavan@123";
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println(con);
			String sql="DELETE FROM student  WHERE id=?";
			PreparedStatement st = con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("enter the id:");
			int id = sc.nextInt();
			
			st.setInt(1,id);
			
			st.executeUpdate();
			
			con.close();
			
			
			System.out.println("excuted successfully");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
