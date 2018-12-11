package com.vijay.association;

import java.util.ArrayList;
import java.util.List;

public class DepartmentAssociationExample {
	

	public static void main(String[] args) {
		
		Students stud1 = new Students("Ram1", 1);
		Students stud2 = new Students("Ram3", 2);
		Students stud3 = new Students("Ra3", 3);
		Students stud4 = new Students("Ra4", 4);
		Students stud5 = new Students("Ram5", 5);
		Students stud6 = new Students("Ra6", 6);
		Students stud7 = new Students("Ram7", 7);
		Students stud8 = new Students("Ram8", 8);
		
		List<Students> scienceStudents = new ArrayList<Students>();
		scienceStudents.add(stud1);
		scienceStudents.add(stud2);
		scienceStudents.add(stud3);
		
		List<Students> commerceStudents = new ArrayList<Students>();
		commerceStudents.add(stud4);
		commerceStudents.add(stud5);
		commerceStudents.add(stud6);
		
		List<Students> artsStudents = new ArrayList<Students>();
		artsStudents.add(stud7);
		artsStudents.add(stud8);
		
		
		Departments department1 = new Departments("Science", 100, scienceStudents);
		Departments department2 = new Departments("Commerce", 200, commerceStudents);
		Departments department3 = new Departments("Arts", 300, artsStudents);
		
		List<Departments> departmentList = new ArrayList<Departments>();
		departmentList.add(department1);
		departmentList.add(department2);
		departmentList.add(department3);
		
		//College college = new College("ABESIT", departmentList);
		College.fetchAllDepartmentsWithStudengtDetails("ABESIT", departmentList);
		System.out.println("College Objcet");
		//System.out.println(college);
		
		
		

	}

}
