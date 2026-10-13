package dao;

import model.Employee;
import model.Product;

public interface Dao {
	
	public void connect();
	
	public void disconnect();

	public Employee getEmployee(int employeeId, String password);
	
	public Product getInvetory(); //First Commit 
}
