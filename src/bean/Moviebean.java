package bean;

public class Moviebean {
	private String title;
	private String date;
	private String time;
	private String price;
	public void Movie(String id,String title, String date , String time, String price, String hall,
			byte[] image) 
	{
		// TODO Auto-generated constructor stub
		this.price = price;
		this.time=time;
		this.title = title;
		this.date = date;
		}
	public void Movie(){}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
