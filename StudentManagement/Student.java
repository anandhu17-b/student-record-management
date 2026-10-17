package StudentManagement;

public class Student {
	private String id;
	private String name;
	private String course;
	
	Student(String id , String name , String course){
		
		this.id = id;
		this.name = name;
		this.course = course;
		
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	
	public String toString() {
		return "ID: " + id + " Name: " + name + " Course: " + course;
	}
      
}
