package md.monkeyBank.repository;

import md.monkeyBank.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface RoleRepository  extends JpaRepository<RoleEntity, Integer> {
}
