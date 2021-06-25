package md.monkeyBank.repository;

import md.monkeyBank.entity.ValuteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ValuteRepository extends JpaRepository<ValuteEntity, Integer> {
}
