package rmigaud.creditscore.repositories;

import rmigaud.creditscore.entities.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditScoreRepo extends JpaRepository<CreditScore, String> {
}
