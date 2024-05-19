package com.rajarshicode.ChallengeAppBackend;

import java.util.ArrayList;
import java.util.List;

public class ChallengeService {

    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeService(){
        Challenge challenge1 = new Challenge(1L, "May", "learn german");
        challenges.add(challenge1);
    }

    public List<Challenge> getAllChallenges(){
        return challenges;
    }

    public boolean addChallenge(Challenge challenge){
        if (challenge != null){
            challenges.add(challenge);
            return true;
        }else {
            return false;
        }
    }

}
