package pl.cthouse.www.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.cthouse.www.demo.model.users.customer.Customer;
import pl.cthouse.www.demo.model.users.employee.Employee;
import pl.cthouse.www.demo.model.users.customer.LoyaltyEvent;
import pl.cthouse.www.demo.model.users.customer.LoyaltyPointsSum;
import pl.cthouse.www.demo.repository.CustomerRepository;
import pl.cthouse.www.demo.repository.EmployeeRepository;
import pl.cthouse.www.demo.repository.LoyaltyEventRepository;
import pl.cthouse.www.demo.repository.LoyaltyPointsSumRepository;

@Component
public class RepositoryInitializer implements InitializingBean {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private LoyaltyEventRepository loyaltyEventRepository;

    @Autowired
    private LoyaltyPointsSumRepository loyaltyPointsSumRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        if(customerRepository.findAll().isEmpty() == true)
        {
            try {
                Customer customer1 = new Customer();
                LoyaltyPointsSum loyaltyPointsSum1 = new LoyaltyPointsSum();
                loyaltyPointsSum1.setCustomer(customer1);
                loyaltyPointsSumRepository.save(loyaltyPointsSum1);

                customerRepository.save(customer1);
                Employee employee1 = new Employee();
                employee1.setUsername("Johny");
                employee1.setPassword("easyPass");
                employee1.isEnabled();
                employeeRepository.save(employee1);

                LoyaltyEvent loyaltyEvent1 = new LoyaltyEvent();
                loyaltyEvent1.setLoyaltyPointsGranted(1);
                loyaltyEvent1.setCustomer(customer1);
                loyaltyEventRepository.save(loyaltyEvent1);

            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
