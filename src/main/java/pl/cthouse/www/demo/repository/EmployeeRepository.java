package pl.cthouse.www.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.cthouse.www.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByUsername(String username);
}
