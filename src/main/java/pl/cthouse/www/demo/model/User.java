package pl.cthouse.www.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role>roles;

    @Valid
    @Size(min = 4, max = 24)
    private String firstname;

    @Size(min = 4, max = 24)
    private String surname;

    //TODO [A] -> [P] może warto jakieś zabezpieczenia czy coś | można również dodać wpisanie podwójne hasła. @Transient nieodwzorowuje w bazie danych
    private String password;


}
