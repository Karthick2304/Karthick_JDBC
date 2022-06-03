package mysql2java;

import java.sql.*;

public class sql {
	public static void main(String args[])
	{
	
	try
	{ 
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthick","root","@Karthick2304");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("describe prodt");
	while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	}
	catch(Exception e)
	{
	System.out.println(e.toString());}

}
}
