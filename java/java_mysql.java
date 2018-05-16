import java.sql.*;

public class java_mysql
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection ct = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydata?user=root&passwd=12345&useSSL=true");
			Statement sm = ct.createStatement();
			ResultSet rs = sm.executeQuery("Select * from user_info");
			while(rs.next())
			{
				System.out.println(rs.getString("info_name"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return;
	}
}
