
import java.sql.*;
public class Insert {
	public static void main (String[]args) throws Exception {
		updatedata();
	}
//	public static void getData() throws Exception{
//		String url="jdbc:mysql://127.0.0.1:3306/name";
//		String username="root";
//		String password="2507";
//		String query="select * from std"; //insert into std values(?,?,?)
//		Connection con = DriverManager.getConnection(url,username,password);
////		PreparedStatement pst=con.prepareStatement(query);
//		Statement pst= con.createStatement();
//		
////		pst.setString(1, "sri");
////		pst.setInt(2, 22);
////		pst.setString(3,"sri@gmail.com");
////		pst.setString(1, "s");
////		pst.setInt(2, 2);
////		pst.setString(3,"s@gmail.com");
////		pst.executeUpdate();
//		
//		ResultSet rst=pst.executeQuery(query);
//		while(rst.next()) {
//			System.out.println("username:"+rst.getString(1));
//			System.out.println("userid:"+rst.getInt(2));
//			System.out.println("useremail:"+rst.getString(3));
//			System.out.println("");
//		}
//		con.close();
//		
//	}
	public static void updatedata()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/name";
		String username="root";
		String password="2507";
		int age=2;
		String Query="update std set name ='asd',email='d@gmail.com' where age=2";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}
}
