package com.SpringMVC.EmployeeProject.Employee;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AppController {
	@RequestMapping("/list_employee")
	public String listEmployee(Model model)
	{
		EmployeeDetails details=new EmployeeDetails();
		List<Employee> listEmployee1=details.getemployeeDetails();
		model.addAttribute("employees",listEmployee1);
		return "employee";
		
	}

}
//@Controller
//public class AppController {
//     
//    @RequestMapping("/list_contact")
//    public String listContact(Model model) {
//         
//        ContactBusiness business = new ContactBusiness();
//        List<Contact> contactList = business.getContactList();
//         
//        model.addAttribute("contacts", contactList);       
//         
//        return "contact";
//    }
//}