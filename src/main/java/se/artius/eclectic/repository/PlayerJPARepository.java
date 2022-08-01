package se.artius.eclectic.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import se.artius.eclectic.domain.Player;

public interface PlayerJPARepository extends CrudRepository<Player, Integer> {

    List<Player> findByLastname(String lastname);
    List<Player> findAll();
    Player findById(int id);
}