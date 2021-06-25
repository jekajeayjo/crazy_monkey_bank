package md.monkeyBank.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import md.monkeyBank.entity.UserEntity;
import md.monkeyBank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AccountsServiceImpl {

    SQLServerDataSource sqlServerDataSource;
    UserRepository userRepository;

    @Autowired
    @Qualifier("msqlDataSource")
    public void setSqlServerDataSource(SQLServerDataSource sqlServerDataSource) {
        this.sqlServerDataSource = sqlServerDataSource;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<LinkedCaseInsensitiveMap> getAccountList(Integer id) {
        List<LinkedCaseInsensitiveMap> list=null;


        try
        {
            Integer userId=userRepository.findById(id).get().getId();
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(sqlServerDataSource).withProcedureName("getAccoutById");
            SqlParameterSource in = new MapSqlParameterSource().addValue("id", userId);
            Map<String, Object> out = jdbcCall.execute(in);
            System.out.println();
            list= (List<LinkedCaseInsensitiveMap>) out.get("#result-set-1");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage()) ;
        }

        return list;
    }
}
