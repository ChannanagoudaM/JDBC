package empProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root", "root");
PreparedStatement p=c.prepareStatement("insert into employee values(?,?,?,?)");
p.setString(1,"rocky");
p.setInt(2,6);
p.setInt(3, 64);
p.setDouble(4,45000);
p.execute();
System.out.println("updated");
p.close();
c.close();

	}

}
