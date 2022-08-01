package se.artius.eclectic.service;

import org.springframework.stereotype.Service;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.repository.PlayerJPARepository;

import java.util.Comparator;
import java.util.List;

@Service
public class PlayerService {

    private final PlayerJPARepository playerRepository; // = new PlayerMockRepository();

    public PlayerService(PlayerJPARepository repository) {
        this.playerRepository = repository;
    }

    public List<Player> getAll() {
        List<Player> result = playerRepository.findAll();
        return result;
    }

    public Player getById(int id) {
        return playerRepository.findById(id);
    }

}
