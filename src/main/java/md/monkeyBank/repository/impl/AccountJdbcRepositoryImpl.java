package md.monkeyBank.repository.impl;

import md.monkeyBank.dto.account.AccountDto;
import md.monkeyBank.repository.AccountJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountJdbcRep")
public class AccountJdbcRepositoryImpl implements AccountJdbcRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AccountJdbcRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AccountDto> getAccountById(Integer id) {
      List<AccountDto> accountDtos=  jdbcTemplate.query("execute getAccoutById ?"
                , new BeanPropertyRowMapper(AccountDto.class)
                , new Object[]{id});
        return accountDtos;
    }
}
