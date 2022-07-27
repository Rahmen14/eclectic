package se.artius.eclectic.repository;

import se.artius.eclectic.domain.Hole;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.domain.ScoreCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayerMockRepository implements PlayerRepository {

    private final HashMap<Integer, Player> players = new HashMap<>();

    public PlayerMockRepository() {
        createMockdata();
    }

    @Override
    public List<Player> getAll() {
        return new ArrayList<>(players.values());
    }

    @Override
    public Player get(int id) {
        return players.get(id);
    }

    private void createMockdata() {
        players.put(1, new Player(1, "Mattias", "Ryd", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(2, new Player(2, "Linus", "Rahm", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(3, new Player(3, "Johan", "Rahm", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(4, new Player(4, "Per", "Wahlqvist", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(5, new Player(5, "Magnus", "Erenrot", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(6, new Player(6, "Daniel", "Sterner", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(7, new Player(7, "Felix", "Rahm", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(8, new Player(8, "Niclas", "Wallster", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
        players.put(9, new Player(9, "Lasse", "Lehtiheimo", new ScoreCard(createScoreCardMasters(), 5), new ScoreCard(createScoreCardNewCourse(), 5)));
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
