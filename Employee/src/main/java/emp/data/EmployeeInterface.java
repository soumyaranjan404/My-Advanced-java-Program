package emp.data;

import java.util.List;

public interface EmployeeInterface {
	public boolean saveEmployee(EmployeData emp);
	public boolean deleteById( int id);
	public List<EmployeData> findAllEmployees();
	public EmployeData findEmployeeById(int id);
	public EmployeData findEmployeesByPhoneNumber(String numb);
	public boolean updateSalary(int id , double sal);
	public boolean UpdateEmployee(int id , EmployeData emp);
}
