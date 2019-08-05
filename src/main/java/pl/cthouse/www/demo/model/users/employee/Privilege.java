package pl.cthouse.www.demo.model.users.employee;

import lombok.Data;
import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;
}
