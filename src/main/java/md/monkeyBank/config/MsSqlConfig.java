package md.monkeyBank.config;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class MsSqlConfig {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean(name = "msSqlDataSource")
    public SQLServerDataSource getConnection() throws SQLException {
        SQLServerDataSource ods = new SQLServerDataSource();
        ods.setURL(url);
        ods.setUser(username);
        ods.setPassword(password);
        return ods;

    }

    @Bean(name = "msSqlJdbcTemplate")
    public JdbcTemplate getJdbcTemplate(@Qualifier("msSqlDataSource") SQLServerDataSource sqlServerDataSource) {
        return new JdbcTemplate(sqlServerDataSource);
    }

}
