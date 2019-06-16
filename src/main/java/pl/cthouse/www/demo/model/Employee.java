package pl.cthouse.www.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "employees")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Valid
    @Size(min = 4, max = 24)
    private String nickname;

    @Size(max = 9)
    private int number_phone;

    //TODO PIN do logowania

    //początek / koniec pracy
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date_start;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date_end;
}
