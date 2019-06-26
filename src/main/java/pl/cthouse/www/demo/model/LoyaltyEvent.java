package pl.cthouse.www.demo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class LoyaltyEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "HH:mm, dd-MM-yyyy")
    private LocalDateTime timestamp;

    private int loyaltyPointsGranted;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private Customer customer;
}
