package com.revature.auth;

import com.revature.DAOimp.EmployeeDAOImp;
import com.revature.objects.Employee;

public class AuthenticateEmployee {
	EmployeeDAOImp empDao = new EmployeeDAOImp();

	public Employee authenticateUser(String username, String password) {

		Employee employee = empDao.searchEmpsByUsername(empDao.getAllEmployees(), username);

		if (password.equals(employee.getPASS_WORD())) {
			return employee;
		}

		return null;
	}

}
