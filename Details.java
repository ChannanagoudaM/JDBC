package empProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Details {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
PreparedStatement p=c.prepareStatement("select * from employee");
ResultSet rs=p.executeQuery();
while(rs.next())
{
	String str=rs.getString(1)+", "+rs.getInt(2)+", " +rs.getInt(3)+ ", "+rs.getDouble(4);
	System.out.println(str);
}
p.close();
c.close();
	}

}
