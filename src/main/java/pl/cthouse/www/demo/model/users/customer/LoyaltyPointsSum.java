package pl.cthouse.www.demo.model.users.customer;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class LoyaltyPointsSum {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    @MapsId
    private Customer customer;

    private Long sum;

    @DateTimeFormat(pattern = "HH:mm:ss, dd-MM-yyyy")
    private LocalDateTime lastUpdated;
}
