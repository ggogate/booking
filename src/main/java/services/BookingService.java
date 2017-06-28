package services;

import models.BookingVO;
import dao.BookingDAO;

public class BookingService {

	private BookingDAO bookingDAO = new BookingDAO();
	
	public void book(BookingVO bookingVO) {
		bookingDAO.insert(bookingVO);
	}

}
