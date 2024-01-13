package boeing.com.export.document.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boeing.com.export.document.model.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{
	//ArrayList<Employee>findAllEmployee();

}