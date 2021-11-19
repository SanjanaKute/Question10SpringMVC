package com.SpringMVC.EmployeeProject.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails
{
	public List<Employee> getemployeeDetails()
	{
		List<Employee> listEmployee=new ArrayList<>();
		listEmployee.add(new Employee(1,"Amit",30000));
		listEmployee.add(new Employee(2,"Ajeet",40000));
		listEmployee.add(new Employee(3,"James",50000));
		listEmployee.add(new Employee(4,"Sonoo",70000));
		listEmployee.add(new Employee(5,"Sarfraz",60000));
		listEmployee.add(new Employee(6,"Bob",80000));
		listEmployee.add(new Employee(7,"Rahul",90000));
		listEmployee.add(new Employee(8,"Rakesh",25000));
		listEmployee.add(new Employee(9,"Udit",35000));
		listEmployee.add(new Employee(10,"Jai",45000));
		listEmployee.add(new Employee(11,"Nikhil",55000));
		listEmployee.add(new Employee(12,"Somesh",65000));
		listEmployee.add(new Employee(13,"Rajesh",75000));
		listEmployee.add(new Employee(14,"Ankit",85000));
		return listEmployee;

		
	}
	
	
}
// public List<Employee> getContactList() {
//	        List<Contact> listContact = new ArrayList<>();
//	         
//	        listContact.add(new Contact("Marry John", "marry.john@gmail.com", "USA"));
//	        listContact.add(new Contact("Tom Smith", "tomsmith@outlook.com", "England"));
//	        listContact.add(new Contact("John Purcell", "john123@yahoo.com", "Australia"));
//	        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "India"));
//	         
//	        return listContact;
//	    }
//	}