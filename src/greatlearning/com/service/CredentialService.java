package greatlearning.com.service;
import java.util.Random;

import greatlearning.com.model.Department;
import greatlearning.com.model.Employee;

public class CredentialService{
	public String genarateEmail(Employee employee, Department department) {
	String email = employee.getFirstName()+employee.getLastName()+
			"@"+department.getDepartmentName()+".company.com";
	return email;
	}
public String generatePassword(){
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>)";

	String values = capitalLetters + smallLetters + numbers + specialCharacters;
	Random objran= new Random();
	char [] password = new char[8];
	for(int i=0; i<8;i++) {
		password[i]= values.charAt(objran.nextInt(values.length()));
	}
	return password.toString();
}
	public void showCredentails(String email, String password) {
		System.out.println(email+" "+password);
	}
}	

