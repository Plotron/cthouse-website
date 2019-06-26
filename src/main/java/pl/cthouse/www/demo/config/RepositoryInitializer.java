package pl.cthouse.www.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.cthouse.www.demo.model.Customer;
import pl.cthouse.www.demo.model.Employee;
import pl.cthouse.www.demo.model.LoyaltyEvent;
import pl.cthouse.www.demo.repository.CustomerRepository;
import pl.cthouse.www.demo.repository.EmployeeRepository;
import pl.cthouse.www.demo.repository.LoyaltyEventRepository;

@Configuration
public class RepositoryInitializer {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private LoyaltyEventRepository loyaltyEventRepository;

    @Bean
    InitializingBean init(){

        return () -> {

            if (customerRepository.findAll().isEmpty() == true)
            {
                try {

                    Customer customer1 = new Customer();

                    Employee employee1 = new Employee();
                    employee1.setUsername("Johny");
                    employee1.setPassword("easyPass");
                    employee1.isEnabled();
                    employeeRepository.save(employee1);

                    LoyaltyEvent loyaltyEvent1 = new LoyaltyEvent();
                    loyaltyEvent1.setLoyaltyPointsGranted(1);
                    loyaltyEvent1.setCustomer(customer1);
                    loyaltyEventRepository.save(loyaltyEvent1);

                    customerRepository.save(customer1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
