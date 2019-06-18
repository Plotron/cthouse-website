package pl.cthouse.www.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Valid
    @Size(min = 4, max = 24)
    private String username;

    @Size(max = 9)
    private String phoneNumber;

    //TODO PIN do logowania nfc

    //początek / koniec pracy
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateStart;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateEnd;

    private boolean enabled;
}