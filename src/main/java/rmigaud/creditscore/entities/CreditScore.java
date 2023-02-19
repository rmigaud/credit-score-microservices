package rmigaud.creditscore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
@Entity
public class CreditScore {
  @Id
  private String ssn;
  private String firstName;
  private String lastName;
  private int score;

  public CreditScore() {
  }

  public CreditScore(String ssn, String firstName,
                     String lastName, int score) {
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
    this.score = score;
  }

}
