package se.artius.eclectic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.domain.ScoreCard;
import se.artius.eclectic.service.LeaderboardService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeaderboardController {

    private final LeaderboardService service = new LeaderboardService();

    @GetMapping("/leaderboard")
    public List<Player> leaderboard() {
        System.out.println("Returnera den totala leaderboarden.");
        return service.getLeaderboard();
    }

    @GetMapping("/leaderboard/masters")
    public List<Player> leaderboardMasters() {
        System.out.println("Returnera leaderboarden för Masters.");
        return service.getLeaderboardMasters();
    }

    @GetMapping("/leaderboard/new")
    public List<Player> leaderboardNew() {
        System.out.println("Returnera leaderboarden för Nya Banan.");
        return service.getLeaderboardNew();
    }

    @GetMapping("/player")
    public Player player() {
        System.out.println("Skapa spelare och returnera.");
        return null;
    }
}
