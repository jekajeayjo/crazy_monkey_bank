package md.monkeyBank.repository;

import md.monkeyBank.entity.UserDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface UserDetailRepository  extends JpaRepository<UserDetailEntity, Integer> {
}
