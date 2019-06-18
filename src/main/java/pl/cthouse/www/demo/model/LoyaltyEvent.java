package pl.cthouse.www.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoyaltyEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "HH:mm, dd-MM-yyyy")
    private LocalDateTime timestamp;

    private int loyaltyPointsGranted;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
}
