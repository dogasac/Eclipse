
public class Instructor extends User{
	
	String detail;

	public Instructor(int id, String firstName, String lastName, String password, String userName, String detail) {
		super(id, firstName, lastName, password, userName);
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}

	

	