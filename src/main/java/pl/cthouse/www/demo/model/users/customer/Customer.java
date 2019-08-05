package pl.cthouse.www.demo.model.users.customer;

import lombok.*;
import pl.cthouse.www.demo.model.users.User;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 64)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    private List<LoyaltyEvent> loyaltyEventList;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private LoyaltyPointsSum loyaltyPointsSum;

    @Override
    public String getUsername() {
        return email;
    }
}
