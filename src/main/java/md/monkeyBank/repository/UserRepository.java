package md.monkeyBank.repository;

import md.monkeyBank.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
