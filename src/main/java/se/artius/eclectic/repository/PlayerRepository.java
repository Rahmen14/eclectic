package se.artius.eclectic.repository;

import se.artius.eclectic.domain.Player;

import java.util.List;

public interface PlayerRepository {

    List<Player> getAll();
    Player get(int id);

}
