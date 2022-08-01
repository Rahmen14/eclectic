package se.artius.eclectic.service;

import org.springframework.stereotype.Service;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.repository.PlayerJPARepository;

import java.util.*;

@Service
public class LeaderboardService {

    private final PlayerJPARepository playerRepository; // = new PlayerMockRepository();

    public LeaderboardService(PlayerJPARepository repository) {
        this.playerRepository = repository;
    }

    public List<Player> getLeaderboard() {
        List<Player> result = playerRepository.findAll();
        result.sort(Comparator.comparingInt(Player::getTotal));
        return result;
    }

    public List<Player> getLeaderboardMasters() {
        List<Player> result = playerRepository.findAll();
        result.sort(Comparator.comparingInt(Player::getMastersTotal));
        return result;
    }

    public List<Player> getLeaderboardNew() {
        List<Player> result = playerRepository.findAll();
        result.sort(Comparator.comparingInt(Player::getNewTotal));
        return result;
    }


}
