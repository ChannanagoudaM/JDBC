package empProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Sorting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
Statement s=c.createStatement();
ResultSet rs=s.executeQuery("select name,sal from employee where name like 's%' and sal>40000");
while(rs.next())
{
	String str=rs.getString(1)+","+rs.getDouble(2);
	System.out.println(str);
}
s.close();
c.close();

	}

}
