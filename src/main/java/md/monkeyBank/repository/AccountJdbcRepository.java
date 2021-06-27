package md.monkeyBank.repository;

import md.monkeyBank.dto.account.AccountDto;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountJdbcRepository {
    List<AccountDto>  getAccountById(Integer id);
}
