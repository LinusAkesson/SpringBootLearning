package se.linusakesson.learningspringboot.Animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AnimalConfig {

    private final AnimalRepository animalRepository;

    public AnimalConfig(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            AnimalEntity animalEntity = new AnimalEntity(
                "Ernst",
                "Kossa",
                26
            );
            AnimalEntity animalEntity1 = new AnimalEntity(
                    "Linus",
                    "Katt",
                    260
            );
            animalRepository.saveAll(List.of(animalEntity, animalEntity1));
        };
    }
}
