package md.monkeyBank.repository;

import md.monkeyBank.entity.AccountHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface AccountHistoryRepository extends JpaRepository<AccountHistoryEntity, Integer> {
}
