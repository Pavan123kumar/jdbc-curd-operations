package jdbccrud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("org.postgresql.Driver");
	String url="jdbc:postgresql://localhost:5432/university";
	String user="postgres";
	String pass="Pavan@123";
	Connection con = DriverManager.getConnection(url, user, pass);
	System.out.println(con);
	Statement st= con.createStatement();
	String query1="INSERT INTO student VALUES(101,'PAVAN',99)";
	st.addBatch(query1);
	st.addBatch("INSERT INTO student VALUES(102,'nitish',98)");
	st.addBatch("INSERT INTO student VALUES(103,'revan',100)");
	st.addBatch("DELETE FROM student WHERE id=101");
	st.addBatch("UPDATE student SET marks=98 where id =103");
	st.executeBatch();
	con.close();
	System.out.println("executed successfully");
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
