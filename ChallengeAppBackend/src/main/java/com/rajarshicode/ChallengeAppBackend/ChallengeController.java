package com.rajarshicode.ChallengeAppBackend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/challenges")
@CrossOrigin(origins = "http://localhost:3000/")
public class ChallengeController {

    //check
    private ChallengeService challengeService;
    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;

    }


    @GetMapping
    public ResponseEntity<List<Challenge>> getAllChallenges(){

        return new ResponseEntity<>(challengeService.getAllChallenges(),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded = challengeService.addChallenge(challenge);

        // validation
        if(isChallengeAdded)
            return new ResponseEntity<>("Challenge added succesfully.",HttpStatus.OK);
        else
            return new ResponseEntity<>("Challenge not added succesfully.",HttpStatus.NOT_FOUND);
    }





    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getChallenge(@PathVariable String month){
        Challenge challenge = challengeService.getChallenge(month);
        if (challenge != null)
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id, @RequestBody Challenge updatedChallenge){
        boolean isChallengeUpdated = challengeService.updateChallenge(id, updatedChallenge);

        if(isChallengeUpdated)
            return new ResponseEntity<>("Challenge updated succesfully.",HttpStatus.OK);
        else
            return new ResponseEntity<>("Challenge not updated succesfully.",HttpStatus.NOT_FOUND);


    }




    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean isChallengeDeleted = challengeService.deleteChallenge(id);
        if(isChallengeDeleted)
            return new ResponseEntity<>("Challenge deleted succesfully.",HttpStatus.OK);
        else
            return new ResponseEntity<>("Challenge not deleted.",HttpStatus.NOT_FOUND);


    }

}
