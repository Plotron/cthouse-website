package pl.cthouse.www.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cthouse.www.demo.model.users.employee.Employee;
import pl.cthouse.www.demo.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional getById(Long id) {
        return Optional.ofNullable(employeeRepository.findById(id));
    }

    @Override
    public List<Employee> getAllEmployeesList() {
        return employeeRepository.findAll();
    }
}
