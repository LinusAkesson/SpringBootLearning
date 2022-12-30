package se.linusakesson.learningspringboot.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<AnimalResponseDTO> all() {
        return animalService.all()
                .stream()
                .map(AnimalController::animalEntityToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AnimalEntity getOne(@PathVariable("id") Integer id) {
        return animalService.getById(id);
    }

    private static AnimalResponseDTO animalEntityToDTO(AnimalEntity animalEntity) {
        return new AnimalResponseDTO(
                animalEntity.getId(),
                animalEntity.getName(),
                animalEntity.getAnimal(),
                animalEntity.getAge()
        );
    }
}
