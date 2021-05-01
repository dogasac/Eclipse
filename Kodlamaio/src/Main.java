
public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Doğa","Saçıkara","1234","dogasa");
		UserManager userManager = new UserManager();
		userManager.delete(user);
		userManager.add(user);
		userManager.update(user);
		
		
		System.out.println("------");
		
		Student student = new Student(2,"Özlem","On","23456","ozlemon","Java");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		
		System.out.println("------");
		
		Instructor instructor = new Instructor(3,"Engin", "Demiroğ","454545","engindemirog","Zorlanmadan Gelişemezsin");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
	}
	
	
	

		
	

}
