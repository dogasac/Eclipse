
public class Student extends User {
	
	
	String lesson;

	public Student(int id, String firstName, String lastName, String password, String userName, String lesson) {
		super(id, firstName, lastName, password, userName);
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
}

	
	


	