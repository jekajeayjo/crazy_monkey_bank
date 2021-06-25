package md.monkeyBank.repository;

import md.monkeyBank.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface AccountRepository  extends JpaRepository<AccountEntity, Integer> {
}
