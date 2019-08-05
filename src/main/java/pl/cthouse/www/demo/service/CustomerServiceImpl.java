package pl.cthouse.www.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cthouse.www.demo.model.users.customer.Customer;
import pl.cthouse.www.demo.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional getCustomer(UUID id) {
        return Optional.ofNullable(customerRepository.findCustomerById(id));
    }

    @Override
    public List<Customer> getAllCustomersList() {
        return customerRepository.findAll();
    }
}
