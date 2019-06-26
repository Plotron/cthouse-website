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
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy =  "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    //login to email, OAuth
    //password

//    @OneToMany(fetch = FetchType.LAZY)
//    private List<LoyaltyEvent> loyaltyEventList;

}
