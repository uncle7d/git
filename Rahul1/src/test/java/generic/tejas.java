package generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class tejas {
	
	@Test
	public void tejs() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/selenium";
		String username="root";
		String password="Root";
		
		Connection connect=DriverManager.getConnection(url, username, password);
		Statement State = connect.createStatement();
		ResultSet output = State.executeQuery("select * from heros");
		System.out.println(output);
		output.next();
		String name = output.getString("name");
		System.out.println(name);
		
	}

}
