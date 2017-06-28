package actions;

import com.opensymphony.xwork2.ActionSupport;
import models.BookingVO;
import services.BookingService;

public class BookingAction extends ActionSupport{

	private static final long serialVersionUID = 6324023438415952528L;
	
	// Do not create new object. Struts2 will create one by taking up form fields and assign it to this reference
	private BookingVO bookingVO;
	
	private BookingService bookingService = new BookingService();	
	
	public String execute(){
		// Just for debugging
		System.out.println("Date: " + bookingVO.getDate());
		
		// Call the bookMeetingRoom method to book. Pass the bookingVO which has the details
		bookingService.book(bookingVO);
		return "success";
	}

	// Need these getters and setters
	public BookingVO getBookingVO() {
		return bookingVO;
	}

	public void setBookingVO(BookingVO bookingVO) {
		this.bookingVO = bookingVO;
	}

}
