package pl.cthouse.www.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.cthouse.www.demo.model.Customer;
import pl.cthouse.www.demo.model.Employee;
import pl.cthouse.www.demo.model.LoyaltyEvent;
import pl.cthouse.www.demo.repository.CustomerRepository;
import pl.cthouse.www.demo.repository.EmployeeRepository;
import pl.cthouse.www.demo.repository.LoyaltyEventRepository;

@Component
public class RepositoryInitializer implements InitializingBean {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private LoyaltyEventRepository loyaltyEventRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        if(customerRepository.findAll().isEmpty() == true)
        {
            try {
                Customer customer1 = new Customer();

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
