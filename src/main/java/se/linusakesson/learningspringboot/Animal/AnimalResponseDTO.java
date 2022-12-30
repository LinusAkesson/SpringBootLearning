package se.linusakesson.learningspringboot.Animal;

import lombok.Value;

@Value
public class AnimalResponseDTO {
    private Integer id;
    private String name;
    private String animal;
    private Integer age;
}
