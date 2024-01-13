package boeing.com.export.document.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boeing.com.export.document.model.Employee;
import boeing.com.export.document.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
		@Autowired
		EmployeeRepository empRepo;
	List<Employee> empList = new CopyOnWriteArrayList<Employee>();

	public Object getAllEmployee() {
		return empRepo.findAll();
	}

	public void save(Employee employee) {
		empList.add(employee);
		/*jdbc.execute(
				"INSERT INTO Employee valuse(" + employee.getId() + "," + employee.getName() + "," + employee.getDob()
						+ "," + employee.getMobile() + "," + employee.getAddress() + "," + employee.getEmail());
	}*/}

	public Employee getById(long id) {
		for (Employee emp : empList) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public void deleteViaId(long id) {
		for (Employee emp : empList) {
			if (emp.getId() == id) {
				empList.remove(emp);
			}
		}

	}

	public void update(Employee employee) {
		for (Employee emp : empList) {
			if (emp.getId() == employee.getId()) {
				emp.setEmail(employee.getEmail());
				emp.setName(employee.getName());
				emp.setAddress(employee.getAddress());
				emp.setMobile(employee.getMobile());
				emp.setDob(employee.getDob());
			}
		}

	}

}
