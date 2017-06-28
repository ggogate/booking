package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import models.BookingVO;

public class BookingDAO {
	
	public void insert(BookingVO bookingVO){
		try{
			Class.forName("com.mysql.jdbc.Driver");

			// 	Change database parameters accordingly
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/booking","user","pass");
		 
			//  Change tablename accordingly
			String s = "insert into bookings values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1, bookingVO.getEmp_id());
			ps.setString(2, bookingVO.getDate());
			ps.setString(3, bookingVO.getMeeting_room());
			// use setInt() etc. depending on type of column
			
			ps.executeUpdate();
			con.commit();
		 
			ps.close();
			con.close();
		 
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}
	
	public void remove(BookingVO bookingVO){
		// Add delete query
	}
}
