package empProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Updating {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
Statement s=c.createStatement();
int count=s.executeUpdate("update employee set sal=60000  where id=4");
System.out.println("updated");
s.close();
c.close();

	}

}
