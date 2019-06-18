package pl.cthouse.www.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 50)
    private String type;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role(String type)
    {
        this.type = type;
    }

    //We have 3 types to choose one for each users
    public enum Types{
        Role_Admin,
        Role_Eployee,
        Role_User
    }
}
