package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "lastname")
    private String lastname;

    @Column (name = "firstname")
    private String firstname;

    @Column(name = "secondname")
    private String secondname;

    @Column (name = "birthdate")
    private String birthdate;

    @Column(name = "gruppa")
    private String gruppa;


}