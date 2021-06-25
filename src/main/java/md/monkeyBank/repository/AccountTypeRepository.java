package md.monkeyBank.repository;

import md.monkeyBank.entity.AccountTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface AccountTypeRepository extends JpaRepository<AccountTypeEntity, Integer> {
}
