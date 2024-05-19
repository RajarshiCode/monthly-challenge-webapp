package com.rajarshicode.ChallengeAppBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ChallengeController {
    private List<Challenge> challenges = new ArrayList<>();
    //check

    public ChallengeController(){
        Challenge challenge1 = new Challenge(1L, "May", "learn german");
        challenges.add(challenge1);
    }


    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){
        return challenges;
    }
}
