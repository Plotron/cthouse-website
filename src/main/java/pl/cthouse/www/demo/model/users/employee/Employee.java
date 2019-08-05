package pl.cthouse.www.demo.model.users.employee;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import pl.cthouse.www.demo.model.users.User;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Collection;


@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Valid
    @Size(min = 4, max = 24)
    private String username;

    @Valid
    @Size(min = 4, max = 24)
    private String lastName;

    private String password;     //PIN do logowania nfc

    @Column(length = 12)
    private String phoneNumber;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateStart;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateEnd;

    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
