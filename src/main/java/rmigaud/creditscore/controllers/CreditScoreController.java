package rmigaud.creditscore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rmigaud.creditscore.entities.CreditScore;
import rmigaud.creditscore.repositories.CreditScoreRepo;


@RestController
public class CreditScoreController {
  @Autowired
  private
  CreditScoreRepo repo;

  @GetMapping("/creditscores/{ssn}")
  public CreditScore getCreditScore(@PathVariable("ssn") String ssn) {
    return repo.findById(ssn).orElse(new CreditScore("user", "not", "found",
        0));
  }
}