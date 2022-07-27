package se.artius.eclectic.service;

import org.springframework.stereotype.Service;
import se.artius.eclectic.domain.Hole;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.domain.ScoreCard;
import se.artius.eclectic.repository.PlayerMockRepository;
import se.artius.eclectic.repository.PlayerRepository;

import java.util.*;

@Service
public class LeaderboardService {

    private final PlayerRepository playerRepository = new PlayerMockRepository();

    public LeaderboardService() {

    }

    public List<Player> getLeaderboard() {
        List<Player> result = playerRepository.getAll();
        result.sort(Comparator.comparingInt(Player::getTotal));
        return result;
    }

    public List<Player> getLeaderboardMasters() {
        List<Player> result = playerRepository.getAll();
        result.sort(Comparator.comparingInt(Player::getMastersTotal));
        return result;
    }

    public List<Player> getLeaderboardNew() {
        List<Player> result = playerRepository.getAll();
        result.sort(Comparator.comparingInt(Player::getNewTotal));
        return result;
    }


}
