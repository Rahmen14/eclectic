package se.artius.eclectic.service;

import org.springframework.stereotype.Service;
import se.artius.eclectic.domain.Hole;
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
        result.add(new Player("Mattias", "Ryd", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Linus", "Rahm", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Johan", "Rahm", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Per", "Wahlqvist", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Magnus", "Erenrot", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Daniel", "Sterner", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Felix", "Rahm", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Niclas", "Wallster", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        result.add(new Player("Lasse", "Lehtiheimo", new ScoreCard(createScoreCardMasters()), new ScoreCard(createScoreCardNewCourse())));
        return result;
    }

    private List<Hole> createScoreCardMasters() {
        List<Hole> result = new ArrayList<>();
        result.add(new Hole(1, 4));
        result.add(new Hole(2, 3));
        result.add(new Hole(3, 4));
        result.add(new Hole(4, 3));
        result.add(new Hole(5, 3));
        result.add(new Hole(6, 4));
        result.add(new Hole(7, 4));
        result.add(new Hole(8, 4));
        result.add(new Hole(9, 5));
        result.add(new Hole(10, 4));
        result.add(new Hole(11, 4));
        result.add(new Hole(12, 4));
        result.add(new Hole(13, 4));
        result.add(new Hole(14, 4));
        result.add(new Hole(15, 5));
        result.add(new Hole(16, 3));
        result.add(new Hole(17, 5));
        result.add(new Hole(18, 3));
        return result;
    }

    private List<Hole> createScoreCardNewCourse() {
        List<Hole> result = new ArrayList<>();
        result.add(new Hole(1, 4));
        result.add(new Hole(2, 3));
        result.add(new Hole(3, 4));
        result.add(new Hole(4, 4));
        result.add(new Hole(5, 4));
        result.add(new Hole(6, 4));
        result.add(new Hole(7, 5));
        result.add(new Hole(8, 3));
        result.add(new Hole(9, 5));
        result.add(new Hole(10, 4));
        result.add(new Hole(11, 4));
        result.add(new Hole(12, 3));
        result.add(new Hole(13, 5));
        result.add(new Hole(14, 3));
        result.add(new Hole(15, 4));
        result.add(new Hole(16, 4));
        result.add(new Hole(17, 4));
        result.add(new Hole(18, 4));
        return result;
    }
}
