package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList <Student> stud = new ArrayList < >();
	String id;
	String name;
	String course;
	int choice ;
	int flag = 0;
	

	System.out.println("========STUDENT MANAGEMENT SYSTEM========");
	System.out.println("1.Add Student");
	System.out.println("2.Display All Student");
	System.out.println("3.Search Student by ID");
    System.out.println("4.Search Student by Name");
    System.out.println("5.Update Student");
    System.out.println("6.Delete Student by ID");
    System.out.println("7.Display Student by Course");
    System.out.println("8.Count Students");
    System.out.println("9.Display First Student");
    System.out.println("10.Display Last Student");
    System.out.println("11.Check Student Exist");
    System.out.println("12.Delete Student by Course");
    System.out.println("13.Display Student in Reverse Order");
    System.out.println("14.Clear All Students");
    System.out.println("15.Exit");
    
	do {
    System.out.println("Enter Your Choice");
     choice = sc.nextInt();
    
   
    
  
    switch (choice) {
    case 1:
    	flag = 0;
    	System.out.println("Enter Student ID: ");
    	id = sc.next();
    	  for(Student s : stud) {
          	if(s.getId().equals(id)) {
          		flag = 1; 
          	}
          	}
          if(flag == 1) {
        	  System.out.println("Student ID Already Exist");
        		System.out.println("Student cannot be Added"); 
          }
          else {
		    	System.out.println("Enter Student Name");
		    	name = sc.next();
		    	System.out.println("Enter Course");
		    	course = sc.next();
		    	stud.add(new Student(id , name , course));
               }
       	break;
    case 2:
    	System.out.println("----Student List----");
    	if(stud.isEmpty()) {
    		System.out.println("No Student Data");
    	}
    	for(Student s : stud) {
    		System.out.println("ID: " + s.getId() + " Name " + s.getName() + " Course " + s.getCourse());
    	 }
    	break;
    case 3:
    	System.out.println("Enter the Student ID");
    	id =sc.next();
    	flag = 0;
    	for(Student s : stud) {
    		if(s.getId().equals(id)) {
    			System.out.println("ID: " + s.getId() + " Name: " + s.getName() + " Course " +  s.getCourse());
    			flag = 1;
    		}
    	}
    	if(flag == 0) {
    		System.out.println("Student ID not Found");
    	}
    	
    	break;
    case 4:
    	System.out.println("Enter Student Name: ");
    	name = sc.next();
    	flag = 0;
    	for(Student s : stud) {
    		if(s.getName().equalsIgnoreCase(name)) {
    			System.out.println("ID: " + s.getId() + " Name: " + s.getName() + " Course " +  s.getCourse());
    			flag = 1;
    		}
    	}
    	if(flag == 0) {
    	      System.out.println("No  Student Present in that Name");
    	}
    	break;
    case 5:
    	System.out.println("Enter the Student ID");
    	id = sc.next();
    	flag = 0;
    	for(Student s : stud) {
    		if(s.getId().equals(id)) {
    			flag = 1;
    		}
    	if(flag == 1) {
    	System.out.println("1.Update Name");
    	System.out.println("2.Update Course");
    	choice = sc.nextInt();
    	switch(choice) {
    	case 1:
    		System.out.println("Enter New Name:");
    		name = sc.next();
    		s.setName(name);
    		System.out.println("ID: " + s.getId() + " Name: " + s.getName() + " Course:" + s.getCourse());
    		System.out.println();
    		System.out.println("------Name Updated Successfully-----");
    		break;
    	case 2:
    		System.out.println("Enter New Course:");
    		course = sc.next();
    		s.setCourse(course);
    		System.out.println("ID: " + s.getId() + " Name: " + s.getName() + " Course:" + s.getCourse());
    		System.out.println();
    		System.out.println("------Course Updated Successfully-----");
    		break;
    		default:
    			System.out.println("Invalid Choice");
    			break;
    	}
    	}
    	else {
    		System.out.println("---- NO Students Found ----");
    	}
    	}
			break;
    	case 6:
    		System.out.println("Enter Student ID you want to Delete:");
    		String idDlt = sc.next();// cant use the normal declared id that is also reassingned cause removeIf contains lamda
    	   boolean dlt = stud.removeIf(s -> s.getId().equals(idDlt)); // re
    	   if(dlt == true) {
    		   System.out.println("Student Deleted Succesfully");
    	   }
    	   else {
    		   System.out.println("Student not Found");
    	   }
    	   break;
    	case 7:
    		System.out.println("Enter the Course:");
    		course = sc.next();
    		flag = 0;
    		for(Student s : stud) {
    			if(s.getCourse().equalsIgnoreCase(course)) {
    				System.out.println("ID: " + s.getId() + " Name: " + s.getName() + " Course:" + s.getCourse());
    				flag =1;
    			}
    		}
    		if(flag == 0) {
    			System.out.println("No Student found Studing " + course);
    		}
    		break;
    	case 8:
    		System.out.println("Total Students " + stud.size());
    		break;
    	case 9:
    		if(stud.size() == 0) {
    			System.out.println("No Sudent Details Present");
    		}
    		else {
    		    System.out.println("First Student Details: ");
    		    System.out.println(stud.get(0));
    		}
    		break;
    	case 10:
    		if(stud.size() == 0) {
    			System.out.println("No Sudent Details Present");
    		}
    		else {
	    		System.out.println("Last Student Details:");
	    		System.out.println(stud.getLast());
    		}
        break;
    	case 11:
    		System.out.println("Enter Student ID:");
    		id = sc.next();
    		flag = 0;
    		for(Student s : stud) {
    			if(s.getId().contains(id)) {
    				flag = 1;
    			}
    		}
    		if(flag == 1) {
    			System.out.println("Student Exist");
    		}
    		else {
    			System.out.println("Student does not Exist");
    		}
		break;
    	case 12:
    		System.out.println("Enter the Course:");
    		String dltCourse = sc.next();
    		boolean dlt2 = stud.removeIf(s -> s.getCourse().equalsIgnoreCase(dltCourse));
    		if(dlt2 == true) {
    			System.out.println("All " + dltCourse + " Students deleted Sucessfully");
    		}
    		else {
    			System.out.println("--No Matching Course Found-- ");
    		}
    		break;
    	case 13:
    		System.out.println("---Student Details in Reverse Order---");
    		//System.out.println(stud.reversed());
    		for(int i = stud.size() - 1; i >= 0; i --) {
    			System.out.println("ID: " + stud.get(i).getId() + " Name: " + stud.get(i).getName() + " Course " + stud.get(i).getCourse());
    		}
    		break;
    	case 14:
    		System.out.println("Are you Sure you want to delete all students");
    		System.out.println("1.Yes");
    		System.out.println("2.No");
    		choice = sc.nextInt();
    		switch(choice) {
    		case 1:
    			//stud.removeAll(stud);
    			stud.clear();
    			System.out.println("All Student Deleted Succesfully");
    			break;
    		case 2:
    			System.out.println("List does not Cleared");
    		}
    		break;

	    case 15:
	    		System.out.println("Thank You for uisng Student Management System!");
		break;
		default:
			System.out.println("Invalid Choice");
			break;
    }	
	}while(choice != 15);
    }
	}




