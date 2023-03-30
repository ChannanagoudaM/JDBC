package empProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
PreparedStatement p=c.prepareStatement("insert into employee values(?,?,?,?)");
Scanner sc=new Scanner(System.in);
System.out.println("enetr the employee name you want to add");
String name=sc.next();
p.setString(1, name);
System.out.println("enter employee id");
int id=sc.nextInt();
p.setInt(2, id);
System.out.println("enter employee age");
int age=sc.nextInt();
p.setInt(3, age);
System.out.println("enter employee sal");
double sal=sc.nextDouble();
p.setDouble(4, sal);
p.execute();
System.out.println("updated");
p.close();
c.close();
	}

}
