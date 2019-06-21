package pl.cthouse.www.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.cthouse.www.demo.model.Customer;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    Customer findCustomerById(UUID id);
}
