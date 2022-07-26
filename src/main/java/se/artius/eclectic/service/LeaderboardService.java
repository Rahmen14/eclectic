package se.artius.eclectic.service;

import org.springframework.stereotype.Service;
import se.artius.eclectic.domain.Player;

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
        result.add(new Player("Mattias", "Ryd", 73, 84));
        result.add(new Player("Linus", "Rahm", 80, 83));
        result.add(new Player("Johan", "Rahm", 69, 107));
        result.add(new Player("Per", "Wahlqvist", 89, 89));
        result.add(new Player("Magnus", "Erenrot", 84, 97));
        result.add(new Player("Daniel", "Sterner", 85, 102));
        result.add(new Player("Felix", "Rahm", 99, 99));
        result.add(new Player("Niclas", "Wallster", 92, 107));
        result.add(new Player("Lasse", "Lehtiheimo", 98, 103));
        return result;
    }
}
