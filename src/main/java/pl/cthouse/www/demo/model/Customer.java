package pl.cthouse.www.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "customers")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id = UUID.randomUUID();

    //login to nr_tel
    //password

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "customers_events",
                joinColumns = @JoinColumn(name = "customers_id"),
                inverseJoinColumns = @JoinColumn(name = "event_id"))
    private List<Event> eventList;


}
