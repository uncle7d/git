package generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class second {
      @Test
      public void seond() throws SQLException
      {
    	  String Url="jdbc:mysql://localhost:3306/selenium";
    	  String username="root";
    	  String password="Root";
    	  
    	  Connection connect=DriverManager.getConnection(Url, username, password);
    	  Statement state = connect.createStatement();
    	  ResultSet output = state.executeQuery("select movie from heros;");
    	  System.out.println(output);
    	  output.next();
    	  String movie = output.getString("name");
    	  System.out.println(movie);
    	  
      }
}
