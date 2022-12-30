package se.linusakesson.learningspringboot.Animal;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<AnimalEntity> all() {
        return animalRepository.findAll();
    }
}
