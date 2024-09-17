import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/university";
			String user="postgres";
			String pass="Pavan@123";
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println(con);
			String sql="UPDATE student SET marks=? WHERE id=?";
			PreparedStatement st = con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("enter the id:");
			int id = sc.nextInt();
			System.out.println("enter the marks:");
			int marks = sc.nextInt();
			st.setInt(2,id);
			st.setInt(1, marks);
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
