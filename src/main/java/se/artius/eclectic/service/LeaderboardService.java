package se.artius.eclectic.service;

import org.springframework.stereotype.Service;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.domain.ScoreCard;

import java.util.*;

@Service
public class LeaderboardService {

    public LeaderboardService() {

    }

    public List<Player> getLeaderboard() {
        List<Player> result = createMockdata();
        result.sort(Comparator.comparingInt(Player::getTotal));
        return result;
    }

    public List<Player> getLeaderboardMasters() {
        List<Player> result = createMockdata();
        result.sort(Comparator.comparingInt(Player::getMastersTotal));
        return result;
    }

    public List<Player> getLeaderboardNew() {
        List<Player> result = createMockdata();
        result.sort(Comparator.comparingInt(Player::getNewTotal));
        return result;
    }


    private List<Player> createMockdata() {
        List<Player> result = new ArrayList<>();
        result.add(new Player("Mattias", "Ryd", new ScoreCard(36, 37), new ScoreCard(37, 47)));
        result.add(new Player("Linus", "Rahm", new ScoreCard(40, 40), new ScoreCard(44, 39)));
        result.add(new Player("Johan", "Rahm", new ScoreCard(34, 35), new ScoreCard(53, 54)));
        result.add(new Player("Per", "Wahlqvist", new ScoreCard(48, 41), new ScoreCard(44, 45)));
        result.add(new Player("Magnus", "Erenrot", new ScoreCard(43, 41), new ScoreCard(51, 46)));
        result.add(new Player("Daniel", "Sterner", new ScoreCard(44, 41), new ScoreCard(52, 50)));
        result.add(new Player("Felix", "Rahm", new ScoreCard(50, 49), new ScoreCard(47, 52)));
        result.add(new Player("Niclas", "Wallster", new ScoreCard(48, 44), new ScoreCard(53, 54)));
        result.add(new Player("Lasse", "Lehtiheimo", new ScoreCard(49, 49), new ScoreCard(50, 53)));
        return result;
    }
}
