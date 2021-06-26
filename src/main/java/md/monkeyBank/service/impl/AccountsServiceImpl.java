package md.monkeyBank.service.impl;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javassist.NotFoundException;
import md.monkeyBank.dto.account.AccountAnswerDto;
import md.monkeyBank.dto.account.AccountDto;
import md.monkeyBank.entity.UserEntity;
import md.monkeyBank.repository.UserRepository;
import md.monkeyBank.service.AccountService;
import md.monkeyBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service("accountServiceMsSql")
public class AccountsServiceImpl implements AccountService {

    JdbcTemplate jdbcTemplate;
    UserRepository userRepository;
    UserService userService;

    @Autowired
    @Qualifier("msSqlJdbcTemplate")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    @Qualifier("userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AccountAnswerDto getAccountList(Integer id) throws NotFoundException {
        AccountAnswerDto answerDto=new AccountAnswerDto();

       if( !userService.finById(id).isPresent())
       {
           answerDto.setStatus("ERROR");
           answerDto.setMessage("User is not exist");
       }
       else
       {
           answerDto.setStatus("OK");

         answerDto.setRows( jdbcTemplate.query("execute getAccoutById ?"
                   , new BeanPropertyRowMapper(AccountDto.class)
                   , new Object[]{id}));
       }

        return answerDto;
    }
}
