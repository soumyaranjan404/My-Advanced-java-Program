package emp.data;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
	EmpOperation emp	= EmpOperation.getInstance();
	
//	Date date = Date.valueOf("2024-09-12");
//	boolean b=emp.saveEmployee(new EmployeData(1,"Soumyaranjan",date,20000.00,"xyz@gmail.com","7787059593","HR"));
//	boolean c=emp.saveEmployee(new EmployeData(2,"Raka",date,30000.00,"khz@gmail.com","9937193708","Lead"));
//	boolean d=emp.saveEmployee(new EmployeData(3,"Raja",date,90000.00,"rtm@gmail.com","7896123652","CEO"));
//	boolean e=emp.saveEmployee(new EmployeData(4,"Soni",date,40000.00,"oiu@gmail.com","8547129648","EMP"));
//	boolean f=emp.saveEmployee(new EmployeData(5,"Moni",date,15000.00,"qwe@gmail.com","9637237198","EMP"));
	
System.out.println(emp.updateSalary(3, 80000.00));
	}

}
