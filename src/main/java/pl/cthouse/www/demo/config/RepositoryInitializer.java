package pl.cthouse.www.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.cthouse.www.demo.model.Customer;
import pl.cthouse.www.demo.model.Employee;
import pl.cthouse.www.demo.repository.CustomerRepository;
import pl.cthouse.www.demo.repository.EmployeeRepository;

@Component
public class RepositoryInitializer implements InitializingBean {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        if(customerRepository.findAll().isEmpty() == true)
        {
            try {
                Customer customer1 = new Customer();
                Employee employee2 = new Employee();
                employee2.setUsername("CzyDzialam");
                employeeRepository.save(employee2);
                customerRepository.save(customer1);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
