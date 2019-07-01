package pl.cthouse.www.demo.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Valid
    @Size(min = 4, max = 24)
    private String username;

    private String password;

    @Size(max = 12)
    private String phoneNumber;

    //PIN do logowania nfc

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateStart;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateEnd;

    private boolean enabled;
}
