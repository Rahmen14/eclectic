package se.artius.eclectic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.artius.eclectic.domain.Player;
import se.artius.eclectic.service.LeaderboardService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeaderboardController {

    private LeaderboardService service = new LeaderboardService();

    @GetMapping("/leaderboard")
    public List<Player> leaderboard() {
        System.out.println("Skapa spelare och returnera.");
        return service.getLeaderboard();
    }

    @GetMapping("/leaderboard/masters")
    public List<Player> leaderboardMasters() {
        System.out.println("Skapa spelare och returnera.");
        return service.getLeaderboard();
    }

    @GetMapping("/leaderboard/new")
    public List<Player> leaderboardNew() {
        System.out.println("Skapa spelare och returnera.");
        return service.getLeaderboard();
    }

    @GetMapping("/player")
    public Player player() {
        System.out.println("Skapa spelare och returnera.");
        return new Player("Kalle", "Kula", 1,1,1);
    }
}
