package pl.cthouse.www.demo.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //login to email, OAuth
    //password

    @OneToMany(fetch = FetchType.LAZY)
    private List<LoyaltyEvent> loyaltyEventList;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private LoyaltyPointsSum loyaltyPointsSum;

}
