package pl.cthouse.www.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "event")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO ?? timestamp??
    private LocalTime localTime;

    private int points;

    private int sub_points;

    //TODO to chyba niżej nie ma sensu ; o PS: rano musze to zobaczyć
    @ManyToMany(mappedBy = "customers_events")
    private List<Customer> customerList;
}
