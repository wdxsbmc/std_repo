import java.sql.*;

public class java_mysql
{
	public static void main(String arg[])
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user ="root";
			String password = "12345";
			String url = "jdbc:mysql://localhost:3306/mydata?useSSL=false";
			Connection ct = DriverManager.getConnection(url,user,password);
			Statement sm = ct.createStatement();
			ResultSet rs = sm.executeQuery("Select * from user_info");
			while(rs.next())
			{
				System.out.println(rs.getString("info_name"));
			}
			/*
			String url="jdbc:mysql://127.0.0.1:3306/mydata?useSSL=false";
	 		String username="root";
	 		String password="12345";
	 		Connection ct = DriverManager.getConnection(url, username, password);
	 		Statement sm = ct.createStatement();
	 		ResultSet rs = sm.executeQuery("Select * from user_info");
			*/
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
