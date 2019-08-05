package pl.cthouse.www.demo.service;

import pl.cthouse.www.demo.model.users.employee.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> getById(Long id);

    List<Employee> getAllEmployeesList();
}
