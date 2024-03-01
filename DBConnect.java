/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatask;

/**
 *
 * @author Rw
 */
import java.sql.*;
public class DBConnect {		
        public static void main(String args[]){
            try{
	        //step1 load the driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");
                //step2 create the connection object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Department","root","NKaviya@2003");
                //step3 create the statement object
                Statement stmt=con.createStatement();
                //step4 execute query
                //ResultSet rs=stmt.executeQuery("create table employee (empid number(4), empname varchar2(25))");
                stmt.executeUpdate("insert into dep_info values(4, 'IT')");
                stmt.executeUpdate("update dep_info set dep_name='IT' where dep_code=3");
                //ResultSet rs=stmt.executeQuery("select * from employee");
                //while(rs.next())
                //System.out.println(rs.getInt(1)+" "+rs.getString(2));
                //ResultSet rs=stmt.executeQuery("delete from employee");
                //step5 close the connection object
            	
	}catch(Exception e){ System.out.println(e);} 		
       } 	
}
