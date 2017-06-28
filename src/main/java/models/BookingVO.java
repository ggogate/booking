package models;

public class BookingVO {

	private String emp_id;
	private String date;
	private String meeting_room;
	
	
	public BookingVO() {
	
	}
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMeeting_room() {
		return meeting_room;
	}
	public void setMeeting_room(String meeting_room) {
		this.meeting_room = meeting_room;
	}
	
}
