package se.artius.eclectic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.repository.PlayerMockRepository;
import se.artius.eclectic.repository.PlayerRepository;
import se.artius.eclectic.service.PlayerService;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService service;

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/players")
    public List<Player> all() {
        return service.getAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/players")
    public Player newPlayer(@RequestBody Player newEmployee) {
        //return repository.save(newEmployee);
        return null;
    }

    // Single item

    @GetMapping("/players/{id}")
    public Player one(@PathVariable Integer id) {

        return service.getById(id);
        //.orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/players/{id}/{course}/{hole}")
    Player updateScore(@RequestBody Integer score, @PathVariable Integer id, @PathVariable String course, @PathVariable Integer hole) {

        System.out.println("Player: " + id + " Course: " + course + " Hole: " + hole);
        Player player = service.getById(id);
        player.getScoreCard(course).relockAndUpdateScore(hole, score);
        return player;
    }

        /*
        @PutMapping("/players/{id}")
        Player replaceEmployee(@RequestBody Player newEmployee, @PathVariable Integer id) {

            return repository.get(id)
                    .map(employee -> {
                        employee.setName(newEmployee.getName());
                        employee.setRole(newEmployee.getRole());
                        return repository.save(employee);
                    })
                    .orElseGet(() -> {
                        newEmployee.setId(id);
                        return repository.save(newEmployee);
                    });
        }

        @DeleteMapping("/employees/{id}")
        void deleteEmployee(@PathVariable Long id) {
            repository.deleteById(id);
        }
        */
}
