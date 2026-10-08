package level3;
import java.sql.*;
import java.util.Scanner;
public class Database4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Accepted");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chettinad", "root", "12345");
		    System.out.println("Connection Success");
		    //------Statement --> purpose --> to write sql queries
		    Statement st=con.createStatement();
		    
		    System.out.println("Update Student Data:");
		    System.out.println("Enter rno , sname and mark:");
		    int rno=scan.nextInt();
		    String sname=scan.next();
		    float mark=scan.nextFloat();
		    
		    int result=st.executeUpdate("update student set sname='"+sname+"',mark="+mark+ "where regno="+rno);
		    if(result>0)
		    	System.out.println("successfully updated check your db");
		    else
		    	System.out.println("no records found in db");
		    st.close(); con.close();
		}
		catch(Exception e)
		{
			System.out.println("Error Reason:"+e.toString());
		}
		
	}

}
