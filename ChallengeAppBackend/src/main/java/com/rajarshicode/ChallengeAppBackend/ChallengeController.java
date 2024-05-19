package com.rajarshicode.ChallengeAppBackend;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ChallengeController {

    //check
    private ChallengeService challengeService;
    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;

    }


    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){

        return challengeService.getAllChallenges();
    }


    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded = challengeService.addChallenge(challenge);

        // validation
        if(isChallengeAdded)
            return "Challenge added succesfully";
        else
            return "Challenge not added successfully";
    }





    @GetMapping("/challenges/{month}")
    public Challenge getChallenge(@PathVariable String month){
        Challenge challenge = challengeService.getChallenge(month);
        if (challenge != null)
            return challenge;
        else
            return null;
    }

}
