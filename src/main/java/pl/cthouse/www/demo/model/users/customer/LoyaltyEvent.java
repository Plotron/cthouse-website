package pl.cthouse.www.demo.model.users.customer;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import pl.cthouse.www.demo.model.users.customer.Customer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class LoyaltyEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "HH:mm:ss, dd-MM-yyyy")
    private LocalDateTime timestamp;

    private int loyaltyPointsGranted;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
}
