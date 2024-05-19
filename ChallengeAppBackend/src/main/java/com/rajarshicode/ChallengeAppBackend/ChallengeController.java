package com.rajarshicode.ChallengeAppBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ChallengeController {

    //check
    private ChallengeService challengeService;
    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;
        //commit check
        //why not once more
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

}
