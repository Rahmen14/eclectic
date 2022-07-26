package se.artius.eclectic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.artius.eclectic.domain.Player;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeaderboardController {

    @GetMapping("/leaderboard")
    public List<Player> leaderboard() {
        System.out.println("Skapa spelare och returnera.");
        List<Player> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
        {
            result.add(new Player("Kalle" + i, "Kula" + i));
        }
        return result;
    }


    @GetMapping("/player")
    public Player player() {
        System.out.println("Skapa spelare och returnera.");
        return new Player("Kalle", "Kula");
    }
}
