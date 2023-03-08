package rmigaud.creditscore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import rmigaud.creditscore.repositories.CreditScoreRepo;

@SpringBootTest
class CreditScoreApplicationTests {

	@Autowired
	CreditScoreRepo repo;

	@Test
	void findBySSN_ifDoesNotExist_returnNotNull() {
		assertThat(repo.findById("0")).isNotNull();
	}

}
