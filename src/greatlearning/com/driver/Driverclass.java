package greatlearning.com.driver;
import java.util.Scanner;

import greatlearning.com.model.Department;
import greatlearning.com.model.Employee;
import greatlearning.com.service.CredentialService;

public class Driverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Vishal","kumar");
		System.out.println("Enter your department");
		System.out.println("1. Technical\n2. Admin\n3. HR\n4. Legal");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		Department dept = new Department();
		CredentialService service = new CredentialService();
		switch(choice){
		case 1:
			dept.setDepartmentName("Technical");
			String Password= service.generatePassword();
			String Email= service.genarateEmail(emp, dept);
			service.showCredentails(Email, Password);
			break;
		case 2:
			dept.setDepartmentName("Admin");
			String Password1= service.generatePassword();
			String Email1= service.genarateEmail(emp, dept);
			service.showCredentails(Email1, Password1);
			break;
		case 3:
			dept.setDepartmentName("HR");
			String Password2= service.generatePassword();
			String Email2= service.genarateEmail(emp, dept);
			service.showCredentails(Email2, Password2);
			break;
		case 4:
			dept.setDepartmentName("Legal");
			String Password3= service.generatePassword();
			String Email3= service.genarateEmail(emp, dept);
			service.showCredentails(Email3, Password3);
			break;
		default:
			System.out.println("Invalid Entery");
			break;
		}
	}

}
