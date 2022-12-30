package se.linusakesson.learningspringboot.Animal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "Animal")
@Table(name = "animal")
@Getter
@Setter
@NoArgsConstructor
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "animal")
    private String animal;

    @Column(name = "age")
    private Integer age;


    public AnimalEntity(String name, String animal, Integer age) {
        this.age = age;
        this.animal = animal;
        this.name = name;
    }
}
