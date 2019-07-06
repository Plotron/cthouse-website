package pl.cthouse.www.demo.model;

import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Data
public class LoyaltyPointsSum {

    @Id
    @OneToOne(fetch = FetchType.EAGER)
   private Customer customer;

    @Valid
    @Min(0)
    private Long sum;

    @DateTimeFormat(pattern = "HH:mm:ss, dd-MM-yyyy")
    private LocalDateTime lastUpdated;
}
