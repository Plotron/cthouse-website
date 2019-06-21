package pl.cthouse.www.demo.service;

import pl.cthouse.www.demo.model.Customer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {

    Optional<Customer> getCustomer(UUID id);

    List<Customer> getAllCustomersList();
}
